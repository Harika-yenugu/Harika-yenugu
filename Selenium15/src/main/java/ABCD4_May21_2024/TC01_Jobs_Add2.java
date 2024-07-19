package ABCD4_May21_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Jobs_Add2 {
	
	
	static WebDriver driver;
	
  @Test
  public void AddJobs1() {
	  
	  TC01_Jobs_Add2.Open_Chrome_Browser();
	  TC01_Jobs_Add2.Open_Orange_HRM();
	  TC01_Jobs_Add2.Login();
	  TC01_Jobs_Add2.Jobs_Add();
	  
 }
  
  
  
  public static void Open_Chrome_Browser() {
		driver = new ChromeDriver();  
		driver.manage().window().maximize();
  }
  
  
  public static void Open_Orange_HRM() {
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
  }
  
  public static void Login() {

	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	
	
  }
  
  
  
  public static void Jobs_Add() {

	  //Admin
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	
	 
	  //Jobs
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();	
		 
	  //Job Titles
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();	
		
	  //Add
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();	
		 
		//Job Title
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Sales16");	
		
	  
	
	//Job Descr
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Sales16 descr");	
		
	  
	
	//Job Note
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys("Sales16 Note");	
		
	  //Save button
	  driver.findElement(By.xpath("	//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();

  }
  
  
  
}