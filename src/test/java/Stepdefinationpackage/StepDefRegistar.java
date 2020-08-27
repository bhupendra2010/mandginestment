package Stepdefinationpackage;

import PageObjectPackage.RegistarPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefRegistar {
RegistarPage registarPage=new RegistarPage();
    @When("^User click on contact us and navigate to registar page$")
    public void user_click_on_contact_us_and_navigate_to_registar_page() throws Throwable {
registarPage.contact();
    }

    @When("^fill all the Details$")
    public void fill_all_the_Details() throws Throwable {

    }

    @Then("^User should create an account$")
    public void user_should_create_an_account() throws Throwable {
    }
}
