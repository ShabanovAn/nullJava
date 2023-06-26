package TZ;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
//        words.add("Бетон"); //Префикс
//        words.add("Бетона"); //Слово
//        words.add("Бетоны");
//        words.add("Бетоного");
//        words.add("Бетонного");
//        words.add("Вода");
//        words.add("Воды");
//        words.add("Водица");
//        words.add("Водиц");
        words.add("Бетон с присадкой");
        words.add("присадка для Бетона");
//        words.add("присадка для бетонов");
//        words.add("Бетона с присадкой");
        List<String> lineWordsFirstGroup = words;
        for (String s : lineWordsFirstGroup) {
            lineWordsFirstGroup = List.of(s.split(" "));
        }
        String prefix = lineWordsFirstGroup.get(0);
        if (prefix.length() >= 4) {
            prefix = prefix.substring(0, 4);
        }
        ArrayList<String> similarWords = new ArrayList<>();
        for (String word : lineWordsFirstGroup) {
            if (word.length() >= prefix.length()) {
                if (word.startsWith(prefix) || word.endsWith(prefix)) {
                    similarWords.add(word);
                }
            } else {
                if (prefix.startsWith(word)) {
                    similarWords.add(word);
                }
            }
        }
        System.out.println(similarWords);

        // System.out.println(similarWords); // [cat, caterpillar, catch]

//        for (int i = 0; i < words.length; i++) {
//            String word1 = words[i];
//            for (int j = i + 1; j < words.length; j++) {
//                String word2 = words[j];
//                if (word1.matches(".*" + word2.substring(word2.length() - 2))) {
//                    System.out.println(word1 + " и " + word2 + " - одинаковые слова с разными окончаниями");
//                } else if (word2.matches(".*" + word1.substring(word1.length() - 2))) {
//                    System.out.println(word1 + " и " + word2 + " - одинаковые слова с разными окончаниями");
//                }
//            }
//        }


//        for (int i = 0; i < test.size(); i++) {
//            String word1 = test.get(i);
//           // List<String> nreUU = Collections.singletonList(test.get(i));
//            //System.out.println(nreUU);
//            for (int j = i + 1; j < test.size(); j++) {
//                String word2 = test.get(j);
//                if (word1.matches(".*" + "")) {
//                    System.out.println(word1 + " и " + word2 + " - одинаковые слова с разными окончаниями");
//                } else if (word2.matches(".*" + word1.substring(word1.length() - 2))) {
//                    System.out.println(word1 + " и " + word2 + " - одинаковые слова с разными окончаниями");
//                }
//            }
//        }
    }

//    public static void findSameWords(ArrayList<String> words, String searchWord) {
//        // Получаем окончание искомого слова
//        String suffix = searchWord.substring(searchWord.length() - 1);
//
//        // Создаем регулярное выражение для поиска слов с таким же окончанием
//        String regex = ".*" + suffix + "$";
//
//        // Проходим по списку и ищем совпадения
//        for (String word : words) {
//            if (word.matches(regex)) {
//                System.out.println(word + " is a match!");
//            }
//        }
//    }
}