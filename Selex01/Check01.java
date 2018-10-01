package Selex01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dri=new FirefoxDriver();
		dri.get("http://demoqa.com/registration/");
		List<WebElement> rd=dri.findElements(By.xpath("//input[@type='checkbox']"));
for (WebElement rad:rd)
{
	String val=rad.getAttribute("value");
	System.out.println(val);
	
if(val.equalsIgnoreCase("dance")||val.equalsIgnoreCase("cricket "))
		{
	rad.click();
				}

}
	}

}
