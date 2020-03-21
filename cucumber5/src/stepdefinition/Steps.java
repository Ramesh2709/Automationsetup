package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	
	@Given("^Open the application$")
	public void Open_the_application() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\driver file\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4");
		Thread.sleep(1000);
		}

	@When("^Enter the Username and Password$")
public void Enter_the_Username_and_Password() throws Exception
{	
	driver.findElement(By.name("uid")).sendKeys("harry");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("1234567890");
	Thread.sleep(2000);
	
}
	
	@When("^Enter the Username as (-?\\d+) and Password as (-?\\d+) $")
	public void Enter_the_Username_as_and_Password_as(int arg1,int arg2) throws Exception
	{	
		driver.findElement(By.name("uid")).sendKeys(Integer.toString(arg1));
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(Integer.toString(arg2));
		Thread.sleep(2000);
		
	}

	@Then("^Reset the Credential$")
public void Reset_the_Credential() throws InterruptedException
{	
	driver.findElement(By.name("btnReset")).click();
	Thread.sleep(8000);
	driver.close();
	}
	
}
