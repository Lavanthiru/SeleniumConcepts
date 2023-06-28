package Org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-popups");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		List<WebElement> iFrame = driver.findElements(By.tagName("iframe"));
		System.out.println(iFrame.size());
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().parentFrame();
		WebElement d = driver.findElement(By.xpath("//b[text()='Topic :']"));
		String text = d.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		String S = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println(S);
		
		Thread.sleep(2000);
		driver.close();		
		
		
		
		
		 
	 }

}
