package Day2;


import org.testng.annotations.*;

public class AnnotationsDemo1 
{
    @BeforeMethod
	void login() 
	{
	System.out.println("login...");	
	}
    @Test(priority=1)
	void search()
	{
    System.out.println("search...");		
	}
    @Test(priority=2)
	void advacedSearch()
	{
    System.out.println("advancedsearch...");		
	}
    @AfterMethod
	void logout()
	{
    System.out.println("logout...");			
	}
}
