package Academy;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingpage;
import resources.Base;

public class Validatetitle extends Base{
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@Test
	public void verifytitle() throws Exception {
		driver = IntializeDriver();
		log.info("driver is intialised");
		driver.get(prop.getProperty("url"));
		log.info("navaigated to homepage");
		landingpage lp = new landingpage(driver);
		String t = lp.title();
		Assert.assertEquals(t, "FEATURED COURSES");
		log.info("Successfully validated text message");
		Boolean x =lp.getcontact();
		Assert.assertFalse(x);
		log.info("succesfully validated contact links");
		
	}
	

}



