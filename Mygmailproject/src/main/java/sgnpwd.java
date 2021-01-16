import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class sgnpwd {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div/div[1]/div/div[1]/input" )
	WebElement Pwd;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/div[2]/div[1]/div/content/span")
	WebElement btn;
	
//	constructor
	
	public sgnpwd(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Test
	
	public void ptest(){
		Pwd.sendKeys("9458661230");
		btn.click();
		
	}
	public void tosgpd(){
		this.ptest();
	}
	

}
