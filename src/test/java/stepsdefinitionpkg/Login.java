package stepsdefinitionpkg;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;
	
	@Given("User must be on homepage by clicking url {string}")
	public void user_must_be_on_homepage_by_clicking_on_url(String url) {
	    //System.setProperty("webdrive.chrome.driver", "chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@When("^Enter valid (.*) and (.*)$")
	public void enter_valid_allen_and_james(String username, String password) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on signing button")
	public void click_on_signing_button() {
	    driver.findElement(By.id("log-in")).click();
	}

	@Then("User must be navigated to own account")
	public void user_must_be_navigated_to_own_account() {
	    String actual = driver.getCurrentUrl();
	    Assert.assertEquals("https://demo.applitools.com/app.html", actual);
	    driver.close();
	}
	
}
