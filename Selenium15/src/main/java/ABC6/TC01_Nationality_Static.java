package ABC6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Nationality_Static {
	
	static WebDriver driver;  // Declaration
	
	
  @Test
  public void Login_Test() {
	  


		
	  TC01_Nationality_Static.OpenChromeBrowser();
	  TC01_Nationality_Static.Open_Orange_HRM();
	  TC01_Nationality_Static.Login();
	  TC01_Nationality_Static.AddNationality();
		
  }
  
  
  
  public static void OpenChromeBrowser() {
	  
		driver =new ChromeDriver(); //Chrome Browse window launched
		driver.manage().window().maximize() ;	
  }
  
  public static void Open_Orange_HRM() {
	  

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
  public  static void Login() {
	  

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
  }  
 
  public static void AddNationality() {
	  
	//Admin
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
			
			//Nationalities
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
			
			//Add
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
			
			//Nationality Name Text Field
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Sudhakar Indian144");
			
			//Save button
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
			
	  
  }  
 
  
  
  
}