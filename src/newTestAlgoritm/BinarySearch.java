package newTestAlgoritm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        var array = new int[]{11, 27, 35, 4,1, 5, 4234, 542, 32}; //Условие бинарного поиска Отсортированный масив
        //System.out.println(binarySearch(32, array));
        System.out.println(Arrays.toString(bubleSort(array)));
        System.out.println(minValue(array));
    }

    private static int binarySearch(int value, int[] array) { //Вернем индекс элементов
        int lowIndex = 0; //Нам нужно понимать где начало наших элементов
        int highIndex = array.length - 1; // и где конец

        while (lowIndex <= highIndex) { // На каждой итерации будем сокращать количество рассматриваемых элементов в двое
            int midleIndex = (lowIndex + highIndex) / 2; //выполнять будем до тех пор пока наши индесы не встретятся

            if (array[midleIndex] == value) {
                return midleIndex;
            }

            if (array[midleIndex] > value) {
                highIndex = midleIndex - 1;
            }


            if (array[midleIndex] < value) {
                lowIndex = midleIndex + 1;
            }
        }

        return -1;
    }

    public static int[] bubleSort(int[] array) {
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int value = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = value;
                    flag = false;
                }
            }
        }
        return array;
    }


    //Сортировка Выбором
    private static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexMaxElement = i;
            System.out.println("int indexMaxElement = " + i);
            System.out.println("int indexMaxElement = " + indexMaxElement);
            for (int k = i+1; k < array.length; k++) {
                if(array[k] > array[indexMaxElement]) {
                    indexMaxElement = k;
                }
            }
            if(indexMaxElement != 1) {
                int temp = array[i];
                array[i] = array[indexMaxElement];
                array[indexMaxElement] = temp;
            }
        }
    }

    public static int minValue(int[] array) {
       int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if(minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
