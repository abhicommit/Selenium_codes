package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {

     WebDriver  driver=new ChromeDriver();
     
       driver.manage().window().maximize();
       
       driver.get("https://www.instagram.com/");
       
       driver.findElement(By.xpath).sendKeys("abhixms");
		driver.findElement(By.name("password")).sendKeys("Pkoc@6802");
       
       
       
       
       
       driver.quit();

	}

}
