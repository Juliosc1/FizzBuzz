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

        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.getString(3));

    }
}
