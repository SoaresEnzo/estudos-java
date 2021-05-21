package com.company;

public class Main {

    public static void main(String[] args) {
        byte value1 = 64;
        short value2 = 1024;
        int value3 = 1_024_256_128;
        long value4 =  50000+ (long)10*(value1+value2+value3);
        System.out.println(value4);
    }
}
