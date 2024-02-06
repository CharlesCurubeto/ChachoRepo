package Prueba;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SeleniumTest {
    WebDriver driver;

    //@BeforeSuite
    public void Setup() {
        //   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://staging-na01-bercomat.demandware.net/s/TG/login/?rurl=1");
        driver.findElement(By.id("login-form-email")).sendKeys("fmoyanesi@hotmail.com");
        driver.findElement(By.id("login-form-password")).sendKeys("Fbm2023!");
        //driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/form[1]/button")).click();



    //* @Test(description = "Positions the cursor on the Password ID by finding said element by ID") //
    //public void findById() {
      //  driver.findElement(By.id("pass")).sendKeys("hola");

    }
}
