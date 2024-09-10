package newTestAlgoritm;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static int factorial(int n){
        if(n==0 || n==1 ) {
            return 1;
        }
        return n * factorial(n -1);
    }

    //Сумма рекурсией
    private static int sumElements(int[] array) {
        if(array.length == 0) { //если длинна массива равна 0 то и возвращаем 0
            return 0;
        }
        if(array.length == 1) { // если у нас в массиве один элемент то возвращаем его
            return array[0];
        }
        //Первый элемент складываем с копией массива начиная с первого элемента и до конца массива
        return array[0] + sumElements(Arrays.copyOfRange(array, 1, array.length));
    }

}
