package seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		/*Click and get the text of a button in a frame
		driver.switchTo().frame(0);
		WebElement click=driver.findElement(By.id("Click"));
		click.click();
		String text=click.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		*/
		
		/*Clicking nested frame
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement nfclick=driver.findElement(By.id("Click"));
		nfclick.click();
		driver.switchTo().defaultContent();
		*/
		
		List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
		int size= totalFrames.size();
		System.out.println(size);
		
		

}
}
