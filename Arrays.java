/*
Array Big-O Cases
Insert: O(n)
Get: O(1) // Must know index!
Delete: O(n)
Searching: O(n)

*/

public class Arrays {

    public static void main(String[] args) {

        // Driver code for searchForElement //
        // char[] array = {'a', 'b', 'c', 'd', 'e'};
        // char test = 'c';
        // searchForElement(array, test);
        // System.out.println();

        
        // Driver code for insertElement //
        // char[] array2 = {'a', 'b', 'c', 'd', '\u0000'};
        // printArray(array2);
        // insertElement(array2, 2, 'f');
        // printArray(array2);

        // Driver code for Get //
        // char[] array3 = {'a', 'b', 'c', 'd', 'e'};
        // System.out.println(array3.length);

        // Driver code for removeElement //
        // char[] array3 = {'a', 'b', 'c', 'd', 'e'};
        // printArray(array3);
        // removeElement(array3, 2);
        // printArray(array3);

    }

    public static void printArray(char[] array) {
        for(char i : array) {
            System.out.print(i);
        }
        System.out.println();
    }

    // O(n)
    public static void searchForElement(char[] array, char c) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == c) {
                System.out.print("Element " + c + " is found at index " + i);
            }
        }

        // for(char i : array) {
        //     if(i == c) {
        //         System.out.println("Element Found!");
        //     }
        // }
    }

    // O(n)
    public static void insertElement(char[] array, int index, char c) {
        //move elements after the insert position to the right one spot
        for(int i = array.length - 1; i > index; i--) {
            array[i] = array[i-1];
        }

        array[index] = c;
    }

    // O(n)
    public static void removeElement(char[] array, int index) {
        int lastElementIndex = array.length - 1;

        for(int i = index + 1; i<=lastElementIndex; i++) {
            array[i-1] = array[i];
        }

        array[lastElementIndex] = '\u0000';
    }





}