package dummy;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class extent {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--privatewindow");
		System.setProperty("webdriver.gecko.driver","D:\\Workspace\\E2EProject\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver(fo);
		driver.get("http://qaclickacademy.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int len = links.size();
		for(int i=0;i<len;i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection hc = (HttpURLConnection)link.openConnection();
			//hc.setConnectTimeout(1000);
			hc.connect();
			int rescode = hc.getResponseCode();
			if(rescode==200) {
				System.out.println(element +"is valid");
				
			}
			else if (rescode>200) {
				System.out.println(element + "is broken");
			}
		}
		driver.close();

	}
	irefoxOptions fo = new FirefoxOptions();
	fo.addArguments("--privatewindow");
	System.setProperty("webdriver.gecko.driver","D:\\Workspace\\E2EProject\\drivers\\geckodriver.exe");
	driver = new FirefoxDriver(fo);
	driver.get("http://qaclickacademy.com/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	irefoxOptions fo = new FirefoxOptions();
	fo.addArguments("--privatewindow");
	System.setProperty("webdriver.gecko.driver","D:\\Workspace\\E2EProject\\drivers\\geckodriver.exe");
	driver = new FirefoxDriver(fo);
	driver.get("http://qaclickacademy.com/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());

}
