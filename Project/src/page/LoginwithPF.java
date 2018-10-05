package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginwithPF {
	WebDriver dri;
	//By user=By.name(Proreader.getlocator("username_name"));
	//By pwd=By.name(Proreader.getlocator("Password_name"));
	
	@FindBy(how=How.NAME,using="userName")
	@CacheLookup
	WebElement user;
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement pwd;
	@FindBy(how=How.NAME,using="login")
	@CacheLookup
	WebElement log;
	
	public void login(String uname,String upwd)
	{
	user.sendKeys(uname);
	pwd.sendKeys(upwd);
	log.click();
	}
	public void logout()
	{
		
		dri.findElement(By.linkText("SIGN-OFF")).click();
	}

}
