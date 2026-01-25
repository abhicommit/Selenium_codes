package Initial_days;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seclinecode {

	public static void main(String[] args) throws InterruptedException {
	  
		WebDriver driver= new ChromeDriver();
		
		//driver.manage().window().maximize();
		  driver.get("https://www.instagram.com/");
		
		         Window win =driver.manage().window();
		         
		         Dimension dim1= win.getSize();
		         int height =dim1.getHeight();
                 int width =dim1.getWidth();
                 System.out.println(dim1);
                 System.out.println(height);
                 System.out.println(width);
                 
                 Point p1 = win.getPosition();
                 
                 int x= driver.manage().window().getPosition().getX();
                 int y= driver.manage().window().getPosition().getY();
                 System.out.println(p1);
                 System.out.println(x);
                 System.out.println(y);
             
                // Setting the size and position
                // Dimension dim2= new Dimension(500,500);
                 //win.setSize(dim2);
                 // below code in one liner
                 win.setSize(new Dimension(700,700));
		         
                 //Point p2 = new Point(500,500);
                // win.setPosition(p2);
                 // below code in one liner
                 
                 win.setPosition(new Point(500,50));
                 Thread.sleep(3000);
		                    
		
		driver.quit();
		

	}

}
