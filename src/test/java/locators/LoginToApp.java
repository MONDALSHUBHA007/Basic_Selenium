package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApp {

	public static void main(String[] args) {

	//Step 1: launch the browser
		WebDriver driver=new ChromeDriver();
        
    //Step 2: maximize the window
		driver.manage().window().maximize();
		
    //Step 3: load the URL- Demo Vtiger app
		driver.get("http://localhost:8888");
	}

}
