package seleniumadvanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_keys {

	public static void main(String[] args) throws AWTException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		//WebElement element=driver.findElement(By.id("APjFqb"));
		//element.sendKeys("Agni");
		
//		JavascriptExecutor executor=(JavascriptExecutor)driver;
//		executor.executeScript("document.getElementById('APjFqb').value='Duckling'", "");
		
//		JavascriptExecutor executor=(JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].value='Riya'",element);
		
		driver.switchTo().activeElement();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_Y);
		robot.keyRelease(KeyEvent.VK_Y);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		
	}

}
