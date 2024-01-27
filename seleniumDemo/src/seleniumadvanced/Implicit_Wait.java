package seleniumadvanced;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		WebElement button1=driver.findElement(By.id("btn1"));
		button1.click();
		WebElement text1=driver.findElement(By.id("txt1"));
		text1.sendKeys("Soundarya");
	}

}
