package seleniumadvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Underlined {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		WebElement tamil=driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[5]"));
		String beforeHovering=tamil.getCssValue("text-decoration");
		System.out.println("Before Hovering "+beforeHovering);
		Actions action=new Actions(driver); 
		action.moveToElement(tamil);
		action.perform();
		String afterHovering=tamil.getCssValue("text-decoration");
		System.out.println("After Hovering "+afterHovering);
		

	}

}
