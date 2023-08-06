package stepsdefinitionpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RememberMe {

	WebDriver driver;
	
	@Given("User must be on homepage by clicking on url {string}")
	public void user_must_be_on_homepage_by_clicking_on_url(String string) {
		//System.setProperty("webdrive.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	}

	@When("User clicks on remember me check box")
	public void user_clicks_on_remember_me_check_box() throws InterruptedException {	
		Thread.sleep(2000);
		driver.findElement(By.className("form-check-input")).click();
	}

	@Then("Remember me check box must get selected")
	public void remember_me_check_box_must_get_selected() {
		boolean a = driver.findElement(By.className("form-check-input")).isSelected();
		System.out.print(a);
		 driver.close();
	}
}
