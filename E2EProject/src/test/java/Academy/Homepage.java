package Academy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingpage;
import resources.Base;

public class Homepage extends Base{
	
	@Test(dataProvider="getdata")
	public void basepagenavigation(String email, String password) throws Exception {
		driver = IntializeDriver();
		driver.get("http://qaclickacademy.com");
		landingpage lp = new landingpage(driver);
		lp.getlogin();
		lp.getemail(email);
		lp.getpassword(password);
		lp.getsubmit();
		
		driver.get("http://qaclickacademy.com");
		landingpage lp = new landingpage(driver);
		lp.getlogin();
		lp.getemail(email);
		lp.getpassword(password);
		lp.getsubmit();
		
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] ob = new Object[2][2];
		
		ob[0][0] = "trey@gmail.com";
		ob[0][1] = "gdjasgd";
		
		ob[1][0] = "dshg@ghd.com";
		ob[1][1] = "hsdgj";
				return ob;
 	}

}
