package stepDef;

import configFile.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RahulDropPage;
import pageObjects.RahulPracticePage;

public class RahulDropTest {
    RahulDropPage rahulDropPage;
    @Given("Profile link is loaded in browser")
    public void profile_link_is_loaded_in_browser() {
    rahulDropPage = new RahulDropPage(BaseClass.getDriver());

    }

    @When("user navigate to practice page")
    public void user_navigate_to_practice_page() {

    }

    @Then("user can select on an option from  Dropdown Example")
    public void user_can_select_on_an_option_from_dropdown_example() {
    rahulDropPage.clickdrop1();
    }
}