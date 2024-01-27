package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesEx {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");

		/*select a checkbox
		WebElement basic=driver.findElement(By.id("j_idt87:j_idt89"));
		basic.click();
		 */

		/*verify a checkbox is checked or not
		WebElement ajax=driver.findElement(By.id("j_idt87:j_idt91"));
		boolean ajaxselected=ajax.isSelected();
		System.out.println(ajaxselected);
		 */

		/*print all the name of checkboxes
		List<WebElement> favlans=driver.findElements(By.id("j_idt87:basic"));
		for(WebElement favlan: favlans) {
			String value=favlan.getText();
			System.out.println(value);
			}
		 */

		//		driver.get("https://testautomationpractice.blogspot.com/");
		//		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type=\"checkbox\"and contains(@id,'day')]"));

		/*multiple checkboxes
		for(WebElement checkbox:checkboxes) {
			checkbox.click();
		 */

		/*specifically select by values
		for(WebElement checkbox:checkboxes) {
			String checkboxname=checkbox.getAttribute("value");
			if(checkboxname.equals("monday")||checkboxname.equals("sunday")) {
				checkbox.click();
			}
		}
		 */

		/*select last two checkboxes
		int size=checkboxes.size();
		for(int i=size-2;i<size;i++) {
			checkboxes.get(i).click();
		 */

		//select first two checkboxes
		//		int size=checkboxes.size();
		//		for(int i=0;i<size;i++) {
		//			if(i<2) {
		//				checkboxes.get(i).click();
		//				
		//select all checkboxes in a Webpage
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for (WebElement webElement : checkboxes) {
			webElement.click();
		}


	}


}




