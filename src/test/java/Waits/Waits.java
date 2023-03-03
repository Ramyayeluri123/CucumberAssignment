package Waits;

import constant.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    WebDriver driver;
    Constant Constant;
  WebDriverWait waits;

    public Waits(WebDriver seleniumwaitdriver)
    {
         Constant=new Constant();

        waits = new WebDriverWait(seleniumwaitdriver, Duration.ofSeconds(Constant.waitFor));

    }

    public WebElement waitForElementToClick(WebElement element)
    {

        WebElement element1 = waits.until(ExpectedConditions.elementToBeClickable(element));
        return element1;

    }
}
