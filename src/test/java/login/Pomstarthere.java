package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomstarthere {

WebDriver driver;
	
	@FindBy(id="ap_customer_name") WebElement Yname;
	@FindBy(id="ap_email") WebElement mnumber;
	@FindBy(id="ap_password") WebElement pswd;
	@FindBy(id="ap_password_check") WebElement pswdagain;
	@FindBy(id="continue") WebElement cntinue;
	
	
	
	public Pomstarthere(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void typeyourname(String yourname) {
		Yname.sendKeys(yourname);
	}
	
	public void typemnumber(String mobnumber) {
		mnumber.sendKeys(mobnumber);
	}
	
	public void typepswd(String password) {
		pswd.sendKeys(password);
	}
	
	public void typepswdagain(String passwordagain) {
		pswdagain.sendKeys(passwordagain);
	
	}
	
	public void clickcontinue() {
		cntinue.click();
	}
	

		
	
	
}
