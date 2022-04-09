package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Categories {
	
	WebDriver driver;
	public Categories(WebDriver driver) {
		
		this.driver = driver;
	}
	


	public void Launchbrowser() {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void openURL() {
		driver.get("https://www.demoblaze.com/");
	}

	public void clickoncategories() {
		WebElement categories = driver.findElement(By.xpath("//*[@id=\'cat\']"));
		categories.click();
	}

	public void clickonphone() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='list-group']//a[contains(text(),'Phones')]")).click();
		System.out.println("Phone click");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(text(),'Iphone')]")).click();

	}

	
	public void clickonLaptops() {
		driver.findElement(By.xpath("//div[@class='list-group']//a[contains(text(),'Laptops')]")).click();
		driver.findElement(By.xpath("(//a[@href='prod.html?idp_=15'])[2]")).click();

	}

	public void clickonMonitors() {
		driver.findElement(By.linkText("Monitors")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
	}

	public void close_browser() {
		driver.close();
	}
}