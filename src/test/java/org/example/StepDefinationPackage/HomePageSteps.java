package org.example.StepDefinationPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.HomePage;
import org.openqa.selenium.support.ui.Select;

public class HomePageSteps {
    HomePage homepage= new HomePage();

    @Given("^user in the home page of Southall travel$")
    public void user_in_the_home_page_of_Southall_travel() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user selects the airport from the depart box$")
    public void user_selects_the_airport_from_the_depart_box() throws Throwable {
        Thread.sleep(4000);
        homepage.flyingfrom();

        // Write code here that turns the phrase above into concrete actions
   }

    @When("^user selects the airport from the destination box$")
    public void user_selects_the_airport_from_the_destination_box() throws Throwable {
        Thread.sleep(4000);
        homepage.flyingto();
        Thread.sleep(4000);


        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user selects (\\d+)th May in the departing Calender$")
    public void user_selects_th_May_in_the_departing_Calender(int arg1) throws Throwable {
        homepage.dapartingCalandar();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user select (\\d+)th June in returning Calender$")
    public void user_select_th_June_in_returning_Calender(int arg1) throws Throwable {
        Thread.sleep(2000);
        homepage.returningCalandar();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user select (\\d+) in the adult box$")
    public void user_select_in_the_adult_box(int arg1) throws Throwable {
        homepage.adultBox();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user select Air India in the Airline box$")
    public void user_select_Air_India_in_the_Airline_box() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user should be able to see result page$")
    public void user_should_be_able_to_see_result_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

}
