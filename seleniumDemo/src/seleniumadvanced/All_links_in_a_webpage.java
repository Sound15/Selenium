package seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_links_in_a_webpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		WebElement input=driver.findElement(By.id("APjFqb"));
		input.sendKeys("selenium");
		Thread.sleep(2000);

		List<WebElement> totallinks=driver.findElements(By.xpath("//a"));
		for (WebElement links : totallinks) {
			System.out.println(links.getAttribute("href"));
		}
	}

}
