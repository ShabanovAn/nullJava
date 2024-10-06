import java.util.Arrays;

public class RaznoeTest {
    public static void main(String[] args) {
        int[] numbers = {1011, 222, 34, 5, 19, 453, 22};
        RaznoeTest.newBubleSort(numbers);
        System.out.println(" -------------");
        RaznoeTest.sort2(numbers);
    }

    public static void newBubleSort(int[] numbN) {
        int tmp = 0;
        boolean flag = false;
        int count1 = 0;
        int count12 = 0;
        while (!flag) {
            count1++;
            flag = true;
            for (int i = 0; i < numbN.length - 1; i++) {
                count12++;
                if (numbN[i] > numbN[i + 1]) {
                    tmp = numbN[i];
                    numbN[i] = numbN[i + 1];
                    numbN[i+1] = tmp;
                    flag = false;
                }

                System.out.println(Arrays.toString(numbN)+ "-------->>>");
            }
        }
        System.out.println("count 1 = "+ count1 + " count2 = " + count12);

    }

    public static void sort2(int[] arr) {
        int count1 = 0;
        int count12 = 0;
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            count1++;

            for (int j = 0; j < n - i - 1; j++) {
                count12++;
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
        System.out.println(Arrays.toString(arr));
            }

            // If no swaps were made, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        System.out.println("count 1 = "+ count1 + " count2 = " + count12);
    }
}

