package UserActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TransactionHistory {
	
	@Test
	public void TransactionHistory() throws InterruptedException {
		
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nagaraj\\Downloads\\firefoxDriver\\geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    
		    driver.get("http://localhost:4200/home");
		
	    Thread.sleep(5000);
	   
		try 
		{
			
			driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/app-root/nav/ul/li[1]/a")).click();
			System.out.println("Transaction History Displayed");
			
			  
		    driver.findElement(By.xpath("//*[@id=\"navbardrop\"]")).click();
		    driver.findElement(By.xpath("/html/body/app-root/nav/ul/li[5]/div/a[2]")).click();
		   
		   System.out.println("Signed Out");
		}
		catch(Exception e) 
		{
			System.out.println("Error in browser!!\nPlease have a look");
		}
		
	    Thread.sleep(5000);  
	    driver.quit();

	}
}
