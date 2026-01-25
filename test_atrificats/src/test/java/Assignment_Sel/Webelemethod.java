package Assignment_Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelemethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      //driver.manage().window().minimize();
	      
	
	  driver.get("https://www.facebook.com/");
    
    
    By name = By.name("email");
    Thread.sleep(3000);
    
    WebElement us = driver.findElement(name);
    us.sendKeys("admin");
    
    By ps = By.name("pass");
    
    WebElement p = driver.findElement(ps);
    p.sendKeys("password");
    Thread.sleep(3000);
    
    WebElement logclr =driver.findElement(By.name("pass"));
    
    logclr.clear();
   
    
    
   
    
    
	  Thread.sleep(3000);
	  driver.quit();
	  

	}

}
