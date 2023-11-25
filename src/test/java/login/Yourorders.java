package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Yourorders {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		

		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.ca/gp/css/homepage.html?ref_=nav_youraccount_btn");
		
		driver.findElement(By.className("a-box-inner")).click();
		
		Actions move = new Actions(driver);
		WebElement buyagain = driver.findElement(By.className("a-link-normal"));
		move.moveToElement(buyagain).click().build().perform();
		
		//driver.get("https://www.amazon.ca/gp/your-account/order-history?ref_=ya_d_c_yo");
		
		
		
	}

}
