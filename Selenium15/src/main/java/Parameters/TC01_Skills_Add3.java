package Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Skills_Add3 {
	
	//Step1
	WebDriver driver;
	String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String UserName="Admin",Password="admin123";
	String SkillName="Java5000",SkillDescr="Java5000 descr";
	
	
  @Test
  public void LoginTest() throws Exception {
	  

	  TC01_Skills_Add3 T1=new TC01_Skills_Add3();
	  
	  T1.OpenChromeBrowser();
	  T1.OpenOrangeHRM(TestURL);  //Step2 - Passing global variables to methods
	  T1.Login(UserName,Password); // Step2
	  T1.AddSkills(SkillName,SkillDescr);//Step
	
	  
	
	 
  }
  
  public void OpenChromeBrowser()
  {
	  
		driver = new ChromeDriver();  
		driver.manage().window().maximize();
	  
  }
  
  
  public void OpenOrangeHRM(String TestURL1)//step3
  {
	  driver.get(TestURL1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
  }
  
  public void Login(String UserName1,String Password1) throws Exception  //step3
  {

	  findElement(By.name("username")).sendKeys(UserName1);
	  findElement(By.name("password")).sendKeys(Password1);
	  findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
  }
  
  public void AddSkills(String SkillName1,String SkillDescr1) throws Exception //step3
  {
	  //Admin
		 findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	
		 
		  //Qualifications
		  findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		  
		  //Skills
		  findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
			
		  //Add button
		  findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		  
		  //SkillName
		  findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName1);
		  
		  //Skill descr
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr1);
		  
		  	//save button
		  findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		  
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
