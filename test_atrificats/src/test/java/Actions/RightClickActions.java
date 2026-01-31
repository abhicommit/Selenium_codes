package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActions {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver= new ChromeDriver();
        
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://automationwithpiyush.vercel.app/actions.html");
       Actions act = new Actions(driver);
       
         WebElement right=  driver.findElement(By.id("right-click-area"));
         
         //Hover thr perticular element
         
         //act.moveToElement(right).build().perform();
         
         
         // Right Click on Element
           act.contextClick(right).build().perform();
       
       
       
       
       Thread.sleep(2000);
       
       driver.quit();       
          

	}

}
