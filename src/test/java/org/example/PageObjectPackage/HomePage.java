package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends DriverFactory {

    @FindBy(id = "DestinationFrom1")
    WebElement departFromBox;
    public void flyingfrom(){
        departFromBox.sendKeys("Lon");
        List<WebElement> destionations = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
        for (WebElement destionation : destionations){
            System.out.println(destionation.getText());
            //if (destionation.getText().contains("London Heathrow Airport (LHR), UK")){ // copy and paste form DOM not type!!
               // destionation.click();
               // break;
            //}
        }
    }
    @FindBy(id = "DestinationTo")
    WebElement destionationbox;
    public void flyingto() {
        destionationbox.sendKeys("Bar");

        List<WebElement> destionations = driver.findElements(By.cssSelector(".ui-menu-item"));
        for (WebElement destionation : destionations){
            System.out.println(destionation.getText());
            //if (destionation.getText().contains("London Heathrow Airport (LHR), UK")){ // copy and paste form DOM not type!!
               // destionation.click();
                //break;
            //}
        }
    }


    @FindBy(id = "deptdt")
    WebElement departingCalender;

    public void dapartingCalandar(){
        departingCalender.click();

        List<WebElement> options = driver.findElements(By.cssSelector(".ui-state-default"));
        for (WebElement option : options){
            System.out.println(option.getText());
            if (option.getText().contains("27")){
                option.click();
                //break;
            }
        }}
        @FindBy(id = "rtndt")
        WebElement returCalandar;

        public void returningCalandar() {
            departingCalender.click();

            List<WebElement> options = driver.findElements(By.cssSelector(".ui-state-default"));
            for (WebElement option : options) {
                System.out.println(option.getText());
                if (option.getText().contains("17")) {
                    option.click();
                    break;
                }
            }
        }

    @FindBy(id = "AdultCnt")
    WebElement adultSelection;
    public void adultBox(){
        Select sel = new Select(adultSelection);
        sel.selectByValue("5");
    }


}