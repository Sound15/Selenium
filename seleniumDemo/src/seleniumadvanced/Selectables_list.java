package seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables_list {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/list.xhtml");
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li"));
		int listsize=list.size();
		System.out.println(listsize);
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(list.get(0)).click(list.get(1)).click(list.get(2)).build().perform();
		
		/*not working
		actions.clickAndHold(list.get(0));
		actions.clickAndHold(list.get(1));
		actions.clickAndHold(list.get(2));
		actions.build().perform();
		*/

	}

}
