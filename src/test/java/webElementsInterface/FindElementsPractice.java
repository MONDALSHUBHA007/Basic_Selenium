package webElementsInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888");
		
		WebElement usernameEle=driver.findElement(By.name("user_name"));
		usernameEle.sendKeys("admin");
	
		WebElement passwordEle=driver.findElement(By.name("user_password"));
		passwordEle.sendKeys("admin");
	
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.linkText("Organizations")).click();
	
	List<WebElement> list=driver.findElements(By.xpath("//input[@name='selected_id']"));
	
	for(WebElement element:list) {
		element.click();
		Thread.sleep(1000);
	}
	}

}
