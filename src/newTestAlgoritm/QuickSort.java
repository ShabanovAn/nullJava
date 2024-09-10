package newTestAlgoritm;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(quickSort(List.of(1,3,45,7,8,90,0,12,22,55)));
    }
    /*
    На каждой итерации выбираем некоторые опорные элементы
    Опорные элементы это некоторые элементы которые будут делить наш массив пополам
    Выбор опорного элемента эта задача которая может ускорить, но координально ничего не меняет
    Далее разделив наш массив на 2 массива каздый из них мы должны отсортировать
    Сортировка выглядит таким образом слева от опорного должны быть меньше опорного, а справа соответственно больше или равны

     */
    // Быстрая сортировка (Есть проблема когда мы натыкаемся на самый большой либо на самый маленький элемент)
    private static List<Integer> quickSort(List<Integer> array) {
        if(array.size() < 2) { //Условия выхода это тогда когда наш массив меньше двухё
            return array;
        }

        int privateIndex = (array.size()-1)/2;

        var leftArray = new ArrayList<Integer>();
        var rightArray = new ArrayList<Integer>();

        for (int i = 0; i < array.size(); i++) {
            if(privateIndex == i) {
                continue; // то мы пропускаем, privateIndex мы не трогаем
            }

            var currentElement = array.get(i);

            if (currentElement >= array.get(privateIndex)) {
                rightArray.add(currentElement);
            } else {
                leftArray.add(currentElement);
            }
        }

        var sortedLeftArray = quickSort(leftArray);
        var sortedRightArray = quickSort(rightArray);

        var result = new ArrayList<Integer>();

        result.addAll(sortedLeftArray);
        result.add(array.get(privateIndex));
        result.addAll(sortedRightArray);
        return result;
    }

}
