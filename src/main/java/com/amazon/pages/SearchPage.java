package com.amazon.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class SearchPage extends TestBase{

	@FindBy(xpath = "(//h1//span[contains(@class,'text')])[1]")
	WebElement searchResult;
	
	@FindBy(xpath = "//input[@id='low-price']")
	WebElement MinPrice;
	
	@FindBy(xpath = "//input[@id='high-price']")
	WebElement MaxPrice;
	
	@FindBy(xpath = "//input[@aria-labelledby='a-autoid-1-announce']")
	WebElement Gobutton;
	
	@FindBy(xpath = "(//div[@class='puisg-col-inner']//h2//a[contains(@class,'a-link-normal')])[3]")
	WebElement firstProduct;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifySearchResult(){
		return searchResult.isDisplayed();
	}
	
	public void ResultList(String min, String max){
		MinPrice.sendKeys(min);
		MaxPrice.sendKeys(max);
		
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", Gobutton);
		  	}
	
	public ResultPage SelectItem(){
		firstProduct.click();
		
		return new ResultPage();
	}
}
