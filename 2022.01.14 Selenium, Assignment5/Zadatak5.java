package Selenium;
//Ulogovati se na sajt https://demoqa.com/ preko kolacica, izlogovati se i asertovati da je korisnik izlogovan

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Zadatak5 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/login");

        /*WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("Dragana88");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Dragana88@@");

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();*/

        Cookie kolacic = new Cookie("userName", "Dragana88");
        driver.manage().addCookie(kolacic);


        Cookie kolacic2 = new Cookie("userId", "7e166942-13fd-486d-92b2-300fa8ee292e");
        driver.manage().addCookie(kolacic2);


        Cookie kolacic1 = new Cookie("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkRyYWdhbmE4OCIsInBhc3N3b3JkIjoiRHJhZ2FuYTg4QEAiLCJpYXQiOjE2NDIyODMyNjZ9.yY4NO1dEbloVoZcwCmehVNIJOnh5VI_1aYwz-h74kuo");
        driver.manage().addCookie(kolacic1);


        Cookie kolacic3 = new Cookie("expires","2022-01-22T21%3A47%3A46.320Z");
        driver.manage().addCookie(kolacic3);
        driver.navigate().refresh();

        WebElement logOut = driver.findElement(By.id("submit"));
        logOut.click();

        // radimo Assert da li je korisnik izlogovan
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        WebElement logOutButton = driver.findElement(By.id("submit"));
        Assert.assertTrue(logOutButton.isDisplayed());

    }

}
