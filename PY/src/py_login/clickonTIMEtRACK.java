package py_login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class clickonTIMEtRACK extends test_login {
	@Test(priority=3)
	public void time_track() {
		dr1.findElement(By.xpath("//div[text()='TIME-TRACK']")).click();
		
	System.out.println("changes for only ");
	}
	@Test(priority=4)
	public void click_on_calender() throws InterruptedException  {
	Thread.sleep(5000);
		dr1.findElement(By.xpath("//button[text()='Mar 30 - Apr 05, 2020']")).click();
		
		
	}

}
