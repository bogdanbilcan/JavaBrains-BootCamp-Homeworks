package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int intVar = 12;
        boolean ok = true;
        // Step 2: Convert primitive variables to wrapper objects
        Integer varInteger = Integer.valueOf(intVar);
        Boolean varBoolean = Boolean.valueOf(ok);
        // Step 3: Print the values of the wrapper objects
        System.out.println("varInteger = " + varInteger);
        System.out.println("varBoolean = " + varBoolean);

        // Step 4: Convert wrapper objects back to primitive variables
        int newIntVar = varInteger;
        boolean primitiveBoolean = varBoolean;
        // Step 5: Print the values of the primitive variables
        System.out.println("primitiveBoolean = " + primitiveBoolean);
        System.out.println("newIntVar = " + newIntVar);
    }
}
