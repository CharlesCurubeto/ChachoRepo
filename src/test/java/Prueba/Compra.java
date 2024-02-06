package Prueba;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Compra {
    public static void main(String[] args) {
        WebDriver driver;

        //   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://staging-na01-bercomat.demandware.net/s/TG/login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("login-form-email")).sendKeys("fmoyanesi@hotmail.com");
        driver.findElement(By.id("login-form-password")).sendKeys("Fbm2023!");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div[4]/div/form[1]/button")).click();

        try {
            Thread.sleep(3000); // 3000 milisegundos = 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.name("q")).sendKeys("400146");
        driver.findElement(By.name("search-button")).click();

        try {
            Thread.sleep(1000); // 3000 milisegundos = 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/div/div[5]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[5]/div/button")).click();

        try {
            Thread.sleep(1000); // 3000 milisegundos = 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(" /html/body/div[1]/header/nav/div[1]/div/div/div[2]/div/div[3]/div/div[1]/a/img[2]"));

        try {
            Thread.sleep(3000); // 3000 milisegundos = 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[1]/div/div/div[2]/div/div[3]/div/div[1]/a/img[2]")).click();



        // Localizar el elemento sobre el cual deseas hacer hover
        WebElement elementToHover = driver.findElement(By.xpath(" /html/body/div[1]/header/nav/div[1]/div/div/div[2]/div/div[3]/div/div[1]/a/img[2]"));

// Crear una instancia de Actions
        Actions actions = new Actions(driver);

        // Realizar hover sobre el elemento
        actions.moveToElement(elementToHover).perform();

        //driver.findElement(By.xpath("//*[@id=\"sg-navbar-collapse\"]/div/div/nav/div[3]/div/ul/li/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"banos\"]")).click();


        //driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[1]/div/div/div[2]/div/div[2]/div/div/form/input[1]")).click();
        //driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[1]/div/div/div[2]/div/div[2]/div/div/form/input[1]")).sendKeys("400146");
        //driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[1]/div/div/div[2]/div/div[2]/div/div/form/button[2]")).click();


    }


}
