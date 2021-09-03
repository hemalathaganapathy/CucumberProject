package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLoginDataTableWithoutHeader_Steps {
    WebDriver driver;
    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        System.out.println("<-------Entering the google page----->");
        System.setProperty("webdriver.chrome.driver", "C:/Users/thiru/IdeaProjects/CucumberProject/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
        System.out.println("Home Page has been opened");

    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);

    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        driver.findElement(By.id("btnLogin")).click();
        System.out.println("Logged in Successfully");

    }

}
