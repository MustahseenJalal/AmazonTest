package com.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.HomePage;
import com.amazon.pages.SearchPage;

public class HomePageTest extends TestBase{

	HomePage homePage;
	SearchPage searchPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
	}
	
	@Test
	public void SearchProductTest() {
		searchPage = homePage.SearchProduct(prop.getProperty("product"));
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
