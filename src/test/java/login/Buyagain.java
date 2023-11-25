package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Buyagain {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		

		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/gp/your-account/order-history?ref_=ya_d_c_yo");
		
		Actions buy = new Actions(driver);
		WebElement again = driver.findElement(By.className("a-link-normal"));
		buy.moveToElement(again).click().build().perform();
		
		driver.findElement(By.className("a-button-input"));
		
		driver.navigate().back();
		
		WebElement info = driver.findElement(By.id("a-autoid-3-announce"));
		buy.moveToElement(info).click().build().perform();
		
		driver.close();
		
		
		

	}

}
