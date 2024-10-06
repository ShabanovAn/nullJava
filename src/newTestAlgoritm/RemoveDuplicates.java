package newTestAlgoritm;

import inheritance.InheritanceInterface.Main;

import java.util.*;

public class RemoveDuplicates {
    public static List<String> removeDuplicateLetters(List<String> letters) {
        Character character = 'f';
        int count  =0;
        List<String> uniqueLetters = new ArrayList<>();
        for (String letter : letters) {
            if (!uniqueLetters.contains(letter)) {
                uniqueLetters.add(letter);
            }
        }
        return uniqueLetters;
    }

    public static List<Integer> removeDuplicateNumbers(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        return uniqueNumbers;
    }

    public static void main(String[] args) {
        List<String> letters = Arrays.asList("a", "b", "b", "c", "d", "d", "e");
        List<String> uniqueLetters = removeDuplicateLetters(letters);
        System.out.println("Unique letters: " + uniqueLetters);
    }



}