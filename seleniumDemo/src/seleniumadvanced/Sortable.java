package seleniumadvanced;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//not working
		List<WebElement> elements=driver.findElements(By.xpath("//ul[@id=\"sortable\"]/li"));
		WebElement from=elements.get(0);
		WebElement to=elements.get(2);
		Actions actions=new Actions(driver);
		actions.clickAndHold(from);
		actions.moveToElement(to);
		actions.release(to);
		actions.build().perform();
		
		
	}

}
