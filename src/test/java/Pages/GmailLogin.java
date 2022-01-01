package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
    private static WebElement user = null;

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebElement user = null;
        WebDriverManager.chromedriver().setup();
        driver.get("https://accounts.google.com/");

       // public static WebElement gmailusername () 
            user.findElement(By.name("identifier")).sendKeys(Keys.RETURN);
            //return user;


            // public static WebElement nextOption() {
            // user.findElement(By.name("LgbsSe"));
            // return user;


            // static WebElement Password(WebElement user){
            user.findElement(By.name("password"));
            //return user;
        }
    }







