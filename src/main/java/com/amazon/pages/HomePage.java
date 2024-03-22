package com.amazon.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(id = "twotabsearchtextbox")
	WebElement SearchTextBox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement SearchButton;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		}
	
	
	public SearchPage SearchProduct(String product){
		SearchTextBox.sendKeys(product);
		
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", SearchButton);
		    	
		return new SearchPage();
	}	
}
