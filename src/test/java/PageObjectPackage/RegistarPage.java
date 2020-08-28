package PageObjectPackage;

import org.example.commonpackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class RegistarPage extends DriverFactory {

    public void contact(){
        driver.findElement(By.id("MainContentPlaceHolder_ctl00_NavigationControl_TopLevelNav_Text_7")).click();
        driver.findElement(By.cssSelector("a[class='contact-us-icon email']")).click();
        String parentwinhandle=driver.getWindowHandle();
        System.out.println(parentwinhandle);
        WebElement newwinhandle= driver.findElement(By.cssSelector("img[src='http://www.mandg.co.uk/-/media/Images/My-Account-Screenshot.png']"));
        newwinhandle.click();
        Set<String> allWindows = driver.getWindowHandles();
        for(String curWindow : allWindows){
            driver.switchTo().window(curWindow);
        }
        driver.findElement(By.id("register-btn")).click();
        //driver.findElement(By.linkText("Register")).click();
        JavascriptExecutor jp=(JavascriptExecutor)driver;
        jp.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }
    public void Details() throws InterruptedException {
        //JavascriptExecutor jp=(JavascriptExecutor)driver;
        //jp.executeScript("window.scrollBy(0,2000");
        driver.findElement(By.cssSelector("div[class='mat-checkbox-inner-container']")).click();
        //driver.findElement(By.id("next")).click();
        driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("firstname")).sendKeys("Aum");
        driver.findElement(By.id("surname")).sendKeys("Nayee");
        driver.findElement(By.id("dob")).sendKeys("07/06/2010");

    }
    public void forms(){
        driver.switchTo().defaultContent();
        driver.findElement(By.id("MainContentPlaceHolder_ctl00_NavigationControl_TopLevelNav_Text_5")).click();
    }
}
