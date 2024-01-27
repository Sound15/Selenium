package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		
		//WebElement dropDown = driver.findElement(By.className("ui-selectonemenu"));
		//Select select= new Select(dropDown);
		
		/*Selecting dropdowns
		select.selectByIndex(1);
		//select.selectByValue("2");
		select.selectByVisibleText("Puppeteer");
		*/
		//dropDown.sendKeys("Cypress");
		
		/*no.of options
		List<WebElement> listOfOptions=select.getOptions();
		int size= listOfOptions.size();
		System.out.println(size);
		*/
		
	    /*multiselect not working#
		WebElement multiselectbutton= driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button"));
		multiselectbutton.click();
		WebElement multiselect=driver.findElement(By.className("//*[@id=\"j_idt87:auto-complete_panel\"]/ul"));
		Select multiselectBox=new Select(multiselect);
		multiselectBox.selectByIndex(1);
		multiselectBox.selectByIndex(2);
		multiselectBox.selectByIndex(3);
		*/
		
	}

}
