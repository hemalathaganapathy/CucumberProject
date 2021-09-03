package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class OrangeHRMwithoutExample_Steps {
    WebDriver driver;
    @Given("^User  Enter into The OrangeHRM Page without example keywors$")
    public void user_Enter_into_The_OrangeHRM_Page_without_example_keywors() throws Throwable {
        System.out.println("<-------Entering the google page----->");
        System.setProperty("webdriver.chrome.driver", "C:/Users/thiru/IdeaProjects/CucumberProject/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

    }




    @When("^User Giving the Credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_Giving_the_Credentials_and(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);

    }

    @When("^Click the login Button without example keywors$")
    public void click_the_login_Button_without_example_keywors() throws Throwable {
        driver.findElement(By.id("btnLogin")).click();

    }

    @Then("^print user successfully logged in without example keywors$")
    public void print_user_successfully_logged_in_without_example_keywors() throws Throwable {
        System.out.println("User is Successfully logged in OrangeHRM");

    }

    @When("^User LogOut from the Application without example keywors$")
    public void user_LogOut_from_the_Application_without_example_keywors() throws Throwable {
      /*  WebElement welcomemenu = driver.findElement(By.id("welcome"));
        Select dropdown = new Select(welcomemenu);
        dropdown.selectByVisibleText("Logout");*/

        System.out.println("User is Successfully logged in OrangeHRM");

    }

    @Then("^Message displayed LogOut Successfully without example keywors$")
    public void message_displayed_LogOut_Successfully_without_example_keywors() throws Throwable {
        System.out.println("<------User is Successfully logged out OrangeHRM------>");

    }


}
