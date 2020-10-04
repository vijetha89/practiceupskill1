package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class steps {
	
	WebDriver driver;
	
	@Before
	public void beforetest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//vijetha//Downloads//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://elearningm1.upskills.in");
		Thread.sleep(2000);
		
	}
	
	@When("i tapped on Sign up!")
	public void i_tapped_on_sign_up() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()=' Sign up! ']")).click();
		Thread.sleep(2000);
	}
	

	@When("i entered First name as {string}")
	public void i_entered_first_name_as(String string) throws InterruptedException {
		
		driver.findElement(By.name("firstname")).sendKeys(string);
		Thread.sleep(2000);	
}

	
	@When("i entered Last name as {string}")
	public void i_entered_last_name_as(String string) throws InterruptedException {
	
		driver.findElement(By.name("lastname")).click();
		driver.findElement(By.name("lastname")).sendKeys(string);
		Thread.sleep(2000);

	}
	
	@When("i entered e-mail {string}")
	public void i_entered_e_mail(String string) throws InterruptedException {
		
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys(string);
		Thread.sleep(2000);

	}
	
	@When("i entered username {string}")
	public void i_entered_username(String string) throws InterruptedException {
	  
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys(string);
		Thread.sleep(2000);
		
	}
	
	@When("i entered  Pass {string}")
	public void i_entered_pass(String string) throws InterruptedException {
	   
		driver.findElement(By.name("pass1")).click();
		driver.findElement(By.name("pass1")).sendKeys(string);
		Thread.sleep(2000);	

	}
	
	@When("i entered  Confirm Pass {string}")
	public void i_entered_confirm_pass(String string) throws InterruptedException {
		
		driver.findElement(By.name("pass2")).click();
		driver.findElement(By.name("pass2")).sendKeys(string);
		Thread.sleep(2000);

	}
	
	@When("i tapped on Register")
	public void i_tapped_on_register() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		String exp = driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-12']/p[1]")).getText();
	}
	
	@When("i tapped on Compose Email")
	public void i_tapped_on_compose_email() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.className("dropdown-toggle")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.linkText("Inbox")).click();
	   Thread.sleep(2000);
//	   driver.findElement(By.linkText("Compose message")).click();
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//img[@tittle='Compose message']")).click();
//	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//div[@class='col-sm-6']/a[1]")).click();
	   Thread.sleep(2000);
	   
//	   Select s = new Select(driver.findElement(By.id("compose_message_users")));
//	   s.selectByIndex(1);
	   
	}
	
	@When("i entered SendTo")
	public void i_entered_send_to() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.className("select2-search__field")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.className("select2-search__field")).sendKeys("nav");
	   Thread.sleep(3000);

//	   Actions act = new Actions(driver);
//	   act.sendKeys(Keys.DOWN).perform();
//	   act.sendKeys(Keys.ENTER).perform();
	   
	   driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ARROW_DOWN);
	   driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ARROW_DOWN);
	   driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	   
	}
	
	@When("i entered Subject")
	public void i_entered_subject() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   
		driver.findElement(By.id("compose_message_title")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("compose_message_title")).sendKeys("Hi For Testing");
		Thread.sleep(3000);
	}
	
	@When("i entered Body of email")
	public void i_entered_body_of_email() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	
		
//		driver.findElement(By.id("cke_1_contents")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("cke_1_contents")).sendKeys("Hellowew123");
//		Thread.sleep(3000);
//		driver.findElement(By.id("cke_1_contents")).sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		driver.findElement(By.id("cke_1_contents")).sendKeys("Hellowew123");
//		Thread.sleep(3000);

	}
	
	@When("i tapped on Send button")
	public void i_tapped_on_send_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   
		driver.findElement(By.name("compose")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.)
	}
	
	@Then("i should see success message {string}")
	public void i_should_see_success_message(String string) {
	  
	String success = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
	Assert.assertEquals(success, string);	

	}

	@After
	public void aftertest() {
		
		driver.close();
		
	}

}
