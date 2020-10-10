package UserActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EditProfile {
	
	@Test
	public void EditPorfile() throws InterruptedException {
		
		

		  WebDriver driver = new FirefoxDriver();
		  
		  driver.get("http://localhost:4401/home");
	
		 
	    Thread.sleep(5000);
	    
	    try 
		{
	
			
			driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);   
		    driver.findElement(By.xpath("//*[@id=\"dropdown04\"]")).click();
		    driver.findElement(By.xpath("/html/body/app-root/nav/div/ul/li[5]/div/a[1]")).click();
		    
		    driver.findElement(By.xpath("/html/body/app-root/app-edit-profile/div[1]/form/div/div[1]/input")).sendKeys("7666854389");
		    driver.findElement(By.xpath("/html/body/app-root/app-edit-profile/div[1]/form/div/div[2]/input")).sendKeys("Bhopal");
		    driver.findElement(By.xpath("/html/body/app-root/app-edit-profile/div[1]/form/div/div[2]/div[1]/input")).sendKeys("raqsh.97@gmail.com");
		    driver.findElement(By.xpath("/html/body/app-root/app-edit-profile/div[1]/form/div/div[2]/div[2]/input")).sendKeys("pass123");
		    driver.findElement(By.xpath("/html/body/app-root/app-edit-profile/div[1]/form/div/div[2]/div[3]/input")).sendKeys("pass123");
		    System.out.println("Profile edited");
		    driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);   
		    driver.findElement(By.xpath("//*[@id=\"dropdown04\"]")).click();
		    driver.findElement(By.xpath("/html/body/app-root/nav/div/ul/li[5]/div/a[2]")).click();

		    System.out.println("Signed Out");
		}
		catch(Exception e) 
		{
			System.out.println("Error in browser!!\nPlease have a look");
		}
		
	    Thread.sleep(5000);  
	   

	}

}
