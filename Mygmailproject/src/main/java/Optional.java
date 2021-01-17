import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;


public class Optional {

WebDriver driver;
	
	/*1.Explicit wait
	2.implicit wait
	3.fluent wait*/
//Explict wait

@BeforeTest
public  void  Setup(){
	FluentWait wait;

wait=new WebDriverWait(driver,10);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wsfre.y")));

//implicitwait

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  

//fluentwait

wait=new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS);
}
}
