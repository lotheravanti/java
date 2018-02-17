package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Get {

	WebDriver driver;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Stuff\\Studies\\Selenium\\chromedriver.exe");		
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			getCommands();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void getCommands() {
		
		try {
			driver.get("http://www.amazon.in");
			String titleOfThePage = driver.getTitle();
			System.out.println("Title of the page is: " + titleOfThePage);
			driver.findElement(By.linkText("Today's Deals")).click();
			String currentUrl = driver.getCurrentUrl();
			System.out.println("The current URL is: " + currentUrl);
			System.out.println("The current page source is: " + driver.getPageSource());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		Day2Get myObj = new Day2Get();
		myObj.invokeBrowser();
		
	}
	
}