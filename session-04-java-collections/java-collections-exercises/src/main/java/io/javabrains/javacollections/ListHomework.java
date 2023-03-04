package io.javabrains.javacollections;

/*
Create a Java program that allows a user to perform various operations on an ArrayList of integers.
The program should display a menu of options, and the user should be able to select one of the following operations:

1. Add an element to the list
2. Remove an element from the list
3. Find the minimum element in the list
4. Find the maximum element in the list
5. Print the contents of the list
6. Quit the program

The program should continue to display the menu and allow the user to perform operations until they choose to quit.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ListHomework {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        while (1 == 1) {
            System.out.println("1. Add an element to the list \n" +
                    "2. Remove an element from the list \n" +
                    "3. Find the minimum element in the list \n" +
                    "4. Find the maximum element in the list \n" +
                    "5. Print the contents of the list \n" +
                    "6. Quit the program ");
            int option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Selected option 1 - Add: \n  -> Enter the value you want to add to the list: ");
                    int numberToAdd = in.nextInt();
                    numberList.add(numberToAdd);
                    break;
                case 2:
                    if (numberList.isEmpty()) {
                        System.out.println("Current list is empty so please first add values to it to be able to remove.");
                        break;
                    }
                    System.out.println("Selected option 2 - Remove: \n  -> Enter the value you want to remove from the list: ");
                    int numberToRemove = in.nextInt();
                    if (!numberList.contains(numberToRemove)) {
                        System.out.println("Current list doesn't contain the selected value.");
                        break;
                    }
                    int indexToRemove= 0;
                    for (int i = 1; i < numberList.size(); i++) {
                        if (numberList.get(i) == numberToRemove)
                            indexToRemove = i;
                    }
                    numberList.remove(indexToRemove);
                    System.out.println("Value removed with success.");
                    break;
                case 3:
                    if (numberList.isEmpty()) {
                        System.out.println("Current list is empty so please first add values to it to be able to determine min value.");
                        break;
                    }
                    int min = numberList.get(0);
                    for (int i = 1; i < numberList.size(); i++) {
                        if (min > numberList.get(i))
                            min = numberList.get(i);
                    }
                    System.out.println("Selected option 3 - minimum value from the current list is: " + min);
                    break;
                case 4:
                    if (numberList.isEmpty()) {
                        System.out.println("Current list is empty so please first add values to it to be able to determine max value.");
                        break;
                    }
                    int max = numberList.get(0);
                    for (int i = 1; i < numberList.size(); i++) {
                        if (max < numberList.get(i))
                            max = numberList.get(i);
                    }
                    System.out.println("Selected option 4 - maximum value from the current list is: " + max);
                    break;
                case 5:
                    System.out.println("Selected option 5 - Print current list: "+ numberList);
                    break;
                case 6:
                    System.out.println("Selected option 6 - Exit - closing the execution of program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong option selected. Please enter a number between 1-6!");
            }
        }

    }
}
