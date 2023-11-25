package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomforcontactus {
	WebDriver driver;
	
	@FindBy(id="text-77525447616") WebElement fname;
	@FindBy(id="text-95374915097") WebElement lname;
	@FindBy(id="text-27022866830") WebElement email;
	
	public Pomforcontactus(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void typefirstname(String firstname) {
		fname.sendKeys(firstname);
	}
	
	public void typelastname(String lastname) {
		lname.sendKeys(lastname);
	}
	
	public void typeemail(String eemail) {
		email.sendKeys(eemail);
	}
	

}
