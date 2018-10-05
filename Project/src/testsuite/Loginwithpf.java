package testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import browser.Choosebrowser;
import page.LoginwithPF;

public class Loginwithpf {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d=Choosebrowser.getdriver("firefox", "http://newtours.demoaut.com/");
		//Login tc=new Login(d);
		LoginwithPF tc=PageFactory.initElements(d, LoginwithPF.class);
		tc.login("123","123");
		tc.logout();
		
	}

}
