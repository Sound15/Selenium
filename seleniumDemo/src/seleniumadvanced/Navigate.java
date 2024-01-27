package seleniumadvanced;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Navigate {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
//		
//		//Various Refresh Techniques
//		driver.get(driver.getCurrentUrl());
//		Thread.sleep(5000);
//		
//		JavascriptExecutor executor=(JavascriptExecutor)driver;
//		executor.executeScript("location.reload()");
//		Thread.sleep(5000);
//		executor.executeScript("history.go(0)");
		
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_F5);
//		robot.keyRelease(KeyEvent.VK_F5);
		
		//Various Maximize techniques
		//driver.manage().window().maximize();
		
//		Dimension dimension=new Dimension(1920,1080);
//		driver.manage().window().setSize(dimension);
		
//		ChromeOptions chromeOptions=new ChromeOptions();
//		chromeOptions.addArguments("--start-maximized");
//		WebDriver driver= new ChromeDriver(chromeOptions);
//		driver.navigate().to("https://www.hyrtutorials.com/p/waits-demo.html");
	}

}
