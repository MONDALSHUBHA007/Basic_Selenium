package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
        //To launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Chrome browser launched");
		
		//to maximize the window
		driver.manage().window().fullscreen();
		
		//To launch firefox browser
		//FirefoxDriver driver1=new FirefoxDriver();
		//System.out.println("Firefox is launched");
		
		//To Load URL
		driver.get("https://mail.google.com");
		System.out.println("Gmail is loaded");
		
		//To capture the page title:
		String title = driver.getTitle();
		System.out.println("Page Title is--->"+title);
		
		//to capture the current url
		String url=driver.getCurrentUrl();
		System.out.println("Current url is-->"+url);
		
		//to capture the current webpage source code
		//String sourcecode=driver.getPageSource();
		//System.out.println("Page source is-->"+sourcecode);
		
		//To capture the session ID
		String id=driver.getWindowHandle();
		System.out.println("session id of current page is-->"+id);
		
		Thread.sleep(2000);
		//to close the browser
		//driver.close();
		//System.out.println("Browser is closed");
		
	     //to close all the pages
		driver.quit();
		System.out.println("All pages closed");
			
	}

}
 