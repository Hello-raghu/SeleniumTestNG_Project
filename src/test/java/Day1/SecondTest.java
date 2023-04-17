package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest
{
	WebDriver driver;
	//@BeforeClass
    @Test(priority=1)
	void openApp()
	{
	System.setProperty("webdriver.chrome.driver", "chromeDriver.exe");	
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}
    @Test(priority=2)
	void login()
	{
	 driver.findElement(By.name("username")).sendKeys("Admin");	
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
	}
  //  @AfterClass
    @Test(priority=3)
	void close()
	{
		driver.quit();
	}
}
