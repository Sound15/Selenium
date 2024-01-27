package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		/* position of button
		WebElement getPositionButton=driver.findElement(By.id("j_idt88:j_idt94"));
		Point xypoint= getPositionButton.getLocation();
		int xValue= xypoint.getX();
		int yValue= xypoint.getY();
		System.out.println("X Value is "+xValue+" and Y Value is "+yValue);
		*/
		
		/*color of button
		WebElement colorbutton=driver.findElement(By.id("j_idt88:j_idt96"));
		String color= colorbutton.getCssValue("background-color");
		System.out.println(color);
		*/
		
		/*size of button
		WebElement sizeButton= driver.findElement(By.id("j_idt88:j_idt98"));
		int height=sizeButton.getSize().getHeight();
		int width=sizeButton.getSize().getWidth();
		System.out.println("Height is "+height+" and Width is "+width);
		*/
		
		//capture color change of button
		WebElement colorchangeButton=driver.findElement(By.id("j_idt88:j_idt100"));
		String color= colorchangeButton.getCssValue("background-color");
		System.out.println(color);
		Actions action=new Actions(driver);
		action.moveToElement(colorchangeButton).perform();
		String aftercolor= colorchangeButton.getCssValue("background-color");
		System.out.println(aftercolor);
		

	}

}
