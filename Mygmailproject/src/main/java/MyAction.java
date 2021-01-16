import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sun.jna.Platform;


public class MyAction {
	
	WebDriver driver;
	
	WebDriverWait wait;
	
	DesiredCapabilities cap;
	
	@BeforeClass
	@Parameters({"browser"})
	
	public void mysetup (@Optional String browser){
		
		if(browser.equalsIgnoreCase("FF")){
			cap= new DesiredCapabilities();
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
			cap.setCapability(CapabilityType.PLATFORM,Platform.WINDOWS);
			driver=new FirefoxDriver(cap);
		}else if(browser.equalsIgnoreCase("CH")){
			cap=new DesiredCapabilities();
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
			cap.setCapability(CapabilityType.PLATFORM,Platform.WINDOWS);
			
			driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "./drivers/win/chromedriver.exe");
		}
		
		wait=new WebDriverWait(driver,20);
		
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void draggable(){
		
		driver.findElement(By.linkText("Draggable")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("demo-frame")));
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Actions action=new Actions(driver);
		
		WebElement src=driver.findElement(By.id("draggable"));
		
	action.dragAndDropBy(src, 349,49).build().perform();
	}
	
	@Test
	
	public void selectable(){
		
		driver.findElement(By.className("Selectable")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("demo-frame")));
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Actions st=new Actions(driver);
		
		WebElement we=driver.findElement(By.xpath("//ol[@id='selectable']/li[0]"));
		
		WebElement wr=driver.findElement(By.xpath("//ol[@id='selectable']/li[3]"));
		
		st.keyDown(Keys.CONTROL).click(we).click(wr).build().perform();
		
		}
	
	@Test
	
	public void sortble(){
		
		driver.findElement(By.linkText("Sortable")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("demo-frame")));
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		
		Actions as=new Actions(driver);
		
		WebElement wl=driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
		
		WebElement w3=driver.findElement(By.xpath("//ul[@id='sortable']/li[3]"));
		
		WebElement w5=driver.findElement(By.xpath("//ul[@id='sortable']/li[5]"));
		
		WebElement w7=driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"));
		
		as.dragAndDrop(wl, w7).dragAndDrop(w5, w3).build().perform();
		
		
		}
	
	@Test
	
	public void menu(){
		
	driver.findElement(By.linkText("Menu")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("demo-frame")));
	
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	
	Actions ad=new Actions(driver);
	
	WebElement wm=driver.findElement(By.xpath("//div[@id='ui-id-4']"));
	WebElement wt=driver.findElement(By.id("ui-id-6"));
	
	ad.moveToElement(wm).moveToElement(wt).build().perform();
	
	}

}
