package seleniumadvanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement tooltip=driver.findElement(By.xpath("//input[@class=\"gsc-input\"]"));
		String toolTiptText=tooltip.getAttribute("title");
		System.out.println(toolTiptText);
		

	}

}
