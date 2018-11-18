package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // int has a width of thirty two
        int myValue=1000;
        int minValue=-214748364;
        int maxValue=2147483647;
        int myTotal = (myValue/2);


        // byte has a width of 8
        byte myByte = 10;
        byte myTotal2 = (byte) (myByte/2);

        // short has a width of 16
        short myShortvalue = -32767;
        short myTotal3 = (short) (myShortvalue * -1);

        // long has a width of 64
        long myLong = 1000L;

        System.out.println(myTotal);
        System.out.println(myTotal2);
        System.out.println(myTotal3);

        int myIntValue= 5;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3f;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);

        char myChar='a';
        String myString="jarod";

    }
}
