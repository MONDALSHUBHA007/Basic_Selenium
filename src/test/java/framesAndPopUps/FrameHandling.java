package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) {
		//Step 1: launch the browser
		WebDriver driver=new ChromeDriver();
        
    //Step 2: maximize the window
		driver.manage().window().maximize();
	
	//Step 3: wait for 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
    //Step 4: load the URL- Demo Vtiger app
		driver.get("https://jqueryui.com/droppable/");
		
		//Step 5:Handle the frame
		driver.switchTo().frame(0);
		System.out.println("Switched the control to frame");
		
		//Step 6: identify drag and drop element
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	
	//Step 7: perform drag and drop action
	Actions act=new Actions(driver);   //Actions is a class whereas Action is an interface
	act.dragAndDrop(drag, drop).perform();
	System.out.println("drag and drop successful");
	
	//Step 8: Switch the control back to main page
	driver.switchTo().defaultContent();
	System.out.println("Switched the control to main page");
	
	//Step 9: Click on accept link outside the frame:
	
	}

}
