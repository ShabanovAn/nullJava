package newTestAlgoritm;

import java.util.Arrays;

public class noneDublicate {
    public static void main(String[] args) {
        int[] numb = new int[]{1, 2, 1, 2, 51};
        //duplicateItem(numb);
        //NonDuplicateItem(numb);
        System.out.println( singleNumber(numb));
    }



    static void duplicateItem(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        int count = 0;

        for (int j = 0; j < a.length; j++) {
            for (int k = j + 1; k < a.length; k++) {
                if (a[j] == a[k]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(a[j]);
            }
            count = 0;
        }
    }


    static void NonDuplicateItem(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        int count = 0;
        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < a.length; k++) {
                if (a[j] == a[k]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(a[j]);
            }
            count = 0;
        }

    }


    public static int[] noneDuble(int[] numbers) {
        boolean isFlag = false;
        while (!isFlag) {
            isFlag = true;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[i - 1]) {
                    int item = numbers[i];
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = item;
                    isFlag = false;
                }

            }

        }

        return numbers;
    }

    public static int singleNumber(int[] number) {
        int singleNumber=0;
        for (int i : number) {
            singleNumber ^= i;
        }

        return singleNumber;
    }

}
