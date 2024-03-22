package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.base.TestBase;

public class SignInPage extends TestBase{

	//@FindBy(xpath ="//input[@type='email']" )
	//WebElement usName;
	
	//@FindBy(xpath ="//input[@id='continue']" )
	//WebElement continuebtn;
	
	/*
	 * @FindBy(xpath ="//input[@type='password']" ) WebElement pswrd;
	 * 
	 * @FindBy(xpath ="//input[@id='signInSubmit']" ) WebElement signIn;
	 */
	//@FindBy(xpath ="(//span[contains(text(),'Use this address ')])[2]]" )
	//WebElement useAddress;
	
	public void signIn(String username, String password) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		//usName.sendKeys(username);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		//continuebtn.click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		//pswrd.sendKeys(password);
		//signIn.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[6]")).click();

		//useAddress.click();
	}
	
}
