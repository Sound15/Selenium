package seleniumadvanced;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		WebElement button1=driver.findElement(By.id("btn1"));
		button1.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement text1=wait.until(ExpectedConditions.elementToBeClickable(By.id("txt1")));
		text1.sendKeys("Soundarya");
	}
}
		
		
		
		

		
		
		
	


