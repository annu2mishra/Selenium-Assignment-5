package com.ibm.SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FaceBookLogin {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
			WebElement emailEle= driver.findElement(By.xpath("//input[@id='email']"));
			emailEle.sendKeys("mishra@gmail.com");
			
			WebElement passEle= driver.findElement(By.xpath("//input[@id='pass']"));
			passEle.sendKeys("summer@123");

			
			WebElement loginEle= driver.findElement(By.xpath("//input[@value='Log In']"));
			loginEle.click();
			
	}

}
