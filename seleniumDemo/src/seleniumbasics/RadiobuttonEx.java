package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonEx {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.leafground.com/radio.xhtml");
		
		/*to verufy it is checked or not
		WebElement checked=driver.findElement(By.id("j_idt87:console2:2"));
		WebElement unchecked=driver.findElement(By.id("j_idt87:console1:1"));
		boolean status1=checked.isSelected();
		boolean status2=unchecked.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		*/
		
		/*clicking a radio button
		WebElement chrome=driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]"));
		chrome.click();
		*/
		
		/*printing all names of radio button
		List<WebElement> radiobuttons= driver.findElements(By.id("j_idt87:console2"));
		for(WebElement radiobutton:radiobuttons) {
			if(radiobutton.isEnabled()) {
			 System.out.println(radiobutton.getText());
			}
		}
       */
		
		
		}
}
