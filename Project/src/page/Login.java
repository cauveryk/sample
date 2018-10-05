package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Proreader;

public class Login {
	WebDriver dri;
	By user=By.name(Proreader.getlocator("username_name"));
	By pwd=	By.name(Proreader.getlocator("Password_name"));
	public Login(WebDriver dr)
	{
    this.dri=dr;
	}
	public void login(String uname,String upwd)
	{
	dri.findElement(user).sendKeys(uname);
	dri.findElement(pwd).sendKeys(upwd);
	dri.findElement(By.name("login")).click();
	}
	public void logout()
	{
		
		dri.findElement(By.linkText("SIGN-OFF")).click();
	}
}
