package com.selenium.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1 - Set up the browser driver
        WebDriverManager.chromedriver().setup();

        // 2 - Create instance of the Selenium WebDriver
        WebDriver driver = new ChromeDriver();

        // This line will maximize the browser size
        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        // 3 - Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        // Get title of the page
        String currentTitle = driver.getTitle();
        System.out.println("Current title is: " + currentTitle);

        // 4 - Stop code execution for 3 seconds
        Thread.sleep(3000);

        // 4 - Use Selenium to navigate back
        driver.navigate().back();

        // 4 - Stop code execution for 3 seconds
        Thread.sleep(3000);

        // Use Selenium to navigate forward
        driver.navigate().forward();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // Use Selenium to navigate refresh
        driver.navigate().refresh();

        // Use navigate().to()
        driver.navigate().to("https://www.google.com");

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);

        // Get the current URL using Selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentURL);

        driver.manage().deleteAllCookies();

        // This will close current window
        driver.close();

        // 11 - Quit the driver and clean up
        driver.quit();
    }
}