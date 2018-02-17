package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2ElementLocator {

	WebDriver driver;
	
	public void invokeBrowser(String url) {
		
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Stuff\\Studies\\Selenium\\chromedriver.exe");		
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get(url);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void elementLocateAmazon() {
		
		try {

			invokeBrowser("http://www.amazon.in");
			driver.findElement(By.partialLinkText("Customer")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.linkText("Your Amazon.in")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo laptops");	
			driver.findElement(By.className("nav-input")).click();
			Thread.sleep(2000);
			driver.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void elementLocateFacebook() {
		
		try {

			invokeBrowser("http://www.facebook.com");
			driver.findElement(By.name("firstname")).sendKeys("Lother");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input#email")).sendKeys("Lother@mail.com");
			Thread.sleep(2000);			
			driver.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		Day2ElementLocator obj = new Day2ElementLocator();
		obj.elementLocateAmazon();		
		obj.elementLocateFacebook();
	}
	
}