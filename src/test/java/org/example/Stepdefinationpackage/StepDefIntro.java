package org.example.Stepdefinationpackage;

import PageObjectPackage.IntroPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefIntro {
    IntroPage introPage=new IntroPage();
    @When("^User going to Why mandg is good option$")
    public void user_going_to_Why_mandg_is_good_option() throws Throwable {
    introPage.whyMandG();
    }

    @Then("^User should find all the details about mandg$")
    public void user_should_find_all_the_details_about_mandg() throws Throwable {
    introPage.contactemail();

    }
}