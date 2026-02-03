package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeyAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.facebook.com/");
		
		// create Action class
		
		Actions act = new Actions(driver);
		
		//Select First Name placholder
		
		// Enter Name i First name
				
				act.sendKeys("Abhishek").perform();
				
				act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		
			
				/// tab
			act.sendKeys(Keys.TAB).build().perform();
	
		
		
		act.sendKeys("Paswan").build().perform();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	

}
