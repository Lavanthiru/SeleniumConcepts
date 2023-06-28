package Org.test;

	import java.util.Iterator;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.chrome.ChromeOptions;
    import org.openqa.selenium.support.ui.Select;

    import io.github.bonigarcia.wdm.WebDriverManager;

	public class MultiDropDown {
		public static WebDriver driver;
		
		public static void main(String[] args) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("disable-popups");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
			driver.manage().window().maximize();
			
			WebElement multiple = driver.findElement(By.xpath("//select[@id='second']"));
			
			Select s = new Select(multiple);
			
			boolean m = s.isMultiple();
			System.out.println(m);
			s.selectByIndex(0);
			s.selectByIndex(1);
			s.selectByIndex(3);
			s.deselectByVisibleText("Donut");
			
			List <WebElement> option = s.getOptions();
			System.out.println("Number of Options: " +option.size());
	        System.out.println("List of Options: ");
	        for (int i = 0; i <option.size(); i++) {
	        	WebElement S = option.get(i);
	        	String text = S.getText();
	        	System.out.println(text);
			}
			System.out.println(" ");
	        List <WebElement> option1 = s.getAllSelectedOptions();
	        System.out.println("Number of Selected options: " + option1.size());
	        System.out.println("List of Selected Options: ");
	        for (int i = 0; i < option1.size(); i++) {
	        	WebElement S1 = option1.get(i);
	        	String text1 = S1.getText();
	        	System.out.println(text1);
				
			}
	        System.out.println(" ");
	        WebElement option2 = s.getFirstSelectedOption();
	        System.out.println("First Selected Option: ");
	        	String text2 = option2.getText() ;
	        	System.out.println(text2);
	        
	         
		}
	}


