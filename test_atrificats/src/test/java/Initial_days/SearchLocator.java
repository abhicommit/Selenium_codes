package Initial_days;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchLocator {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.getTitle();
       
       driver.get("https://www.facebook.com/");
       
        By id=By.id("email");
        Thread.sleep(3000);
        
        WebElement un = driver.findElement(id);
        un.sendKeys("admin");
        
        By pid = By.id("pass");
        
        WebElement pwd = driver.findElement(pid);
        pwd.sendKeys("password");
        
        By linktext = By.linkText("Forgotten password?");
        
        WebElement link = driver.findElement(linktext);
        link.click();
        Thread.sleep(3000);
        
       // WebElement Plink = driver.findElement(By.partialLinkText("F"));
      //  Plink.click();
       // Thread.sleep(3000);
        
        driver.quit();        
	}

}
