package Selex01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrol01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver web=new FirefoxDriver();
		web.get("http://demoqa.com/");
	((JavascriptExecutor)web).executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);
	((JavascriptExecutor)web).executeScript("window.scrollBy(0,-1000)");
	//((JavascriptExecutor)web).executeScript("window.scrollTo(0,document.body.scrollHeight)");
	WebElement gh=web.findElement(By.linkText("Sortable"));
	((JavascriptExecutor)web).executeScript("argument[0].scrollIntoView();",gh);
		
		
	}

}
