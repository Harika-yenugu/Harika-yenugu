package May30_31_Labs.May30_31_Labs.Day_021_Java_Script_Executer1.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2_SendKeys_Example2 {
	
	WebDriver driver;

	@Test
	public void AmazonSendKeys() {
	
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement Element = driver.findElement(By.id("name"));
	
		
		js.executeScript("document.getElementById('name').value='Hai123'");
		
	

		
		//https://www.javatpoint.com/innertext-vs-innerhtml
	}

}
