package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Signup {
	By username = By.id("sign-username");
	By password  = By.id("sign-password");
	By signoption = By.xpath("//a[@id=\"signin2\"]");
	By signupbttn = By.xpath("//button[text()='Sign up']");
	public WebDriver driver;
	public Signup(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(this, driver);
	}
	
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		
	}
	
	public void EnterCredential(String email,String Upassword)  {
		driver.findElement(signoption).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(username).sendKeys(email);
		driver.findElement(password).sendKeys(Upassword);
	}
	public void ClickonSignup() {
		driver.findElement(signupbttn).click();
	}

	public void VerifyAlertNewUsertwo(String alertmsg) {
		
		WebDriverWait wait = new WebDriverWait(driver,4);

		wait.until(ExpectedConditions.alertIsPresent());
		String ActualAlert= driver.switchTo().alert().getText();
		System.out.println("Feature..."+alertmsg);
		Assert.assertEquals(ActualAlert,alertmsg);
		//wait.until(ExpectedConditions.alertIsPresent();
		driver.switchTo().alert().accept();
	}
	public void closeapp() {
		 driver.close();
	}
	//driver.findElement(By.id("sign-username")).sendKeys("values to send");

}
