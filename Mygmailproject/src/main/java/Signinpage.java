
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class Signinpage {
	WebDriver driver;
	
	@FindBy(id="identifierId")
	WebElement emid;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/content/span")
	WebElement nxbtn;
	
	
//	now declare constructor
	
	public Signinpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Test(priority=1)
	public void snmethod(){
		emid.sendKeys("Amitbhati696@gmail.com");
		nxbtn.click();

		
	}
	/*@Test(priority=2)
	public void pwd(){
		Pwd.sendKeys("9458661230");
		
btn.click();
		
	}*/
	public void tosgn(){
		this.snmethod();
		//this.pwd();
	}
	

}
