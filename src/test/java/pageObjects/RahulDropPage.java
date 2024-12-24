package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RahulDropPage {

public RahulDropPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
}
  @FindBy(xpath = "//select[@id='dropdown-class-example']")
    WebElement drop1;
public void clickdrop1() {
    Select select = new Select(drop1);
    select.selectByIndex(2);
}
}



