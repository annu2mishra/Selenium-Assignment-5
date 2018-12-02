package com.ibm.SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopping {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jcpenney.com/");
		
		 WebElement continueEle= driver.findElement(By.xpath("//*[text()='Continue Shopping']"));
		 continueEle.click();
		 WebElement searchEle = driver.findElement(By.name("searchTerm"));
		 searchEle.sendKeys("shirts");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.className("btn_searchForm")).click();
		
		WebElement selectEle= driver.findElement(By.xpath("//ul[@class='productList']/li[1]/div[1]/a/img"));
		selectEle.click();
		
		WebElement selectsizeEle= driver.findElement(By.name("SIZE"));
		selectsizeEle.click();
		
		driver.findElement(By.xpath("(//select[@name='SIZE'])/option[2]")).click();
		
		
		WebElement colorsizeEle= driver.findElement(By.xpath("//img[@title='Blooming Blue']"));
		colorsizeEle.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='add to bag']")).click();
		
		driver.switchTo().frame("modalIframe");
		WebElement checkoutEle= driver.findElement(By.xpath("//input[@value='CHECKOUT']"));
		checkoutEle.click();
		driver.switchTo().defaultContent();

		
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
	}

}
