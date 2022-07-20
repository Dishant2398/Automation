package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium jar\\Driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://dev.runragnar.com/");

		driver.findElement(By.xpath("//a[contains(text(),'Sign in / Sign up')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Create an Account')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Dishant");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@id='birthDate']")).sendKeys("08/10/1992");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("siddhesh.deokar+121@testriq.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Sid*141#");
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-auth[1]/app-create-account[1]/div[1]/div[1]/form[1]/button[1]")).click();
		

	}

}
