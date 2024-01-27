package seleniumadvanced;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException, AWTException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/alert.xhtml");
		/*
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile=new File("C:\\Users\\sound\\Downloads\\sample.png");
		FileHandler.copy(sourceFile, destinationFile);
		driver.findElement(By.id("j_idt88:j_idt91")).click();
*/
		/*
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		Robot robot=new Robot();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenSize);
		BufferedImage source=robot.createScreenCapture(rectangle);
		File destination=new File("C:\\Users\\sound\\Downloads\\robot.png");
		ImageIO.write(source,"png",destination);
		*/
		
		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		WebElement logo=driver.findElement(By.id("j_idt15"));
		File source=logo.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\sound\\Downloads\\section.png");
		FileHandler.copy(source,destination);
		
		
	}

}
