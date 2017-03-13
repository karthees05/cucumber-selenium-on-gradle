package cz.najman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java8.En;

import static org.junit.Assert.assertEquals;

public class LoadPageStepDef implements En {

    private WebDriver driver;

    public LoadPageStepDef() {
        Before(() -> {
            System.setProperty("webdriver.chrome.driver", "c:\\temp\\chromedriver.exe");
            driver = new ChromeDriver();
        });

        When("^User opens google page$", () -> driver.get("http://www.google.com"));

        Then("^Google site is rendered$", () -> assertEquals("Google", driver.getTitle()));

        After(() -> driver.quit());
    }
}