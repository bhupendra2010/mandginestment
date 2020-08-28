package PageObjectPackage;

import org.example.commonpackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InvestPage extends DriverFactory {
    public void baseurl(){
        driver.getCurrentUrl();
        driver.findElement(By.cssSelector("button[title='Continue']")).click();
    }
    public void choose(){
        Actions actions=new Actions(driver);
        WebElement ss=driver.findElement(By.id("MainContentPlaceHolder_ctl00_NavigationControl_TopLevelNav_Link_1"));
        WebElement sp=driver.findElement(By.id("MainContentPlaceHolder_ctl00_NavigationControl_TopLevelNav_Level2Links_1_Text_0"));
        actions.moveToElement(ss).build().perform();
        actions.moveToElement(sp).click().build().perform();
    }
    public void managinginvest(){
        Actions aa=new Actions(driver);
        aa.moveToElement(driver.findElement(By.id("MainContentPlaceHolder_ctl00_NavigationControl_TopLevelNav_Text_3"))).build().perform();
        aa.moveToElement(driver.findElement(By.id("MainContentPlaceHolder_ctl00_NavigationControl_TopLevelNav_Level2Links_3_Text_0"))).click().build().perform();
    }

}
