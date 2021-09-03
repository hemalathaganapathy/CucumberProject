package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
    WebDriver driver;
    @Given("^user is entering google\\.com$")
    public void user_is_entering_google_com() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("<-------Entering the google page----->");
        System.setProperty("webdriver.chrome.driver", "C:/Users/thiru/IdeaProjects/CucumberProject/src/main/resources/chromedriver.exe");
       driver = new ChromeDriver();
        driver.get("http://www.google.com");

    }

    @When("^user clicks the search box$")
    public void user_clicks_the_search_box() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).click();

    }

    @When("^types the search term as \"([^\"]*)\"$")
    public void types_the_search_term_as(String searchTerm) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(searchTerm);

    }

    @Then("^the user should see the search results for Agniprasath$")
    public void the_user_should_see_the_search_results_for_Agniprasath() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should enter the search result");

    }

}
