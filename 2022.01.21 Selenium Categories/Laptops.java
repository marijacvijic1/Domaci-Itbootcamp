package Domaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Laptops {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement laptops;

    public Laptops(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getLaptops() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"));
    }

    public List<WebElement> getCategoryElements() {
        return driver.findElements(By.cssSelector("div.card.h-100"));
    }


    public void clickLaptops(){
        this.getLaptops().click();
    }

    public String getCategoryName() {
        return this.getLaptops().getText();
    }

    public void clickSonyVaioI5(){
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a")).click();
    }
    public void clickMacBookAir(){
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[3]/div/div/h4/a")).click();
    }
    public void clickAddToCart() {
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
    }
}
