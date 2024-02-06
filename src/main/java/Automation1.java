import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Automation1 {
    public static void main(String[] args) {
        //System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Browserdrivers\\msedgedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Browserdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://staging-na01-bercomat.demandware.net/on/demandware.store/Sites-TG-Site");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[3]/div/form/input[1]")).sendKeys("hola");


        //driver.close();
        //driver.quit();
    }

}
