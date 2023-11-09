package com.crowdar.examples.services;

import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

public class CalculatorService {
    public static void execute(String firstNumber, String operation, String secondNumber) {
        iterateClicking(firstNumber);
        ActionManager.click(getOperationXpath(operation));
        iterateClicking(secondNumber);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    private static String getOperationXpath(String operation) {
        switch (operation) {
            case "plus":
                return CalculatorConstants.PLUS;
            case "minus":
                return CalculatorConstants.MINUS;
            case "multi":
                return CalculatorConstants.MULTI;
            case "divided":
                return CalculatorConstants.DIV;
            default:
                return "";
        }
    }

    protected static void iterateClicking(String number) {
        for (int i = 0; i < number.length(); i++) {
            ActionManager.click(String.format(CalculatorConstants.NUMBERS, number.charAt(i)));
        }
    }

    public static void resultIs(String result) {
        Assert.assertEquals(getResult(), result);
    }

    public static String getResult() {
        return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("\\D+", "").trim();

    }
}
