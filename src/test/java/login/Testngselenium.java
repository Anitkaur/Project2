package login;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Testngselenium {
WebDriver driver;

	@BeforeSuite
	public void setproperty() {
		
		//no need to add this pr file because project is Maven
		System.setProperty("webdriver.gecko.driver", ".//geckodriver.exe");
		
	}
	
	
	@BeforeMethod
	public void openbrowser() {
		driver = new FirefoxDriver();
	
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void enterdata() throws Exception {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input")));
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Roicians");
		Thread.sleep(30);
		
	}
	
	
	//parameterization
	
	
	
	  @DataProvider(name="getdata")
	  public Object[][] data(){
		  return new Object[][]{{"Roicians"},{"Roicians Tech"},{"Roicians QA"}};
	  
	  }
	  
	  @Test(dataProvider="getdata") 
	  public void Display(String names) {
	  driver.findElement(By.cssSelector("#APjFqb")).sendKeys(names); }
	 
	 
	
	
	  @Test public void gettitle() { String Title = driver.getTitle();
	  System.out.println(Title); }
	  
	  
	  
	  @Test public void linkdisplayed() { Boolean result =
	  driver.findElement(By.linkText("Gmail")).isDisplayed();
	  System.out.println(result); }
	 
	 
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
}
