package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Choosebrowser {
	static WebDriver dri;
	public static WebDriver getdriver(String bname,String URL) throws InterruptedException
	{
		if(bname.equalsIgnoreCase("Firefox"))
		{
			dri=new FirefoxDriver();
		}
		else if(bname.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\CHAN\\Downloads\\chromedriver.exe");
			dri=new ChromeDriver ();
			
			
		}
		dri.get(URL);
		dri.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		dri.manage().window().maximize();
		Thread.sleep(2000);
		return dri;
	}

}
