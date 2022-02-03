package Selenium;
//Postoji pesma koja je himna ITBootcampa: https://www.youtube.com/watch?v=dQw4w9WgXcQ
//Vas domaci zadatak je da otvorite pretrazivac, odete na youtube i pustite Rick Astley-a

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DomaciHimna {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); 
        WebDriver driver = new ChromeDriver(); 
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(15)); 
        driver.manage().window().maximize(); 
        driver.navigate().to("https://www.youtube.com/");

        WebElement searchInput = driver.findElement(By.name("search_query"));
        searchInput.click();
        searchInput.sendKeys("Rick Astley");

        WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
        searchButton.click();

        Thread.sleep(2000);

        WebElement playSong = driver.findElement(By.cssSelector(".yt-simple-endpoint.style-scope.ytd-video-renderer"));
        playSong.click();

        Thread.sleep(5000);
        driver.close();
    }
}

