package gethired;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class getHired {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        Actions action = new Actions(driver);

        //open url gethired
        driver.get("https://gethired.id/");

        // klik button Masuk
        WebElement elemen_masuk=driver.findElement(By.xpath("//*[@id='gethired-nav']/ul/li[1]/a"));
        elemen_masuk.click();

        // input username and password
        WebElement element_username=driver.findElement(By.xpath("//*[@name='username']"));
        WebElement element_password=driver.findElement(By.xpath("//*[@name='password']"));
        element_username.sendKeys("christysilalahi05@gmail.com");
        element_password.sendKeys("silalahi123");

        // klik button submit login
        WebElement element_submit_login=driver.findElement(By.xpath("//*[@id='profesional']/form/button"));
        element_submit_login.click();

        // klik menu devcode
        WebElement element_devcode=driver.findElement(By.xpath("//*[@id='gethired-nav']/ul/li[1]/a"));
        element_devcode.click();

        // klik submit
        WebElement element_menu=driver.findElement(By.xpath("//*[@id='menu-item-1880']/a"));
        action.moveToElement(element_menu).perform();
        WebElement element_submit=driver.findElement(By.xpath("//*[@id='menu-item-1881']/a"));
        element_submit.click();

        WebDriverWait w = new WebDriverWait(driver,3);
        // presenceOfElementLocated condition
        w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//*[@class='css-1pkf4yu']")));

        // close chrome
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.close();
    }
}
