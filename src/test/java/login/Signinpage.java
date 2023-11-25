package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signinpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecho.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.roicians.com/contact-us/");
		
		driver.findElement(By.id("text-77525447616"));
		
		/*
		 * //implicit wait
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //explicit
		 * wait
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "text-77525447616")));
		 */
		
		//Mouse hover
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"premium-nav-menu-item-65\"]/a"))).build().perform();
		driver.findElement(By.linkText("SOFTWARE TESTING")).click();
		
		/*//dropdown
		
		Select obj = new Select(driver.findElement(By.id("")));
		obj.selectByVisibleText("");
		
		// double click operation
		
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.id(""));
		actions.doubleClick(element).perform();
		
		//right click
		
		Actions rc = new Actions(driver);
		WebElement rightclick = driver.findElement(By.id(""));
		rc.contextClick(rightclick).perform();
		
		//visibilty commands in selenium
		
	//isDisplayed: it returns true if the web element is displayed on the webpage
	//isEnabled : it returns true if the element is enabled on the webpage
	//isSelected: it is used on dropdowns, radio buttons
		
		//mouse hover
		
		Actions mouse = new Actions(driver);
		WebElement mainmenu = driver.findElement(By.id(""));
		mouse.moveToElement(mainmenu).moveToElement(driver.findElement(By.id(""))).click().build().perform();
		
	}*/

}
