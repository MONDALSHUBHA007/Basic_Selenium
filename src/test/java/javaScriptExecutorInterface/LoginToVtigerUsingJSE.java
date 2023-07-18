package javaScriptExecutorInterface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class LoginToVtigerUsingJSE {

	public static void main(String[] args) throws IOException {
		//Step 1: launch the browser
		WebDriver driver=new ChromeDriver();
        
    //Step 2: maximize the window
		driver.manage().window().maximize();
		
    //Step 3: load the URL- Demo Vtiger app
		driver.get("http://localhost:8888/");
		
		//identify all the elements
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		System.out.println("Home Page displayed");
		
		//take screenshot of home page
		
		//Step 1:cast the TakeScreenShot interface to the driver
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//Step 2:call getScreenShot as method
		File srcLocation = ts.getScreenshotAs(OutputType.FILE);
		
		//Step 3:create a folder to store the screenshots
		File destLocation = new File("/Selenium.1.1.1/Screenshots");
		
		//Step 4: copy the screenshot from src to dest
	Files.copy(srcLocation,destLocation); //Files class is used from common io
	
	System.out.println("Screenshot taken");
	}

	

	

}
