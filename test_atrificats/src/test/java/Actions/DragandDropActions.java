package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropActions {

	public static void main(String[] args) throws InterruptedException {
    
		
	       WebDriver  driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	       
	       driver.get("https://automationwithpiyush.vercel.app/actions.html");
	       
	       Actions act = new Actions(driver);
	       // Scroll
	       
	        
        
	       
	       //Source and Destination
	       
	     //act.scrollByAmount(0, 500).build().perform();
	       
	   
	       
	      WebElement   source = driver.findElement(By.id("prod-laptop"));
	      WebElement   dest = driver.findElement(By.id("cart-zone"));
	      
	      WebElement   s = driver.findElement(By.id("prod-phone"));
	      WebElement   d = driver.findElement(By.id("cart-zone"));
	     	      
	      WebElement   so = driver.findElement(By.id("prod-watch"));
	      WebElement   de = driver.findElement(By.id("cart-zone"));
	      
	      WebElement   s1 = driver.findElement(By.id("prod-headphones"));
	      WebElement   dest1 = driver.findElement(By.id("cart-zone"));
	     
	     
	      
	      // Drag and drop
	     
	      act.dragAndDrop(source, dest).build().perform();
	      act.dragAndDrop(s, d).build().perform();
	      act.dragAndDrop(so, de).build().perform();
	      act.dragAndDrop(s1, dest1).build().perform();
	      
	      
	      Thread.sleep(3000);
	      
	      
	      driver.quit();
	      
	}

}
