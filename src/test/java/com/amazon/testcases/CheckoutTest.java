package com.amazon.testcases;

import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.HomePage;
import com.amazon.pages.ResultPage;
import com.amazon.pages.SearchPage;
import com.amazon.pages.SignInPage;
import com.amazon.util.TestUtil;

public class CheckoutTest extends TestBase{

	HomePage homePage;
	SearchPage searchPage;	
	TestUtil testUtil;
	ResultPage resultPage;
	SignInPage signInPage;
	SearchPageTest search;
	
	public CheckoutTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
	//	testUtil = new TestUtil();
		resultPage = new ResultPage();
		homePage = new HomePage();
		searchPage = homePage.SearchProduct(prop.getProperty("product"));
		Assert.assertTrue(searchPage.verifySearchResult());
		searchPage.ResultList(prop.getProperty("min"), prop.getProperty("max"));
		resultPage = searchPage.SelectItem();
	}
	
	
	@Test
	public void addToCartLoginTest() {
		signInPage = resultPage.addToShoppingCart();
		signInPage.signIn(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	  public void tearDown(){ 
		  driver.quit(); 
		  }
}
