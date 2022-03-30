package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();

        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("https://google.com");

        System.out.println(driver.getTitle()); // => "Google"
        System.out.println(driver.getCurrentUrl()); // => "Google"

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5*1000);

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        //Skriv något i textrutan
        searchBox.sendKeys("Selenium");
        System.out.println(searchBox.getAttribute("value"));
        searchButton.click();

        searchBox = driver.findElement(By.name("q"));
        searchBox.getAttribute("value"); // =>"Selenium

        driver.quit();
    }
}
