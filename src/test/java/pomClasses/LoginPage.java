package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a pom class for login page of Actitime application 
 * @author HP
 */

public class LoginPage {
   //Rule 1: Create a separate pom class for every web page
   //Rule 2: identify the webelements of this page using @FindBy,@FindBys,@FindAll
	 
	@FindBy(id="username")
	private WebElement userNameEdt;
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	private WebElement loginLink;
	
	//Rule 3: Create a constructor to initialize the webElements
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);//current driver reference
	}

	//Rule 4: Provide getters to access the webElements.
	
	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
	
		 
}
