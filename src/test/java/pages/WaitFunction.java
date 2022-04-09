package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFunction {
	WebDriver driver;
	WebDriverWait wait;
	public WaitFunction(WebDriver driver) {
		
		this.driver=driver;
	
	}
	public void Wait() {
		wait = new WebDriverWait(driver,4);
		
	}
	
	
}

