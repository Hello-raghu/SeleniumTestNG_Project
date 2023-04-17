package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
	  driver=new ChromeDriver();
	}
	@Test(dataProvider="dp")
	void testlogin(String uid ,String pwd)
	{
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("txtUsername")).sendKeys(uid);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
		
		String exp_title="Admin";
		String act_title=driver.getTitle();
		Assert.assertEquals(exp_title, act_title);
		
		
	}
	@AfterClass
	void tearDown()
	{
	 driver.close();	
	}
	@DataProvider(name="dp",indices = {0,3})
	  String[][] loginData()
	{
		String data[][]= {
				
				{"Admin","Qedge123!@#"},
				{"Admin","abc123"},
				{"123","pqr123"},
				{"abc","xyz123"}
				
		};
		return data;
	}
	
}
