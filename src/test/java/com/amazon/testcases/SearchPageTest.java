package com.amazon.testcases;

import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.HomePage;
import com.amazon.pages.ResultPage;
import com.amazon.pages.SearchPage;
import com.amazon.pages.SignInPage;
import com.amazon.util.TestUtil;

public class SearchPageTest extends TestBase{

	HomePage homePage;
	SearchPage searchPage;	
	TestUtil testUtil;
	ResultPage resultPage;
	SignInPage signInPage;
	
	public SearchPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
	//	testUtil = new TestUtil();
		resultPage = new ResultPage();
		homePage = new HomePage();
		searchPage = homePage.SearchProduct(prop.getProperty("product"));
	}
	
	@Test
	public void pagesearchTest(){

		Assert.assertTrue(searchPage.verifySearchResult());
		searchPage.ResultList(prop.getProperty("min"), prop.getProperty("max"));
		resultPage = searchPage.SelectItem();
	}

		
	
	@AfterMethod
	  public void tearDown(){ 
		  driver.quit(); 
		  }
	 
}
