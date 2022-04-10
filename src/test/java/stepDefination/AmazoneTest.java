package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazoneTest {

    @Given("I have searh field on Amazone page")
    public void i_have_searh_field_on_amazone_page() {

        System.out.println("Login done");

    }
    @When("I search product name {string} and Price is {int}")
    public void i_search_product_name_and_price_is(String productname, Integer price) {

        System.out.println("Product Details Price + Value"+productname+" and Price "+price);

    }
    @Then("Product name should be displayed")
    public void product_name_should_be_displayed() {

        System.out.println("Product Displayed successfully");

    }

}
