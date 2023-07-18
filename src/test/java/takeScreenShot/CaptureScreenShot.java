package takeScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) {
		public static void main(String[] args) {
			//Step 1: launch the browser
			WebDriver driver=new ChromeDriver();
	        
	    //Step 2: maximize the window
			driver.manage().window().maximize();
			
	    //Step 3: load the URL- Demo Vtiger app
			driver.get("http://localhost:8888/");
			
			//identify all the elements
			driver.findElement(By.name("user_name").sendKeys("admin"));
			driver.findElement(By.name("password").sendKeys("manager"));
			driver.findElement(By.id("submit").click());
		}
	}

}
