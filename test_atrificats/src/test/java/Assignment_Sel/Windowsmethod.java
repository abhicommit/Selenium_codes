package Assignment_Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsmethod {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      //driver.manage().window().minimize();
		      
		
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(3000);
		  driver.quit();

	}

}
