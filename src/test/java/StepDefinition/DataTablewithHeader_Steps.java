package StepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class DataTablewithHeader_Steps {
   WebDriver driver;
    @Given("^User is on OrangeHRM Home Page$")
    public void user_is_on_OrangeHRM_Home_Page() throws Throwable {
        System.out.println("<-------Entering the google page----->");
        System.setProperty("webdriver.chrome.driver", "C:/Users/thiru/IdeaProjects/CucumberProject/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

    }

    @When("^User Navigate to OrangeHRM  LogIn Page$")
    public void user_Navigate_to_OrangeHRM_LogIn_Page() throws Throwable {
        System.out.println("Successfully Opened The HRM Page");

    }

    @When("^User enters Valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_Valid_and(DataTable dataTable) throws Throwable {
        List<Map<String,String>> keyvaluepair = dataTable.asMaps(String.class,String.class);
        String username1=keyvaluepair.get(0).get("username");
        String password1=keyvaluepair.get(1).get("password");
        driver.findElement(By.id("txtUsername")).sendKeys(username1);
        driver.findElement(By.id("txtPassword")).sendKeys(password1);

    }

    @Then("^Message displayed Login Successfully\\.\\.\\.\\.>$")
    public void message_displayed_Login_Successfully() throws Throwable {
        driver.findElement(By.id("btnLogin")).click();
    }

}
