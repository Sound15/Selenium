package seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ListEx {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/selectable");
		List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"container\"]//div"));
		WebElement from=elements.get(0);
		WebElement to=elements.get(2);
		Actions actions=new Actions(driver);
		actions.clickAndHold(from);
		actions.moveToElement(to);
		actions.release(to);
		actions.build().perform();
	}

}
