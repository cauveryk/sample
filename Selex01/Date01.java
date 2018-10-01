package Selex01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Date01 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
WebDriver web=new FirefoxDriver();
web.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
WebDriverWait wait=new WebDriverWait(web,180);
web.get("http://demoqa.com/");
WebElement gh=web.findElement(By.linkText("Datepicker"));
gh.click();
//Thread.sleep(2000);
//web.findElement(By.xpath("//input[@id='datepicker1']")).click();
WebElement h=web.findElement(By.xpath("//input[@id='datepicker1']"));
wait.until(ExpectedConditions.visibilityOf(h));
h.click();

List<WebElement> b=web.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td//a"));
for (WebElement c:b)
{
	String val=c.getText();
	System.out.println(val);
	
if(val.equalsIgnoreCase("19"))
		{
	c.click();
				}

}



	}
	

}
