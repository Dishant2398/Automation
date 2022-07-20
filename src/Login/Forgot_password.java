package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgot_password {
	public static void main(String [] X) {

	System.setProperty("webdriver.chrome.driver","C:\\\\selenium jar\\\\Driver\\\\chromedriver.exe");
	ChromeDriver D  =new ChromeDriver();
	D.get("https://dev.runragnar.com/");
	D.manage().window().maximize();
	D.findElement(By.xpath("//a[contains(text(),'Sign in / Sign up')]")).click();
	D.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	D.findElement(By.xpath("//i[contains(text(),'Forgot Password?')]")).click();
	D.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	D.findElement(By.xpath("//input[@id='email']")).sendKeys("dishant.patil@testriq.com");
	D.findElement(By.xpath("//body/app-root[1]/div[1]/app-auth[1]/app-forgot-password[1]/div[1]/div[1]/form[1]/button[1]")).click();
	
}
}

