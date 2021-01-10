package dummy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;

public class NewTest {
	static WebDriver driver;
	
	  @BeforeTest
	  public void beforeTest() {
		  FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--privatewindow");
			System.setProperty("webdriver.gecko.driver","D:\\Workspace\\E2EProject\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver(fo);
			driver.get("http://qaclickacademy.com/");
	  }
	  
	  
	  
  @Test
  public void f() throws Exception {
	  List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int len = links.size();
		for(int i=0;i<len;i++) {
			WebElement element = links.get(i);
			String url1 = element.getAttribute("href");
			URL link = new URL(url1);
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
	  
	  
  }


  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
