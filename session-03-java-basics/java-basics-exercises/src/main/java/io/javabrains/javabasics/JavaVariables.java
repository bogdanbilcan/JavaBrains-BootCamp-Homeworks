package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int intVar = 12;
        // long variable to store a long value
        long longVar = 123L;
        // float variable to store a floating-point value
        float floatVar = 23.4f;

        // double variable to store a double value
        double doubleVar = 12.3;

        // char variable to store a single character
        char charVar = 'a';

        // boolean variable to store a boolean value
        boolean booleanVar = true;

        // String variable to store a string of characters
        String stringVar = "text";

        // Step 2: Print the values of the variables to the console
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println(charVar);
        System.out.println(booleanVar);
        System.out.println(stringVar);

        // Step 3: Modify the values of the variables and print the updated values
        intVar++;
        longVar--;
        floatVar = 5;
        doubleVar = 7.7;
        charVar = 'b';
        booleanVar = false;
        stringVar = "new text";
        System.out.println("Updated Values: ");
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println(charVar);
        System.out.println(booleanVar);
        System.out.println(stringVar);
    }
}
