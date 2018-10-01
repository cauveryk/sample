package Selex01;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selweb {
	
	public static void main(String[] args)
	{
		Logger log = Logger.getLogger(Selweb.class);
		PropertyConfigurator.configure("C:\\Users\\CHAN\\eclipse-workspace\\Seleniumex\\src\\resources\\log4j.properties");
		
		WebDriver dri=new FirefoxDriver();
		log.info("*********");
		dri.get("http://newtours.demoaut.com/");
		
		
		dri.findElement(By.name("userName")).sendKeys("123");
		dri.findElement(By.name("password")).sendKeys("123");
		dri.findElement(By.name("login")).click();
		dri.findElement(By.linkText("SIGN-OFF")).click();
		
		
		
		
	}

}
