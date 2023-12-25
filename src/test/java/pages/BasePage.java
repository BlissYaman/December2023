package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtils;
import utilities.Driver;


public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
   }



}