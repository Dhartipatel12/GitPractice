package stepDef;

import configFile.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RahulPracticePage;

public class RahulPracticeTest {
    RahulPracticePage rahulPracticePage;//create object of page class in step def class.
    //we have defined it globally so that we can use it in each method in step def class.
    @Given("the profile link is loaded in the browser")
    public void the_profile_link_is_loaded_in_the_browser() {
        rahulPracticePage = new RahulPracticePage(BaseClass.getDriver());
    }
    @When("user should navigate to the practice page")
    public void user_should_navigate_to_the_practice_page() {

    }
    @Then("user can click on Radio Button Example")
    public void user_can_click_on_radio_button_example() {
        rahulPracticePage.clickradio1();
    }



}
