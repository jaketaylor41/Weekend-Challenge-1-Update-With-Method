package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);



        System.out.println("Input First Number:");
        String firstNumber = sc.nextLine();

        System.out.println("Input one of the following valid operators: +, -, *, / :");
        String operator = sc.nextLine();

        System.out.println("Input Second Number:");
        String secondNumber = sc.nextLine();

        int intFirst = Integer.parseInt(firstNumber);
        int intSecond = Integer.parseInt(secondNumber);
//        int intResult = 0;

        System.out.println();
        int newResult = addedNumbers(intFirst, intSecond, operator);
        System.out.println("Your answer is: " + newResult);


//        if(operator.equals("+") || operator.equals("add")) {
//            intResult = intFirst + intSecond;
//        } else if (operator.equals("-") || operator.equals("subtract")) {
//            intResult = intFirst - intSecond;
//        } else if (operator.equals("*") || operator.equals("multiply")) {
//            intResult = intFirst * intSecond;
//        } else if (operator.equals ("/") || operator.equals("divide")) {
//            intResult = intFirst / intSecond;
//        }
//        System.out.println("Your answer is: " + intResult);
    } // end of static main
    public static int addedNumbers (int value1, int value2, String op) {
        int intResult = 0;
            if(op.equals("+") || op.equals("add")) {
            intResult = value1 + value2;
        } else if (op.equals("-") || op.equals("subtract")) {
            intResult = value1 - value2;
        } else if (op.equals("*") || op.equals("multiply")) {
            intResult = value1 * value2;
        } else if (op.equals ("/") || op.equals("divide")) {
            intResult = value1 / value2;
        }
       return intResult;

    }
} // end of object class
