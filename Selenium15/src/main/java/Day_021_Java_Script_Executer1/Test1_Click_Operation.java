package Day_021_Java_Script_Executer1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1_Click_Operation {
	
	WebDriver driver;

	@Test
	public void AmazonSendKeys() {
	
		
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//1.We have to create JavascriptExecutor Reference Object
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//2.We have to create WebElement Object Reference
		WebElement Mobile_Web_Element = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		js.executeScript("arguments[0].click();", Mobile_Web_Element);
		
		//js.executeScript("document.getElementById('enter element id').click();");


 


	}

}
