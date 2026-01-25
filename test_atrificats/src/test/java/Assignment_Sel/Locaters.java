package Assignment_Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      //driver.manage().window().minimize();
	      
	
	  driver.get("https://www.facebook.com/");
	  
	//  By id=By.id("email");
     // Thread.sleep(3000);
	  
	  //WebElement un = driver.findElement(id);
      //un.sendKeys("admin");
      
      
     // By pid = By.id("pass");
      
     // WebElement pwd = driver.findElement(pid);
     // pwd.sendKeys("password");
      
      
      By name = By.name("email");
      Thread.sleep(3000);
      
      WebElement us = driver.findElement(name);
      us.sendKeys("admin");
      
      By ps = By.name("pass");
      
      WebElement p = driver.findElement(ps);
      p.sendKeys("password");
      
      WebElement log =driver.findElement(By.name("login"));
      log.click();
      
	  Thread.sleep(3000);
	  driver.quit();

	}

}
