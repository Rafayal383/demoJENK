package testlgtt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;


public class testing_testing {
	
	@Test
	public  void tc01(){
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.findElement(By.cssSelector("a[aria-label=\"Gmail (opens a new tab)\"]")).click();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("C:/Users/ajay rafayal/Desktop/supermacy.jpeg");
		
	}	
}
