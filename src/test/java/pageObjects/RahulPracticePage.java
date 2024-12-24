package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RahulPracticePage {
public RahulPracticePage(WebDriver driver){
            PageFactory.initElements(driver,this);
        }
        @FindBy(xpath = "//input[@value='radio1']")
        WebElement radio1;

        public void clickradio1(){
            radio1.click();// For Click action
        }

    }





