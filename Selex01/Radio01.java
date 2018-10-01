package Selex01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio01 {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dri=new FirefoxDriver();
		dri.get("http://demoqa.com/registration/");
		List<WebElement> rd=dri.findElements(By.xpath("//input[@type='radio']"));
for (WebElement rad:rd)
{
	String val=rad.getAttribute("value");
	System.out.println(val);
	
if(val.equalsIgnoreCase("married"))
		{
	rad.click();
	break;
			}

}
	}

}
