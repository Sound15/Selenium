package seleniumadvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Switching_to_active_element {
	static WebElement q;

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		//driver.switchTo().activeElement().sendKeys("Tirunelveli\n");
		PageFactory.initElements(driver, Switching_to_active_element.class);
		q.sendKeys("Tirunelveli");
		

	}

}
