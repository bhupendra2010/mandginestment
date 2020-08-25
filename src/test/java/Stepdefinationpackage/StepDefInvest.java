package Stepdefinationpackage;

import PageObjectPackage.InvestPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefInvest {
    InvestPage investPage=new InvestPage();
    @Given("^User is on homepage$")
    public void user_is_on_homepage() throws Throwable {
    investPage.baseurl();
    }

    @When("^User search for the investor page for detail$")
    public void user_search_for_the_investor_page_for_detail() throws Throwable {
    investPage.choose();
    }

    @Then("^User should find right option for his investment$")
    public void user_should_find_right_option_for_his_investment() throws Throwable {
    investPage.managinginvest();
    }
}
