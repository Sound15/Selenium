package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class FindingWebElement {

	public static void main(String[] args) throws AWTException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		WebElement element=driver.findElement(By.id("APjFqb"));
		//element.sendKeys("Agni\n");
		//element.sendKeys("Agni"+Keys.ENTER);
		
//    	element.sendKeys("Agni");
//		element.submit();
		
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		

	}

}
