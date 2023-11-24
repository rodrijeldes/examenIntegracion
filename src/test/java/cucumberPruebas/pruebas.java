package cucumberPruebas;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class pruebas {
  @When("^you are in When annotation$")
  public void when() throws Throwable {
  }

  @Then("^you are in Then annotation$")
  public void then() throws Throwable {
  }

  @And("^you are in And annotation$")
  public void and() throws Throwable {
  }

}
