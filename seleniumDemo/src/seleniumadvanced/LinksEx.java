package seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LinksEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		 /*links
		 WebElement link=driver.findElement(By.linkText("Go to Dashboard"));
		 link.click(); Thread.sleep(2000); driver.navigate().back();
		 Thread.sleep(2000); driver.navigate().forward(); Thread.sleep(2000);
		 driver.navigate().refresh();
		 */
		
		/*to find where link is going without clicking it
		WebElement findLink=driver.findElement(By.partialLinkText("Find the URL"));
		String where= findLink.getAttribute("href");
		System.out.println("This link is going to "+where);
		*/
		
		/*to verify whether a link is broken or not
		WebElement brokenLink=driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		String title=driver.getTitle();
		if(title.contains("404")) {
			System.out.println("Link is broken");
		}
		driver.navigate().back();
		*/
		
		//getting total links
		WebElement form=driver.findElement(By.xpath("//form[@id=\"j_idt87\"]"));
		List<WebElement> pageTotalLinks=form.findElements(By.tagName("a"));
		List<WebElement> WebpageTotalLinks=driver.findElements(By.tagName("a"));
		int pagecount=pageTotalLinks.size(); 
		int webPageCount=WebpageTotalLinks.size();
		System.out.println("Total links in this page are "+pagecount);
		System.out.println("Total links in this complete Webpages are "+webPageCount);
		
		}
		

	}


