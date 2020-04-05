package py_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test_login {
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	WebDriver dr1=new ChromeDriver();
	
	@Test(priority=0)
	public void login()
	{
		dr1.get("http://localhost:8080/login.do");
		dr1.manage().window().maximize();
		dr1.findElement(By.name("username")).sendKeys("admin");
		dr1.findElement(By.name("pwd")).sendKeys("manager");
		dr1.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
	@Test(priority=1)
	public void click_on_Settings() {
		dr1.findElement(By.xpath("//div[@class=\"popup_menu_icon warning_icon\"]")).click();
	}
	@Test(priority=2)
	public void click_on_Types_of_work() throws InterruptedException {
		Thread.sleep(5000);
		dr1.findElement(By.xpath("//a[text()='Types of Work']")).click();
	
		
	}
	

}
