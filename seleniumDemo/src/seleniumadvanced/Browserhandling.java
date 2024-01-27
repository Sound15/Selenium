package seleniumadvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		/*go to child window and do operation
		String oldwindow=driver.getWindowHandle();
		WebElement open=driver.findElement(By.id("j_idt88:j_idt91"));
		open.click();
		Set<String> allwindows=driver.getWindowHandles();
		for(String newwindow:allwindows) {
			driver.switchTo().window(newwindow);
		}
        WebElement home=driver.findElement(By.id("menu-button"));
        home.click();
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(oldwindow);
        */
		
		/*no.of opened windows
		WebElement open=driver.findElement(By.id("j_idt88:j_idt91"));
		open.click();
		int numberOfWindows=driver.getWindowHandles().size();
		System.out.println(numberOfWindows);
		*/
		
		/*closes child windows except parent window
		String oldwindow=driver.getWindowHandle();
		WebElement open=driver.findElement(By.id("j_idt88:j_idt91"));
		open.click();
		Set<String> allwindows=driver.getWindowHandles();
		for(String newwindow:allwindows) {
			if(!newwindow.equals(oldwindow)) {
			driver.switchTo().window(newwindow);
			driver.close();
			}
		}
		*/
		driver.quit();//closes both parent and all child windows
	}

}
