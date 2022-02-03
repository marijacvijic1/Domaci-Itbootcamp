package Domaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Phones {


    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement phones;

    public Phones(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPhones() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[2]"));
    }

    public List<WebElement> getCategoryElements() {
        return driver.findElements(By.cssSelector("div.card.h-100"));
    }


    public void clickPhones(){
        this.getPhones().click();
    }

    public String getCategoryName() {
        return this.getPhones().getText();
    }


    public void clickSamsungS6() {
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
    }

    public void clickAddToCart() {
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
    }
    public void clickNexus6(){
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")).click();
    }

    public void clickSamsungS7(){
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a")).click();
    }

}
