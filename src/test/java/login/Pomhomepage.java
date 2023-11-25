package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomhomepage {

	WebDriver driver;
	
	@FindBy(id="ap_email") WebElement entermail;
	@FindBy(id="continue") WebElement continuebutton;
	@FindBy(id="ap_password") WebElement password;
	@FindBy(id="signInSubmit") WebElement signinbutton;
	
	public Pomhomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void eteremail(String entremail) {
		entermail.sendKeys(entremail);
	}
	
	public void clickcntinuebutton() {
		continuebutton.click();
	}
	
	public void typepassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickonsignin() {
		signinbutton.click();
	}
	
}
