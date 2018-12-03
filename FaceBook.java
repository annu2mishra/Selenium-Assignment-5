package com.ibm.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	
	WebElement firstNameEle=driver.findElement(By.xpath("//input[@name='firstname']")); 
	firstNameEle.sendKeys("mishra"); 
	
	WebElement lastNameEle=driver.findElement(By.xpath("//input[@name='lastname']")); 
	lastNameEle.sendKeys("mishra"); 
	
 
	WebElement emailIdEle=driver.findElement(By.xpath("//input[@name='reg_email__']")); 
	emailIdEle.sendKeys("mishra@gmail.com"); 
	
	
	WebElement emailidConEle=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")); 
	emailidConEle.sendKeys("mishra@gmail.com"); 

	
	WebElement passWordEle=driver.findElement(By.xpath("(//input[@type='password'])[2]")); 
	passWordEle.sendKeys("summer@123"); 
	
	
	WebElement birthDay=driver.findElement(By.xpath("//*[@name='birthday_day']")); 
	Select select=new Select(birthDay); 
	select.selectByValue("10"); 
	
	WebElement birthdayMonth=driver.findElement(By.xpath("//*[@name='birthday_month']")); 
	Select select1=new Select(birthdayMonth); 
	select1.selectByValue("4"); 

	WebElement birthdayYear=driver.findElement(By.xpath("//*[@name='birthday_year']")); 
	Select select2=new Select(birthdayYear); 
	select2.selectByValue("1997");
	
	WebElement genDerEle=driver.findElement(By.xpath("(//*[@name='sex'])[1]")); 
	genDerEle.click(); 

	WebElement signUpEle=driver.findElement(By.xpath("(//button[@type='submit'])[1]")); 
	signUpEle.click(); 
	
	System.out.println("Test Case Pass"); 
	} 
	

	
		
		
		
		
		
		
	}


