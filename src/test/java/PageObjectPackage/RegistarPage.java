package PageObjectPackage;

import commonpackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class RegistarPage extends DriverFactory {

    public void contact(){
        driver.findElement(By.id("MainContentPlaceHolder_ctl00_NavigationControl_TopLevelNav_Text_7")).click();
        driver.findElement(By.cssSelector("a[class='contact-us-icon email']")).click();
        //String parentwinhandle=driver.getWindowHandle();
        //WebElement newwinhandle=
        driver.findElement(By.cssSelector("img[src='http://www.mandg.co.uk/-/media/Images/My-Account-Screenshot.png']")).click();
        driver.switchTo().activeElement();

        //driver.navigate().forward();
        JavascriptExecutor jh=(JavascriptExecutor)driver;
        jh.executeScript("window.scrollBy(0,document)");
        driver.findElement(By.id("register-btn")).click();
    }
}
