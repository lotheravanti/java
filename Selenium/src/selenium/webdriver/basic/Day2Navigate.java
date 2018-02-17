package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Navigate {

	WebDriver driver;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Stuff\\Studies\\Selenium\\chromedriver.exe");		
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			Navigate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void Navigate() {
		
		try {

			driver.navigate().to("http://www.flipkart.com");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			driver.findElement(By.xpath("//span[starts-with(text(), 'TVs & Appliances')]")).click();
			Thread.sleep(100);
			driver.findElement(By.xpath("//span[contains(text(),'Microwave Ovens')]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();			
			driver.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		Day2Navigate myObj = new Day2Navigate();
		myObj.invokeBrowser();
		
	}
	
}