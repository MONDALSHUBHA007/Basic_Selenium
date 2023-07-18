package pomClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActitimeApp {

	public static void main(String[] args) throws Throwable  {

		 //Launching a browser
		WebDriver driver=new ChromeDriver();
	//maximize the window
		driver.manage().window().maximize();
		//wait for 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the url to login to actitime
		driver.get("https://demo.actitime.com/login.do");
		
//		driver.findElement(By.className("textfield")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.id("loginButton")).click();
		
		//Read username & password from property file
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		Properties p=new Properties();
		p.load(fis);
		String username=p.getProperty("username");
		String password=p.getProperty("password");
		
		//Login to app using POM class
		
		
	}

}
