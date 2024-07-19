package Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Jobs_Add2 {
	
	
	WebDriver driver;
	
	//Step1
	String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String UNAME="Admin",PASSWORD="admin123";
	String JobTitle="Sales118",JobDescr="Sales118 descr",JobNote="Sales118 Note";
	
	
	
  @Test
  public void AddJobs1() throws Exception {
	  
	  TC01_Jobs_Add2 T11=new TC01_Jobs_Add2();
	  T11.OpenChromeBrowser();
	  T11.OpenOrangeHRM(TestURL);//Step2
	  T11.Login(UNAME,PASSWORD); //Step2
	  T11.AddJobs(JobTitle,JobDescr,JobNote);//Step2
	 
	  
  }
  
  
  public void OpenChromeBrowser()
  {
		driver = new ChromeDriver();  
		driver.manage().window().maximize();
  }
  
  public void OpenOrangeHRM(String TestURL1)
  {

		driver.get(TestURL1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
  }
  
  public void Login(String UNAME1,String PASSWORD1) throws Exception
  {
	  findElement(By.name("username")).sendKeys(UNAME1);
	  findElement(By.name("password")).sendKeys(PASSWORD1);
	 findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	
	
  }
  
  public void AddJobs(String JobTitle1,String JobDescr1,String JobNote1) throws Exception
  {
	//Admin
	 findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	
	 
	  //Jobs
	  findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();	
		 
	  //Job Titles
	  findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();	
		
	  //Add
	  findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();	
		 
		//Job Title
	  findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(JobTitle1);	
		
	  
	
	//Job Descr
	  findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(JobNote1);	
		
	  
	
	//Job Note
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys("Sales15 Note");	
		
	  //Save button
	  findElement(By.xpath("	//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
  }
  
  
  

public  WebElement findElement(By by) throws Exception 
{

	WebElement elem = driver.findElement(by);  
	
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 
	}
	return elem;
}

  
  
  
  
}
