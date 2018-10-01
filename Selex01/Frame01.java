package Selex01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dri=new FirefoxDriver();
		dri.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		dri.get("file:///C:/Users/CHAN/Desktop/url.html");
		//entering frame 1
		dri.switchTo().frame(0);
		//dri.get("http://demoqa.com/");
		((JavascriptExecutor)dri).executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		((JavascriptExecutor)dri).executeScript("window.scrollBy(0,-1000)");
		//((JavascriptExecutor)web).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement gh=dri.findElement(By.linkText("Sortable"));
		((JavascriptExecutor)dri).executeScript("arguments[0].scrollIntoView();",gh);
		dri.switchTo().defaultContent();
		//entering frame 2
		//dri.switchTo().frame("tour");		
		//dri.get("http://newtours.demoaut.com/");
		//dri.findElement(By.xpath("//input[@name='userName']")).sendKeys("123");			
		//dri.findElement(By.cssSelector("input[name=password]")).sendKeys("123");
		//dri.findElement(By.cssSelector("input[name=login]")).click();
		//dri.switchTo().defaultContent();
		//entering frame 3
				dri.switchTo().frame("demo");
				//dri.get("http://demoqa.com/");
				((JavascriptExecutor)dri).executeScript("window.scrollBy(0,1000)");
				Thread.sleep(2000);
				((JavascriptExecutor)dri).executeScript("window.scrollBy(0,-1000)");
				//((JavascriptExecutor)web).executeScript("window.scrollTo(0,document.body.scrollHeight)");
				WebElement hh=dri.findElement(By.linkText("Sortable"));
				((JavascriptExecutor)dri).executeScript("arguments[0].scrollIntoView();",hh);
				dri.switchTo().defaultContent();
		

	}

}
