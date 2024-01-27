package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		//driver.findElement(By.id("j_idt88:name")).sendKeys("Babu Manickam");
		
		//driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Tirunelveli");
		
		/*WebElement disabledbox=driver.findElement(By.id("j_idt88:j_idt93"));
		boolean enabled= disabledbox.isEnabled();
		System.out.println(enabled);*/
		
		/*WebElement clearbox= driver.findElement(By.id("j_idt88:j_idt95"));
		clearbox.clear();*/
		
		WebElement getTextBox= driver.findElement(By.id("j_idt88:j_idt97"));
		String value= getTextBox.getAttribute("value");
		System.out.println(value);
	}
}