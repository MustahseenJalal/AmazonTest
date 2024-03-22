package com.amazon.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.base.TestBase;

public class ResultPage extends TestBase{

	
	public SignInPage addToShoppingCart() throws InterruptedException {

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
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@id='attach-desktop-sideSheet']//div[@id='attach-accessory-pane']//span[@id='attach-sidesheet-checkout-button']//input[@class='a-button-input']")).click();
    
        Thread.sleep(10000);

       
        }

        }
       return new SignInPage(); 
    }
	
	
}
