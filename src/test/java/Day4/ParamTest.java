package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest 
{
	WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
	void setup(String br,String appurl) throws Throwable
	{
    	if(br.equals("chrome"))
    	{
    		driver=new ChromeDriver();
    		
    	}else if(br.equals("edge"))
    	{
    	driver=new EdgeDriver();	
    	}else
    	{
    		driver=new FirefoxDriver();
    	
    	}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(appurl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test(priority=1)
	void testLogo()
	{
		try
		{
	boolean	status=driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='divLogin']/div[@id='divLogo']/img[1]")).isDisplayed();
	Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	@Test(priority=2)
	void testHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM","Titles are not matched.....");
	}
	@AfterClass
	void closeApp()
	{
		driver.quit();
	}
	
}
