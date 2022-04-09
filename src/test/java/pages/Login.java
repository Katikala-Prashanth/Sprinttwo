package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	By Loginid = By.id("loginusername");
	By Loginpassword = By.id("loginpassword");
	By Loginoption = By.xpath("//a[@id='login2']");
	By Loginbttn = By.xpath("//button[text()='Log in']");

	public Login(WebDriver driver) {

		this.driver = driver;
		// PageFactory.initElements(this, driver);
	}

	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
	}

	public void LoginCredential(String email, String Upassword) {

		driver.findElement(Loginoption).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(Loginid).sendKeys(email);
		driver.findElement(Loginpassword).sendKeys(Upassword);
	}

	public void ClickonLogin() {
		driver.findElement(Loginbttn).click();
	}

	public void VerifyLogin(String expectedTittle) {

		String tittle = driver.getTitle();
		System.out.println("Title of page :" + tittle);
		Assert.assertEquals(tittle, expectedTittle);
		// wait.until(ExpectedConditions.alertIsPresent();

	}

}
