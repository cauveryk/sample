package Selex01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dri=new FirefoxDriver();
		dri.get("http://newtours.demoaut.com/");
		dri.findElement(By.xpath("//input[@name='userName']")).sendKeys("123");
		
		
		dri.findElement(By.cssSelector("input[name=password]")).sendKeys("123");
		dri.findElement(By.cssSelector("input[name=login]")).click();
		

	}

}
