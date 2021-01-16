import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

 
//for creating maven project select file then  click other create a maven project

public class webdriversetup {
	
	WebDriver driver;
	WebDriverWait wait;
	Signinpage snp;
	sgnpwd sd;
	@Before

	public void setup(){
		
		driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		}
	@Test
	
	public void toTest(){
		snp=new Signinpage(driver);
		snp.tosgn();
		sd=new sgnpwd(driver);
		sd.tosgpd();
		
	}

}
