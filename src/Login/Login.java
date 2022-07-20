package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jar\\Driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.get("https://dev.runragnar.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in / Sign up')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dishant.patil@testriq.com");
		driver.findElement(By.id("input-password")).sendKeys("Sid*141#");
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-auth[1]/app-login[1]/div[1]/div[1]/form[1]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		driver.close();

	}

}

