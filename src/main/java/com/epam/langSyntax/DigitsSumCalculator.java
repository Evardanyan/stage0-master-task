package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int firstNumber = number / 1000;
        int secondNumber = number % 1000 / 100;
        int thirdNumber = number % 100 / 10;
        int fourthNumber = number % 10;
        System.out.println(firstNumber + secondNumber + thirdNumber + fourthNumber);
    }

}
