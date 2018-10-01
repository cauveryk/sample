package Selex01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CHAN\\Downloads\\chromedriver.exe");
		WebDriver web=new ChromeDriver ();
		
		web.get("http://newtours.demoaut.com/");
		
		
		
		
		// TODO Auto-generated method stub

	}

}
