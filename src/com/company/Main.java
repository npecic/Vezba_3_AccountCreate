package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\NemanjaPecic\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.automationpractice.pl/index.php");

        driver.findElement(By.className("login")).click();

        driver.findElement(By.cssSelector("#email_create")).sendKeys("tes1tww23@test.com");

        driver.findElement(By.id("SubmitCreate")).click();

        driver.findElement(By.id("id_gender1")).click();

        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Ime");

        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Prezime");

        driver.findElement(By.id("email")).clear();

        driver.findElement(By.id("email")).sendKeys("test2122we@test.com");

        driver.findElement(By.id("passwd")).sendKeys("password");

        Select select1 = new Select(driver.findElement(By.id("days")));
        select1.selectByIndex(5);

        Select select2 = new Select(driver.findElement(By.id("months")));
        select2.selectByIndex(6);

        Select select3 = new Select(driver.findElement(By.id("years")));
        select3.selectByValue("1985");

        driver.findElement(By.id("submitAccount")).click();



    }
}