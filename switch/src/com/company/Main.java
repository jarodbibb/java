package com.company;

public class Main {

    public static void main(String[] args) {
	int switchValue = 1;
	switch(switchValue){
        case 1:
            System.out.println("value was 1");
            break;
        case 2: case 3: case 4:
            System.out.println("value was 2");
            break;

        default:
            System.out.println("Default");
            break;

	    }
    }
}
