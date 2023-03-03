package org.Steps;

import Actions.SeleniumActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import pages.Swichingframe;
import pages.Verifytext;

public class Steps {
    WebDriver driver;
    SeleniumActions seleniumActions ;
    Verifytext verifyTextClass;

    Swichingframe Swichingframe;



    @Given("open Browser")
    public void Browser() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://compendiumdev.co.uk/");
        driver.manage().window().maximize();
        seleniumActions = new SeleniumActions(driver);
    }

    @Then("Click on contact button on the top menu")
    public void click_on_contact_button_on_the_top_menu() {
        WebElement contactButton = driver.findElement(By.linkText("Contact"));
        seleniumActions.moveElementUsingAction(contactButton);
    }
    @Then("switch to frame")
    public void switch_to_frame() {
        Swichingframe  = new Swichingframe(driver);
        Swichingframe.switchFrame();
    }
    @Then("Filling details with {string} and {string} and  {string}")
    public void filling_details_with_and_and(String string, String string2, String string3) throws InterruptedException {
        Swichingframe .enterDetails(string,string2,string3);

    }
    @Then("verify text")
    public void verify_text() throws InterruptedException {
        verifyTextClass = new Verifytext(driver);
        verifyTextClass.textVerification();

    }


}
