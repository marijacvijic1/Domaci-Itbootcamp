package Domaci;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCategory extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/index.html");
    }

    @Test
    public void getPhonesElements() throws InterruptedException {
        phonescategory.clickPhones();
        Thread.sleep(1000);
        List<WebElement> elementsFromPhoneCategory = phonescategory.getCategoryElements();


        int ukupnaCena = 0;
        System.out.println(phonescategory.getCategoryName());
        int stavka = 1;
        for (WebElement phone : elementsFromPhoneCategory) {
            System.out.println("Item " + stavka + ":");
            String[] parts = phone.getText().split("\n");
            System.out.println("  Title: " + parts[0]);
            System.out.println("  Description: " + parts[2]);
            System.out.println("  Price: " + parts[1]);

            int cena = Integer.valueOf(parts[1].substring(1));
            ukupnaCena = ukupnaCena + cena;
            stavka++;
        }

        System.out.println("Total items from " + phonescategory.getCategoryName() + " = " + elementsFromPhoneCategory.size());
        System.out.println("The total price of all products from " + phonescategory.getCategoryName() + " = " + ukupnaCena + "$");
    }

        @Test
        public void getLaptopElements() throws InterruptedException {
            laptopscategory.clickLaptops();
            Thread.sleep(1000);
            List<WebElement> elementsFromLaptopsCategory = laptopscategory.getCategoryElements();

            int ukupnaCena1 = 0;
            System.out.println(laptopscategory.getCategoryName());
            int stavka1 = 1;
            for(WebElement laptop : elementsFromLaptopsCategory) {
                System.out.println("Item " + stavka1 + ":");
                String[] parts = laptop.getText().split("\n");
                System.out.println("  Title: " + parts[0]);
                System.out.println("  Description: " + parts[2]);
                System.out.println("  Price: " + parts[1]);

                int cena1 = Integer.valueOf(parts[1].substring(1));
                ukupnaCena1 = ukupnaCena1 + cena1;
                stavka1++;
            }
            System.out.println("Total items from " + laptopscategory.getCategoryName() + " = " + elementsFromLaptopsCategory.size());
            System.out.println("The total price of all products from " + laptopscategory.getCategoryName() + " = " + ukupnaCena1 + "$");
        }

        @Test
        public void getMonitorElements() throws InterruptedException {
            monitorscategory.clickMonitors();
            Thread.sleep(1000);
            List<WebElement> elementsFromMonitorsCategory = monitorscategory.getCategoryElements();

            int ukupnaCena2 = 0;
            System.out.println(monitorscategory.getCategoryName());
            int stavka2 = 1;
            for (WebElement monitor : elementsFromMonitorsCategory) {
                System.out.println("Item " + stavka2 + ":");
                String[] parts = monitor.getText().split("\n");
                System.out.println("  Title: " + parts[0]);
                System.out.println("  Description: " + parts[2]);
                System.out.println("  Price: " + parts[1]);

                int cena2 = Integer.valueOf(parts[1].substring(1));
                ukupnaCena2 = ukupnaCena2 + cena2;
                stavka2++;
            }
            System.out.println("Total items from " + monitorscategory.getCategoryName() + " = " + elementsFromMonitorsCategory.size());
            System.out.println("The total price of all products from " + monitorscategory.getCategoryName() + " = " + ukupnaCena2 + "$");
        }


    @Test
    public void addThreePhonesToCart() throws InterruptedException {
        Thread.sleep(1000);
        phonescategory.clickSamsungS6();
        Thread.sleep(1000);
        phonescategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickHome();
        Thread.sleep(1000);
        phonescategory.clickNexus6();
        Thread.sleep(1000);
        phonescategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickHome();
        Thread.sleep(1000);
        phonescategory.clickSamsungS7();
        Thread.sleep(1000);
        phonescategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickCart();
        Thread.sleep(1000);
        int expectedResult = 3;
        Assert.assertEquals(getCartElements().size(), expectedResult );

    }
 @Test
    public void addThreeDifferentItems1() throws InterruptedException{
        Thread.sleep(1000);
        laptopscategory.clickLaptops();
        Thread.sleep(1000);
        laptopscategory.clickSonyVaioI5();
        Thread.sleep(1000);
     laptopscategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickHome();
        laptopscategory.clickLaptops();
        Thread.sleep(1000);
        laptopscategory.clickMacBookAir();
        Thread.sleep(1000);
        laptopscategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickHome();
        monitorscategory.clickMonitors();
        Thread.sleep(1000);
        monitorscategory.clickAssusFullHd();
        Thread.sleep(1000);
        monitorscategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickCart();
        Thread.sleep(1000);
        int expectedResult = 3;
        Assert.assertEquals(getCartElements().size(), expectedResult);
    }

    @Test
    public void addThreeDifferentItems2() throws InterruptedException {
        Thread.sleep(1000);
        phonescategory.clickPhones();
        Thread.sleep(1000);
        phonescategory.clickSamsungS6();
        Thread.sleep(1000);
        phonescategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickHome();
        laptopscategory.clickLaptops();
        Thread.sleep(1000);
        laptopscategory.clickMacBookAir();
        Thread.sleep(1000);
        laptopscategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickHome();
        monitorscategory.clickMonitors();
        Thread.sleep(1000);
        monitorscategory.clickAssusFullHd();
        Thread.sleep(1000);
        monitorscategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickCart();
        Thread.sleep(1000);
        int expectedResult = 3;
        Assert.assertEquals(getCartElements().size(), expectedResult);

    }


}
