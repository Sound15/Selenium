package seleniumadvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorMain {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		WebElement logo=driver.findElement(By.xpath("//img[@title=\"nopCommerce\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].styleborder='3px solid red'",logo);
		

	}
}
