package com.amazon.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.base.TestBase;

public class ResultPage extends TestBase{

	//@FindBy(xpath="(//span[@id='attach-sidesheet-checkout-button']//input)[1]")
	//WebElement checkout;
	
	public SignInPage addToShoppingCart() {

		String parent=driver.getWindowHandle();
        Set<String>s=driver.getWindowHandles();
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {

        String child_window=I1.next();
        if(!parent.equals(child_window))
        {
        driver.switchTo().window(child_window);
    
        driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
       // driver.switchTo().frame("iframeName");
        //driver.findElement(By.xpath("//span[@id='attach-sidesheet-checkout-button']//input")).click();
        
        driver.findElement(By.xpath("(//span[@id='attach-sidesheet-checkout-button']//input)[1]")).click();
      // checkout.click();
       // driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();

        
        }

        }
       return new SignInPage(); 
    }
	
	
}
