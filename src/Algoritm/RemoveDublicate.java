package Algoritm;

import java.util.HashSet;
import java.util.Set;

public class RemoveDublicate {
    public static void main(String[] args) {
        int num = 1223344;
        String strNum = String.valueOf(num);
        String uniqueStrNum = removeDuplicates(strNum);
        int uniqueNum = Integer.parseInt(uniqueStrNum);
        System.out.println("Unique number: " + uniqueNum);
    }

    public static String removeDuplicates(String str) {
        String uniqueStr = "";
        for (char c : str.toCharArray()) {
            if (!uniqueStr.contains(String.valueOf(c))) {
                uniqueStr += c;
            }
        }
        return uniqueStr;
    }
}

class RemoveDublicateMasNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Unique array: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
        RemoveDublicateMasNumbers.removeEziStringDublicate();
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArr[i++] = num;
        }
        return uniqueArr;
    }


    public static void removeEziStringDublicate() {
        String word = "Приииветт";

        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }

        System.out.println("Слово без дубликатов: " + sb.toString());
    }
}


class DeleteStringDublicate {
    public static void main(String[] args) {
        String word = "hello";
        String uniqueWord = removeDuplicates(word);
        System.out.println("Слово без дубликатов: " + uniqueWord);
    }

    public static String removeDuplicates(String word) {
        Set<Character> set = new HashSet<>();
        StringBuilder uniqueWord = new StringBuilder();
        for (char c : word.toLowerCase().toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                uniqueWord.append(c);
            }
        }
        return uniqueWord.toString();
    }


    public void tetsBrain(int[] mas) {
        int tmp;
        boolean flag = false;

        while (!flag) {
            flag = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    tmp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = tmp;
                    flag = false;
                }
            }
        }
    }
}



