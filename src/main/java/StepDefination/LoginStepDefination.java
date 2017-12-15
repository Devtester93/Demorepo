//package StepDefination;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefination {
//	WebDriver driver;
//	@Given("^user is already on Login Page$")
//	public void User_OnLogin()
//	{
//		System.setProperty("webdriver.chrome.driver", "F:/Selenium_Framework/chromedriver.exe");
//		  driver=new ChromeDriver();	
//		 driver.get("https://www.freecrm.com/index.html");	 
//	}
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM()
//	{
//	String title=driver.getTitle();
//	System.out.println(title);
//	Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
//	}
//	@Then("^user enters \"([^\"]*)\" and user enters \"([^\"]*)\"$")
//	public void user_enters_username_and_user_enters_password(String username,String password)
//	{
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
//	}
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	}
//	@Then("^user is on home page$")
//	public void user_is_on_home_page()
//	{
//		String current_title=driver.getTitle();
//		System.out.println(current_title);
//		Assert.assertEquals("CRMPRO",current_title);
//	}
//	@And("^Close the browser$")
//	public void close_the_browser()
//	{
//		driver.quit();
//	}
//}
