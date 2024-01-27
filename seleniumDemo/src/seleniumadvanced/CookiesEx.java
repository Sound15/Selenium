package seleniumadvanced;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesEx {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		//get all cookies and print
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
	    for(Cookie cookie:cookies) {
	    	System.out.println(cookie.getName()+" : "+cookie.getValue());
	    }
		
		//adding cookie
		Cookie cookieobj=new Cookie("MyCookie123","123456");
		driver.manage().addCookie(cookieobj);
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie cookie:cookies) {
	    	System.out.println(cookie.getName()+" : "+cookie.getValue());
	    }
		
		//deleting cookie
		driver.manage().deleteCookie(cookieobj);
		//driver.manage().deleteCookieNamed("MyCookie123");
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie cookie:cookies) {
	    	System.out.println(cookie.getName()+" : "+cookie.getValue());
	    }
		
		//deleting all cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		
	    }

	}


