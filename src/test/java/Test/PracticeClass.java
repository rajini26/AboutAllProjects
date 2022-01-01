package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeClass {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        driver.get("https://accounts.google.com/");

        WebElement bb;
        bb = driver.findElement(By.name("identifier"));
        bb.sendKeys("queen");
    }
}
