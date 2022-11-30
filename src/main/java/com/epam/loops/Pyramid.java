package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = cathetusLength; j > 0; j--) {
                if(j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            for (int j = 1; j < cathetusLength; j++) {
                if(j + 1 > i) {
                    System.out.print("");
                } else {
                    System.out.print(j + 1);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
