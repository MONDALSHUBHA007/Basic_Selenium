package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class NotificationPopUp {

	public static void main(String[] args) {
     
		//browser setting
		ChromeOptions op = new ChromeOptions(); 
		op.addArguments("--disable-notifications"); //"-- " is the invoking argument in string
      
    //Launching a browser
		WebDriver driver=new ChromeDriver();
	//maximize the window
		driver.manage().window().maximize();
		//wait for 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Load the application
		driver.get("https://yatra.com");
	}

}
