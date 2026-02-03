package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderRangeActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	       
	       driver.get("https://automationwithpiyush.vercel.app/actions.html");
	       
	       Actions act = new Actions(driver);
	       
	       WebElement range= driver.findElement(By.id("pulse-slider"));
	        act.click(range).build().perform();
	        
	        act.moveToElement(range).moveByOffset(350, 0).click().build().perform();
	        
	        Thread.sleep(2000);
	        
	       act.moveToElement(range).moveByOffset(-308, 0).click().build().perform();
	       
	       
	       Thread.sleep(2000);
	       
	      
	       
	      // act.dragAndDropBy(range, 130, 1553).build().perform();
	       
	       
	       
	       // Hover Slider
	       
	      // act.moveToElement(range, 20, 20).build().perform();
	       
	       
	       

	     act.moveToElement(range).moveByOffset(350, 0).click().build().perform();
	       
	       Thread.sleep(3000);
	       driver.quit();
	}

}
