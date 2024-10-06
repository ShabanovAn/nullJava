package Algoritm;

import java.util.*;

public class JavaGuruDzCollections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(101);

        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 20));
        }
        System.out.println(numbers);

        int count = 0;

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                count++;
               iterator.remove();
            }
        }
        System.out.println(numbers + "Количество элементов после удаления: " +  numbers.size() + " Количество удаленных элементов: " + count);

        TreeSet<Integer> integerTreeSet = new TreeSet<>(numbers);

        System.out.println(Set.of(integerTreeSet) + "Количество элементов: " + integerTreeSet.size());
    }
}
