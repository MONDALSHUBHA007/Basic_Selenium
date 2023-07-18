package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		/*app url-->the-internet.herokuapp.com/basic_auth
		 * app authentication username-->admin
		 * app authentication password-->admin
		 */
		/*https://admin:admin@the-internet.herokuapp.com/basic_auth*/
		 
		
		
		 //Launching a browser
		WebDriver driver=new ChromeDriver();
	//maximize the window
		driver.manage().window().maximize();
		//wait for 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Load the application
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		   /*or it can be handled using robot class or autoIt*/
	}

}
