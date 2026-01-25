package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PortionSS {

	public static void main(String[] args) throws IOException {

     WebDriver driver= new ChromeDriver();
     
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://market99.com/");
      
      
       WebElement  sec =driver.findElement(By.xpath("//h2[text()='Republic Special Picks']"));
    		   
       File source = sec.getScreenshotAs(OutputType.FILE);
	    
	    
	    File Destination= new File("C:\\Users\\DELL\\Pictures\\Saved Pictures\\Market99.jpg");
	    
	    
	    // To copy Screenshot into destination folder
	     FileHandler.copy(source, Destination);
       

	}

}
