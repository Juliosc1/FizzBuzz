package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.fail;

    public class SeleniumTest {
        private WebDriver driver;
        private final StringBuffer verificationErrors = new StringBuffer();

        @Before
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }

        @Test
        public void webPageTest() {
            driver.get("https://www.sweclockers.com/");
            driver.findElement(By.xpath("//input[@type='text']")).click();
            driver.findElement(By.xpath("//input[@type='text']")).clear();
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rtx 3090");
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
            driver.findElement(By.linkText("Apple M1 Ultra utpresterar inte Nvidia Geforce RTX 3090")).click();
            System.out.println("Page title is: " + driver.getTitle());
        }

        @After
        public void tearDown() {
            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }
    }


