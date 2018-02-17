package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	WebDriver driver;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Stuff\\Studies\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("http://www.edureka.co");
			searchCourse();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void searchCourse() {
		String input = "Java";
		driver.findElement(By.id("homeSearchBar")).sendKeys(input);
		driver.findElement(By.id("homeSearchBar")).sendKeys(Keys.RETURN);
	}
	
	public static void main(String[] args) {
		
		Day1 myObj = new Day1();
		myObj.invokeBrowser();

	}

}
