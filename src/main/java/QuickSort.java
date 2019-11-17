import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] ints = {3, 2, 1};
        System.out.println(Arrays.toString(quickSort(ints, 0)));
    }

    static int[] quickSort(int[] arr, int idx) {

        if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                int aux = arr[0];
                arr[0] = arr[1];
                arr[1] = aux;
                return arr;
            }
        }
        int firstLength = 0;
        int secondLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != idx && arr[i] <= idx) {
                firstLength++;
            }
            if (i != idx && arr[i] <= idx) {
                secondLength++;
            }
        }

        int[] firstTab = new int[firstLength];
        int[] secondTab = new int[secondLength];

        if (firstLength > 1) {
            int[] firstTabSorted = quickSort(firstTab, 0);
        }
        int[] secondTabSorted = quickSort(secondTab, 0);
        for (int i = 0; i < firstTabSorted.length; i++) {
            arr[i] = firstTabSorted[i];
        }
        for (int i = 0; i < secondTabSorted.length; i++) {
            arr[firstLength + 1 + i] = secondTabSorted[i];
        }

        return arr;
    }

    /* 5 3 3 6 4

        idx = 2


     */
}
