package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		/*Normal alert box
		WebElement alertButton=driver.findElement(By.id("j_idt88:j_idt91"));
		alertButton.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		*/
		
		/*Confirm alert box
		WebElement conformalertButton=driver.findElement(By.id("j_idt88:j_idt93"));
		conformalertButton.click();
		Alert confirmAlert= driver.switchTo().alert();
		confirmAlert.dismiss();
		*/
		
		/*prompt alert box
		WebElement promptalertButton=driver.findElement(By.id("j_idt88:j_idt104"));
		promptalertButton.click();
		Alert confirmAlert= driver.switchTo().alert();
		confirmAlert.sendKeys("Sound");
		confirmAlert.accept();
		*/
		
		WebElement alertButton=driver.findElement(By.id("j_idt88:j_idt95"));
		alertButton.click();
		WebElement dismiss= driver.findElement(By.id("j_idt88:j_idt98"));
		dismiss.click();
		
	}

}
