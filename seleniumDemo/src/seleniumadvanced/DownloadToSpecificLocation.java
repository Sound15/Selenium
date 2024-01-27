package seleniumadvanced;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadToSpecificLocation {

	public static void main(String[] args) {
		
		String location=System.getProperty("use.dir")+"\\Downloads\\";
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory",location);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"table-files\"]/tbody/tr[1]/td[5]/a")).click();
		
		
		
		
		
	}

}
