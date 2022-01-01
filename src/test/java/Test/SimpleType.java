package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

        public class SimpleType {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        driver.get("https://accounts.google.com/");

             driver.findElement(By.name("identifier")).sendKeys("a.rajini26@gmail.com");
             driver.findElement(By.id("identifierNext")).sendKeys(Keys.RETURN);
        }


    }

