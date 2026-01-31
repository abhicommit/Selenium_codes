package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldActions {

	public static void main(String[] args) throws InterruptedException {

       WebDriver  driver= new ChromeDriver();
       
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://automationwithpiyush.vercel.app/actions.html");
        
        Actions act= new Actions(driver);
        
          WebElement ClicknHold= driver.findElement(By.id("click-hold"));
          
          act.clickAndHold(ClicknHold).build().perform();
          
          Thread.sleep(5000);
          driver.quit();
          

	

}
	
}
