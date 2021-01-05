package com.kar.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java8.En;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class LoadPageStepDef implements En {

    private WebDriver driver;

    public LoadPageStepDef() {
        Before(() -> {
            /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijayarupha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
            driver = new ChromeDriver();*/
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijayarupha\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();

            driver.manage().window().maximize();
//            driver.manage().deleteAllCookies();
//            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            driver.get("https://www.google.com/");
        });

        When("^User opens google page$", () -> driver.get("http://www.google.com"));

        Then("^Google site is rendered$", () -> assertEquals("Google", driver.getTitle()));

        After(() -> driver.quit());
    }
}