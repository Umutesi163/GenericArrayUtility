import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Test with Integer arrays*/
        Integer[] intArray1 = {1, 2, 3};
        Integer[] intArray2 = {4, 5, 6};
        Integer[] mergedInts = GenericArrayUtility.mergeArrays(intArray1, intArray2);
        System.out.println("Merged Integer Array: " + Arrays.toString(mergedInts));

        /*Test with String arrays*/
        String[] strArray1 = {"apple", "banana"};
        String[] strArray2 = {"cherry", "date"};
        String[] mergedStrings = GenericArrayUtility.mergeArrays(strArray1, strArray2);
        System.out.println("Merged String Array: " + Arrays.toString(mergedStrings));
    }
}