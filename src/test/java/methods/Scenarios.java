package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Categories;
import pages.Login;
import pages.Signup;

public class Scenarios extends Baseclass {
	WebDriver driver;

	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		// Sp = new Signup(driver);
		lp = new Login(driver);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		System.out.println(url + "Launched");
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String pwd) {
		Sp = new Signup(driver);
		Sp.EnterCredential(email, pwd);
	}

	@When("Click on Signup")
	public void click_on_Signup() {
		Sp.ClickonSignup();
	}

	@Then("verify alert message as {string}")
	public void verify_alert_message_as(String featurealert) {
		// Sp.VerifyAlertNewUser();
		Sp.VerifyAlertNewUsertwo(featurealert);
	}

	@When("Click on product list from categories")
	public void click_on_product_list_from_categories() {
		Cp.clickoncategories();
	}

	@Then("Verify the product displayed in the list {string}")
	public void verify_the_product_displayed_in_the_list1(String string) throws InterruptedException {
		Cp.clickonphone();
	}

	@When("User enters login Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as_Login(String LoginMail, String LoginPassword) {
		lp = new Login(driver);
		lp.LoginCredential(LoginMail, LoginPassword);
	}

	@When("Click on Login")
	public void click_on_Login() {
		lp.ClickonLogin();
	}

	@Then("Page tittle should be {string}")
	public void page_tittle_should_be(String FeatureTittle) {
		lp.VerifyLogin(FeatureTittle);
	}

	@Then("close browser")
	public void close_browser() {
//		Sp.closeapp();
		driver.close();
	}

}