package Selex01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dri=new FirefoxDriver();
		dri.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		dri.get("http://demosite.center/wordpress/wp-login.php");
		dri.findElement(By.cssSelector("input[name=log]")).sendKeys("admin");
		dri.findElement(By.cssSelector("input[name=pwd]")).sendKeys("demo123");
		dri.findElement(By.cssSelector("input[name=wp-submit]")).click();
		Thread.sleep(2000);
		WebElement gh=dri.findElement(By.xpath("//div[text()='Tools']"));
		Actions mh=new Actions(dri);
		mh.moveToElement(gh).build().perform();
		
		
		

	}

}
