package Org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		a.dismiss();
		
	    driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	    String S = a.getText();
		System.out.println(S);
		a.sendKeys("Welcome");
		a.accept();
		Thread.sleep(2000);
		driver.close();
		
	
		
	}
}
