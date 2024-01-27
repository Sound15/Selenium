package seleniumadvanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://infinite-scroll.com/demo/full-page/");
//		JavascriptExecutor executor=(JavascriptExecutor)driver;
//		executor.executeScript("window.scroll(0,950)", "");
//		Thread.sleep(3000);
//		executor.executeScript("window.scroll(0,-950)", "");
//		Thread.sleep(3000);
//		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
//		Thread.sleep(3000);
//		executor.executeScript("window.scrollTo(0,0)","");
		
//		WebElement link=driver.findElement(By.linkText("Computer Arts"));
//		executor.executeScript("arguments[0].scrollIntoView(true);", link);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		


	}

}
