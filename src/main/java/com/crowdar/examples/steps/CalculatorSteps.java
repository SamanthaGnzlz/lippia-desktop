package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {

    @When("(.*) (plus|minus|divided|multiplied) (.*)")
    public void operation(String firstNumber, String operation, String secondNumber){
        CalculatorService.execute(firstNumber, operation, secondNumber);
    }

    @Then("Result is (.*)")
    public void resultIs(String result) {
        CalculatorService.resultIs(result);
    }
}