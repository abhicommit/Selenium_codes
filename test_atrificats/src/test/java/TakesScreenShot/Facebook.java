package TakesScreenShot;


import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook {

	public static void main(String[] args) throws IOException {
	

		    WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    
		    driver.get("https://www.w3schools.com/");
		    
		    // Perform down casting to use the takes screenshot method
		    
		    TakesScreenshot  tks= (TakesScreenshot) driver;
		    
		    // File Source to get screemshots
		    
		    File source = tks.getScreenshotAs(OutputType.FILE);
		    
		    
		    File Destination= new File("C:\\Users\\DELL\\Pictures\\Saved Pictures\\Amz.jpg");
		    
		    
		    // To copy Screenshot into destination folder
		     FileHandler.copy(source, Destination);
            
		    
		    driver.quit();

			}

		


	}


