package registration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class runner_registration {

	public static void main(String[] x) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\selenium jar\\\\\\\\\\\\\\\\Driver\\\\\\\\\\\\\\\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://dev.runragnar.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.findElement(By.xpath("//a[contains(text(),'Sign in / Sign up')]")).click();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dishant.patil+21@testriq.com");
		Driver.findElement(By.id("input-password")).sendKeys("Sid*141#");
		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-auth[1]/app-login[1]/div[1]/div[1]/form[1]/button[1]")).click();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.findElement(By.id("pofile")).click();
		Driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/ul[1]/li[2]/a[1]")).click();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-team-center[1]/div[1]/div[1]/div[1]/button[2]")).click();
		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-team-center[1]/div[1]/div[1]/div[1]/button[2]")).click();
		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-team-center[1]/div[1]/div[1]/div[1]/button[2]")).click();
		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-team-center[1]/div[1]/div[1]/div[1]/button[2]")).click();
		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-team-center[1]/div[1]/div[1]/div[1]/button[2]")).click();
		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-team-center[1]/div[1]/div[1]/div[1]/button[2]")).click();
		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-team-center[1]/div[1]/div[1]/div[1]/button[2]")).click();
		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-team-center[1]/div[1]/div[1]/div[1]/button[2]")).click();
////		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-team-center[1]/div[1]/div[1]/div[1]/button[2]")).click();
//		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-team-center[1]/div[1]/div[1]/div[1]/button[2]")).click();
//		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-team-center[1]/div[1]/div[1]/div[1]/button[2]")).click();
//		Driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-pages[1]/div[1]/app-team-center[1]/div[1]/div[1]/div[1]/button[2]")).click();
//		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		Driver.findElement(By.id("ngb-nav-15")).click();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.findElement(By.id("//h4[contains(text(),'Roster')]")).click();
	}

}
