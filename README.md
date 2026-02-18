// Generic Array Merge Utility

A simple Java utility to merge two arrays of the same type into one, preserving order.

// Overview
This project implements a generic `mergeArrays` method that combines two arrays of type `T[]` into a single array, with elements from the first array followed by those from the second.

// Features
- Generic method supporting any object type ('Integer', 'String', etc.)
- Preserves element order
- Uses reflection for type-safe array creation
- Null-safe input handling

// Usage
java
Integer[] a = {1, 2, 3};
Integer[] b = {4, 5, 6};
Integer[] result = GenericArrayUtility.mergeArrays(a, b);
// Result: [1, 2, 3, 4, 5, 6]   
