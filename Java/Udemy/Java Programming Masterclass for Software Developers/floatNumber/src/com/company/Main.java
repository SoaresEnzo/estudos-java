package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "+ myMinFloatValue);
        System.out.println("Float maximum value = "+ myMaxFloatValue);

        double myDoubleMinValue = Float.MIN_VALUE;
        double myDoubleMaxValue = Float.MAX_VALUE;
        System.out.println("Double minimum value = "+ myDoubleMinValue);
        System.out.println("Double maximum value = "+ myDoubleMaxValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;

        System.out.println("My int value = "+ myIntValue);
        System.out.println("My float value = "+ myFloatValue);
        System.out.println("My double value = "+ myDoubleValue);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
