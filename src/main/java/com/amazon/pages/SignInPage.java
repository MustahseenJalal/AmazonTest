package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.base.TestBase;

public class SignInPage extends TestBase{

	@FindBy(xpath ="//input[@type='email']" )
	WebElement usName;
	
	@FindBy(xpath ="//input[@id='continue']" )
	WebElement continuebtn;
	
	@FindBy(xpath ="//input[@type='password']" )
	WebElement pswrd;
	
	@FindBy(xpath ="//input[@id='signInSubmit']" )
	WebElement signIn;
	
	@FindBy(xpath ="(//span[contains(text(),'Use this address ')])[2]]" )
	WebElement useAddress;
	
	public void signIn(String username, String password) {
		
		usName.sendKeys(username);
		continuebtn.click();
		pswrd.sendKeys(password);
		signIn.click();
		
		useAddress.click();
	}
	
}
