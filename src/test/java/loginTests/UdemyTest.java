package loginTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class UdemyTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.udemy.com/");
	  driver.manage().window().maximize();
		/*
		 * driver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();
		 * driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
		 * driver.findElement(By.name("password")).sendKeys("admin12");
		 * driver.findElement(By.name("submit")).click();
		 * 
		 * boolean x=driver .findElement(By.
		 * xpath("//div[contains(text(),'You have exceeded the maximum number of requests p')]"
		 * )) .isDisplayed();
		 */
	  
	  Assert.assertEquals(driver.getTitle(),"Online Courses - Learn Anything, On Your Schedule | Udemy");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
			driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() throws Exception{
	  Thread.sleep(3000);
	  driver.quit();
  }

}
