package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
	public WebDriver driver;
	
	public landingpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span")
	WebElement Login;

	@FindBy(css="input#user_email")
	WebElement email;
	
	@FindBy(css="input#user_password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//h2[contains(text(),'Featured Courses')]")
	WebElement title;
	
	@FindBy(xpath="/html/body/header/div[2]/div/nav/ul/li[8]/a")
	WebElement contact;
	
	public Boolean getcontact() {
		return contact.isDisplayed();
	}
	
	public void getlogin() {
		
		Login.click();
	}
	
	public void getemail(String email1) {
		email.sendKeys(email1);
	}
	public void getpassword(String pwd) {
		password.sendKeys(pwd);
	}
	
    public void getsubmit() {
		
		submit.click();;
	}
    
    public String title() {
		return title.getText();
	}
}



