package Initial_days;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver   driver = new ChromeDriver();
		 //driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.name("username")).sendKeys("abhixms");
		driver.findElement(By.name("password")).sendKeys("Pkoc@6802");
	 WebElement  loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		Thread.sleep(30000);
		
		System.out.println("User Logged in Sucessfully");
		
	    driver.quit();
		
		
		
		

	}

	private static void thred(int i) {
		// TODO Auto-generated method stub
		
	}

}
