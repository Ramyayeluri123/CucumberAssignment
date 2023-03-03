package Actions;

import Waits.Waits;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions {
    WebDriver driver;
     Waits Waits;
     Actions Action;

    public  SeleniumActions(WebDriver seleniumactionsdriver)
    {
        this.driver = seleniumactionsdriver;
        Waits =new Waits(seleniumactionsdriver);
    }


    public  boolean moveElementUsingAction(WebElement element)
    {
        Actions action=new Actions(driver);
        boolean flag = false;

        try{
            action.moveToElement(element).build().perform();
//                act.click().build().perform();

            flag =true;
        }
        catch (NoSuchElementException nse)
        {
            flag =false;

        }
        catch (StaleElementReferenceException ste )
        {
            flag= false;

        }
        catch (ElementNotInteractableException eni)
        {
            flag=false;
        }
        return flag;
    }


    public  boolean enterTheInputTextField(WebElement element, String key)
    {
        boolean flag = false;

        try{

            element.sendKeys(key);
            flag =true;
        }
        catch (NoSuchElementException nse)
        {
            flag =false;

        }
        catch (StaleElementReferenceException ste )
        {
            flag= false;

        }
        return flag;
    }

}
