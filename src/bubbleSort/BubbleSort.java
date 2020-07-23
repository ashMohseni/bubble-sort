/**
 * This program is the Bubble Sort Algorithms, and it sorts the integers inside an array.
 * 
 * @author A.M
 */
package bubbleSort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        BubbleSort bs = new BubbleSort();
        bs.sort(array);
        System.out.println("Sorted array: ");
        bs.printArray(array);
    }

    public void sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int test = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = test;
                }

            }
        }
    }

    public void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
