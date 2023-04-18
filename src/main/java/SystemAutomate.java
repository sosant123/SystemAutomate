import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import util.utils;

public class SystemAutomate {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        String actualUrl = "https://www.saucedemo.com/";
        driver.get(actualUrl);
        driver.manage().window().maximize();

/*login credentials*/

        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

       utils.delay(500);

     /*  WebElement actualPageProduct = driver.findElement(By.id("item_4_title_link"));
       String expectedPageProduct = "Sauce Labs Backpack";
       Assert.isTrue(expectedPageProduct.equals(actualPageProduct.getText(), "Sauce Labs Backpack not found"));

           driver.get("https://www.saucedemo.com/inventory.html");
           String myTitle = driver.getTitle();
            system.out.println(myTitle);
            String expected_title= "Swag Labs"
    Assert.asserttrue(myTitle, expected_title);
        system.out.println(myTitle);*/


// Item Added to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        utils.delay(2000);

        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        utils.delay(2000);

        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        utils.delay(2000);

        driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
        utils.delay(2000);

        //remove item from cart
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
        utils.delay(2000);
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        utils.delay(2000);
        driver.findElement(By.id("checkout")).click();
        utils.delay(2000);

        //Detail Information
        driver.findElement(By.id("first-name")).sendKeys("Sushant");
        utils.delay(2000);
        driver.findElement(By.id("last-name")).sendKeys("Pudasaini");
        utils.delay(2000);
        driver.findElement(By.id("postal-code")).sendKeys("44070");
        utils.delay(2000);
        driver.findElement(By.id("continue")).click();
        utils.delay(2000);
        driver.findElement(By.id("finish")).click();
        utils.delay(2000);
        driver.findElement(By.id("back-to-products")).click();
        utils.delay(2000);

//for logout after shopping
       driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button")).click();
        utils.delay(2000);

        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")).click();
        utils.delay(2000);

       driver.close();


    }
}