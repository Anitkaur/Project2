package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactuspage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		//Step 2 to type url

		WebDriver driver= new ChromeDriver();

		driver.get("https://www.roicians.com/contact-us/");
		
		Pomforcontactus obj = new Pomforcontactus(driver);
		obj.typefirstname("Anit");
		obj.typelastname("Kaur");
		obj.typeemail("anit@gmail.com");
		
	

	}

}
