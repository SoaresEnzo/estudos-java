package com.company;

public class Main {

    public static void main(String[] args) {
	    double firstNum = 20.00d;
	    double secondNum = 80.00d;
	    double thirdStep = (firstNum+secondNum)*100;
	    int fourthStep = (int)thirdStep % 40;
        boolean isRemainder = fourthStep != 0 ? true : false;

        if(isRemainder){
            System.out.println("There is remainder");
        } else {
            System.out.println("There is no remainder");
        }

    }
}
