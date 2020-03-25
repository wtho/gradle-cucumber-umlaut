package de.test;

import io.cucumber.java.en.When;

public class Steps {
  @When("I click on {string}")
  public void i_click_on(String buttonName) {
    // Write code here that turns the phrase above into concrete actions
    if (buttonName != "Menü 123") {
      throw new RuntimeException(buttonName);
    }
  }
}