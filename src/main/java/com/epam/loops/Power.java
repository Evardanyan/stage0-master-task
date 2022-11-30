package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int sum = 1;
        for (int i = 1; i <= power; i++) {
            sum *= numberToPrint;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
