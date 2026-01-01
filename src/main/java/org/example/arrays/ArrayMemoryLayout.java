package org.example.arrays;

public class ArrayMemoryLayout {
    //Declaration: Defining the type and name of the array.
    //Example: int[] myNumbers;
    //Instantiation: Allocating memory for the array in the Heap using the new keyword.
    //Example: myNumbers = new int[5];
    //Initialization: Assigning actual values to the array elements.
    //Example: myNumbers[0] = 10;
    //Pro Tip: You can combine all three in one line:
    //int[] myNumbers = {10, 20, 30, 40, 50};
    //Memory Management Basics
    //Reference Variable: The array name (e.g., myNumbers) is stored in the Stack and holds the memory address of the actual array.
    //Actual Object: The array elements themselves are stored in the Heap.
    //Default Values: When an array is instantiated but not initialized, Java assigns default values (e.g., 0 for int, null for objects).
    //Printing: Arrays.toString() is required to see the content
    //System.out.println(Arrays.toString(data)); // Output: [0, 0, 0, 0, 0]
}
