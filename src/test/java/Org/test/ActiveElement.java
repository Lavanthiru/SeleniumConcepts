package Org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElement {
	
	public static WebDriver driver;

public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		
        WebElement firstname =driver.findElement(By.xpath("//input[@id='firstName']"));
	      	
	      if(firstname.equals(driver.switchTo().activeElement()))
	         System.out.println("Element is focused");
	      else
	         System.out.println("Element is not focused");
	      driver.close();
	   }
	}

