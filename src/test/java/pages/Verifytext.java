package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Verifytext {
    WebDriver driver;

    public Verifytext(WebDriver driver)
    {
        this.driver = driver;
    }


    public  void  textVerification() throws InterruptedException {
        Thread.sleep(3000);
        WebElement verifyText = driver.findElement(By.xpath("//div[@class='SuccessMessage']"));
        boolean result = ((WebElement) verifyText).isDisplayed();
        Assert.assertTrue(result);
        String vr =verifyText.getText();
        System.out.println(vr);


    }

}
