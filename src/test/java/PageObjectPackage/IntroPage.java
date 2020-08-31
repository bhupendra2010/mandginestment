package PageObjectPackage;

import org.example.commonpackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class IntroPage extends DriverFactory {

    public void whyMandG(){
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.id("MainContentPlaceHolder_ctl00_NavigationControl_TopLevelNav_Text_0"))).build().perform();
        act.moveToElement(driver.findElement(By.id("MainContentPlaceHolder_ctl00_NavigationControl_TopLevelNav_Level2Links_0_Text_0"))).click().build().perform();
        driver.findElement(By.linkText("Contact M&G")).click();

    }
    public void contactemail(){
        driver.findElement(By.cssSelector("a[class='contact-us-icon write']")).click();
    }
}
