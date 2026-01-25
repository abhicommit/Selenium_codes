package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      
	      // Using CSS selector as id
	      driver.findElement(By.cssSelector("#email")).sendKeys("admin");
	      
	      //Using  as whole CSS Selector
	      driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("password");
	      
	      
	      //Using  as  CSS class
	      
	      //driver.findElement(By.cssSelector("._6lth")).click();
	      
	      // Using CSS selector as parent and child tag
	      
	      driver.findElement(By.cssSelector("div button")).click();
	      
	      
	      Thread.sleep(50000);
	      
	      
	      driver.quit();
	  
	}

}

