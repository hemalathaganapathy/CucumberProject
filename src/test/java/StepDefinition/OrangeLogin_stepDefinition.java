package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLogin_stepDefinition {
    WebDriver driver;
    @Given("^User  Enter into The OrangeHRM Page$")
    public void user_Enter_into_The_OrangeHRM_Page() throws Throwable {
        System.out.println("<-------Entering the google page----->");
        System.setProperty("webdriver.chrome.driver", "C:/Users/thiru/IdeaProjects/CucumberProject/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

    }

    @When("^User Giving the Credentials$")
    public void user_Giving_the_Credentials() throws Throwable {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

    }

    @When("^Click the login Button$")
    public void click_the_login_Button() throws Throwable {
        driver.findElement(By.id("btnLogin")).click();

    }

    @Then("^print user successfully logged in$")
    public void print_user_successfully_logged_in() throws Throwable {

        System.out.println("User is Successfully logged in OrangeHRM");

    }

    @When("^User LogOut from the Application$")
    public void user_LogOut_from_the_Application() throws Throwable {
      //  driver.findElement(By.linkText("Welcome Paul")).click();
        //driver.findElement(By.linkText("Logout")).click();

    }

    @Then("^Message displayed LogOut Successfully$")
    public void message_displayed_LogOut_Successfully() throws Throwable {

        System.out.println("User is successfully Logged out");

    }

}
