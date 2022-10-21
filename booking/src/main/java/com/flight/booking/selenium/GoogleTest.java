package com.flight.booking.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
    public static void main(String[] args) {
    	
    	
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.findElement(By.id("L2AGLb")).click();
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("4*4");
        input.submit();
        WebElement result = driver.findElement(By.id("cwos"));
        if(result.equals(19)) {
        System.out.println("Correcto");
        }else {
        	System.err.println("Error");
        }

 
    }
}
