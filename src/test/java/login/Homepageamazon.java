package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Homepageamazon {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		

		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.ca/gp/css/homepage.html?ref_=nav_youraccount_btn");
		
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.className("a-color-secondary"));
		act.moveToElement(element).click().build().perform();
		
		Pomhomepage page = new Pomhomepage(driver);
		page.eteremail("Roicians@gmail.com");
		page.clickcntinuebutton();
		page.typepassword("Roicians123");
		page.clickonsignin();

	}

}
