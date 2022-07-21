package registration;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class regsitration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\selenium jar\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		 JavascriptExecutor js = (JavascriptExecutor) Driver;
		Driver.get("https://dev.runragnar.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//a[@id='races']")).click();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.findElement(By.xpath("//body[1]/app-root[1]/app-header[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/div[1]/div[1]/div[2]/app-header-races[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		Driver.findElement(By.xpath("//a[contains(text(),'VIEW PRICING')]")).click();
		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-event-detail[1]/div[1]/div[2]/app-event-detail-registration[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/a[1]")).click();
		Driver.findElement(By.id("input_0")).sendKeys("dishant.patil@testriq.com");
		Driver.findElement(By.name("password")).sendKeys("Sid*141#");
		Driver.findElement(By.xpath("//body/ui-view[1]/team-builder[1]/div[1]/ui-view[1]/team-builder-login[1]/div[1]/div[1]/form[1]/div[3]/button[1]")).click();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement Element= Driver.findElement(By.cssSelector("#select_5"));
		
		((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", Element);
//
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#select_5")).click();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.findElement(By.className("ng-scope md-ink-ripple")).click();
		Select drpteam=new Select(Driver.findElement(By.cssSelector("#select_5")));
		drpteam.selectByValue("Standard");
		Driver.findElement(By.xpath("//body/ui-view[1]/team-builder[1]/div[1]/ui-view[1]/team-builder-registration[1]/ui-view[1]/team-builder-registration-captain[1]/div[1]/ui-view[1]/team-builder-registration-captain-info[1]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		Driver.findElement(By.id("input_398")).sendKeys("cred");
		Driver.findElement(By.xpath("//body/ui-view[1]/team-builder[1]/div[1]/ui-view[1]/team-builder-registration[1]/ui-view[1]/team-builder-registration-captain[1]/div[1]/ui-view[1]/team-builder-registration-captain-payment[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/md-input-container[1]")).sendKeys("4111 1111 1111 1111");
		Driver.findElement(By.cssSelector("#input_400")).sendKeys("12/22");
		Driver.findElement(By.id("input_401")).sendKeys("1234");
		Driver.findElement(By.id("input_402")).sendKeys("12345");
		Driver.findElement(By.xpath("//body/ui-view[1]/team-builder[1]/div[1]/ui-view[1]/team-builder-registration[1]/ui-view[1]/team-builder-registration-captain[1]/div[1]/ui-view[1]/team-builder-registration-captain-payment[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/md-input-container[1]/md-checkbox[1]/div[1]")).click();
		Driver.findElement(By.xpath("//body/ui-view[1]/team-builder[1]/div[1]/ui-view[1]/team-builder-registration[1]/ui-view[1]/team-builder-registration-captain[1]/div[1]/ui-view[1]/team-builder-registration-captain-payment[1]/div[1]/form[1]/div[2]/div[4]/button[1]")).click();
		Driver.close();
		
		
	}

}
