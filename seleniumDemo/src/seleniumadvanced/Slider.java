package seleniumadvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement min=driver.findElement(By.xpath("//*[@id=\"form:j_idt125\"]/span[1]"));
		System.out.println(min.getLocation());
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(min,5, 0).perform();
		System.out.println(min.getLocation());
	}

}
