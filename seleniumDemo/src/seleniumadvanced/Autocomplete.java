package seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		WebElement input=driver.findElement(By.id("APjFqb"));
		input.sendKeys("selenium");
		Thread.sleep(2000);
		
		List<WebElement> matches=driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li"));
		for (WebElement match : matches) {
			if(match.getText().contains("download")) {
				match.click();
				break;
			
			}
		}
			
		}
			
		
		
		
		
	}
