package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amzstarthere {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		

		WebDriver driver= new FirefoxDriver();

		driver.get("https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		//Actions mouse = new Actions(driver);
		//WebElement mainmenu = driver.findElement(By.cssSelector("#nav-link-accountList > span"));
		//Thread.sleep(20);
		//mouse.moveToElement(mainmenu).moveToElement(driver.findElement(By.name("Start here."))).click().build().perform();
		//mouse.moveToElement(driver.findElement(By.id("createAccountSubmit"))).click().build().perform();
		//WebElement submenu = driver.findElement(By.className("a-button-text"));
		//mouse.moveToElement(submenu).click().build().perform();
		
		//driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        
		Pomstarthere start = new Pomstarthere(driver);
		start.typeyourname("Roicians");
		start.typemnumber("Qualityanalyst015@gmail.com");
		start.typepswd("Roicians123");
		start.typepswdagain("Roicians123");
		start.clickcontinue();
		
		
		
	}

}
