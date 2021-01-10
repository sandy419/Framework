package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver;
	public Properties prop;

	public WebDriver IntializeDriver() throws Exception {
		File src = new File("D:\\Workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();
		FileInputStream fis = new FileInputStream(src);
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		
		
		if(browsername.equalsIgnoreCase(browsername)) {
			System.setProperty("webdriver.gecko.driver","D:\\Workspace\\E2EProject\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
			
			
		}
		else if(browsername.equalsIgnoreCase(browsername)){
			System.setProperty("webdriver.gecko.driver","D:\\Workspace\\E2EProject\\drivers\\geckodriver.exe");
			driver= new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase(browsername)){
			System.setProperty("webdriver.gecko.driver","D:\\Workspace\\E2EProject\\drivers\\geckodriver.exe");
			driver= new InternetExplorerDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
	}
	public String TakeScreenshot(String testmethodname, WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = "D:\\ScreenShots"+testmethodname+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	}
}





