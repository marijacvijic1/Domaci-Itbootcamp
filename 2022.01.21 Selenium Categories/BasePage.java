package Domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

public class BasePage {


    public WebDriver driver;
    public WebDriverWait wdwait;
    public Phones phonescategory;
    public Laptops laptopscategory;
    public Monitors monitorscategory;


    @BeforeClass
    public void setUP() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        phonescategory = new Phones(driver, wdwait);
        laptopscategory = new Laptops(driver, wdwait);
        monitorscategory = new Monitors(driver, wdwait);
    }

    @AfterClass
    public void tearDown() {
       driver.close();
        driver.quit();
    }

    public void clickCart() {
        driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[4]/a")).click();
    }

    public void clickHome(){
        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
    }

    public List<WebElement> getCartElements() {
        return driver.findElements(By.className("success"));
    }
}
