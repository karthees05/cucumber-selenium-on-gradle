package com.kar.steps;

import cucumber.api.java8.En;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class LoadPageStepDef implements En {

    private WebDriver driver;
    private String today;

    /*public LoadPageStepDef() throws AWTException {
        Before(() -> {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijayarupha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
            driver = new ChromeDriver();
           *//* System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijayarupha\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();*//*

            driver.manage().window().maximize();
//            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.get("https://www.google.com/");
            driver.get("https://www.makemytrip.com/");

        });

        When("^User opens google page$", () -> driver.get("http://www.google.com"));

        Then("^Google site is rendered$", () -> assertEquals("Google", driver.getTitle()));

        After(() -> driver.quit());

    }*/

    public void loadPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijayarupha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
           /* System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijayarupha\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();*/

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://cleartrip.com");


    }

    public void selectDates() {
        Actions act = new Actions(driver);
        String dot = "10/June/2020";
        String date, month, year;
        String caldt, calmonth, calyear;
        /*
         * Spliting the String into String Array
         */
        String dateArray[] = dot.split("/");
        date = dateArray[0];
        month = dateArray[1];
        year = dateArray[2];
        act.moveToElement(driver.findElement(By.xpath("//*[contains(@id,'DepartDate')]")));
        driver.findElement(By.xpath("//*[contains(@id,'DepartDate')]")).click();

        WebElement cal;
/**
 * Select the year
 */
        calyear = driver.findElement(By.className("ui-datepicker-year")).getText();

        while (!calyear.equals(year)) {
            driver.findElement(By.className("nextMonth")).click();
            calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
            System.out.println("The Displayed Year::" + calyear);
        }
/**
 * Select the Month
 */
        calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();

        while (!calmonth.equalsIgnoreCase(month)) {
            driver.findElement(By.className("nextMonth ")).click();
            calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
        }

        cal = driver.findElement(By.className("calendar"));
/**
 * Select the Date
 */
        List<WebElement> rows, cols;
        rows = cal.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) {
            cols = rows.get(i).findElements(By.tagName("td"));
            for (int k = 0; k < cols.size(); k++) {
                caldt = cols.get(k).getText();
                if (caldt.equals(date)) {
                    cols.get(k).click();
                    break;
                }
            }
        }
    }

    private String getCurrentDay() {
        //Create a Calendar Object
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

        //Get Current Day as a number
        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today Int: " + todayInt + "\n");

        //Integer to String Conversion
        String todayStr = Integer.toString(todayInt);
        System.out.println("Today Str: " + todayStr + "\n");

        return todayStr;
    }

    @Test
    public void dateTest() {
        loadPage();
        selectDates();
    }
}