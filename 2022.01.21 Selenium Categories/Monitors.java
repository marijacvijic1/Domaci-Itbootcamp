package Domaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Monitors {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement monitors;

    public Monitors(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getMonitors() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"));
    }

    public List<WebElement> getCategoryElements() {
        return driver.findElements(By.cssSelector("div.card.h-100"));
    }


    public void clickMonitors(){
        this.getMonitors().click();
    }

    public String getCategoryName() {
        return this.getMonitors().getText();
    }
    public void clickAddToCart() {
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
    }

    public void clickAssusFullHd(){
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/h4/a")).click();
    }
}
