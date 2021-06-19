package com.Alevel;

public class Main {

    static void fromRightToLeft(int number){
        System.out.println("---From right to left---");
        int newNumber;
        while (number > 0) {
            newNumber = number % 10;
            number = number / 10;
            if (newNumber % 2 == 0 && newNumber % 3 == 0) {
                System.out.println("fizzbuzz");
            }
            else if (newNumber % 2 == 0) {
                System.out.println("fizz");
            }
            else if (newNumber % 3 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(newNumber % 10);
            }
        }
    }

    static void fromLeftToRight(int number){
        System.out.println("---From left to right---");
        String s = Integer.toString(number);
        char[] abc = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (abc[i] % 2 == 0 && abc[i] % 3 == 0) {
                System.out.println("fizzbuzz");
            }
            else if (abc[i] % 2 == 0) {
                System.out.println("fizz");
            }
            else if (abc[i] % 3 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(abc[i]);
            }
        }
    }

    static void sumBits(long input){
        System.out.println("---Sum of bits that equals 1---");
        int sum = 0;
        String result = Long.toBinaryString(input);
        char[] myArr = result.toCharArray();

        for (int i = 0; i < myArr.length; i++) {
            if (Character.getNumericValue(myArr[i]) == 1) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int number = 347693485;
        fromLeftToRight(number);
        fromRightToLeft(number);
        sumBits(14);
    }
}
