package TZ;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDublicate3 {
    public static final String INPUT = "C:\\Users\\Royal computers\\Desktop\\input.txt";
    public static final String OUTPUT = "C:\\Users\\Royal computers\\Desktop\\output.txt";

    public static void main(String[] args) throws IOException {

        TestDublicate3 dublicate2 = new TestDublicate3();


        List<String> extracted = dublicate2.extract();
        List<String> firstGroup = dublicate2.getFirstGroup(extracted);
        List<String> secondGroup = dublicate2.getSecondGroup(extracted);
        Map<String, String> splitedMap = dublicate2.splitMap(firstGroup, secondGroup);
        System.out.println(splitedMap);

        try {
            Files.write(Paths.get(OUTPUT), dublicate2.prepareView(splitedMap), StandardOpenOption.CREATE);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public List<String> extract() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(TestDublicate3.INPUT), StandardCharsets.UTF_8);
        return lines;
    }

    private List<String> getFirstGroup(List<String> lines) {
        return lines.subList(1, Integer.parseInt(lines.get(0)) + 1);

    }

    private List<String> getSecondGroup(List<String> lines) {
        return lines.subList(Integer.parseInt(lines.get(0)) + 2, lines.size());
    }

    private Map<String, String> splitMap(List<String> firstGroup, List<String> secondGroup) {
        Map<String, String> splitedElements = compareToMap(firstGroup, secondGroup);
        putNullsGroup(splitedElements, firstGroup, secondGroup);
        return splitedElements;
    }

    private Map<String, String> compareToMap(List<String> firstGroup, List<String> secondGroup) {
        HashMap<String, String> spiltedElemets = new HashMap<>();
        for (String firstElement : firstGroup) {
            for (String secondElement : secondGroup) {
                if (compareLines(firstElement, secondElement)) {
                    spiltedElemets.put(firstElement, secondElement);
                    break;
                }
            }
        }
        return spiltedElemets;
    }

    private boolean compareLines(String firstLine, String secondLine) {
        List<String> lineWordsFirstGroup = List.of(firstLine.split(" "));
        List<String> lineWordsSecondGroup = List.of(secondLine.split(" "));
        for (String s1 : lineWordsFirstGroup) {
            for (String s2 : lineWordsSecondGroup) {
                if (compareWordsWithEndings(s1, s2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean compareWordsWithEndings(String word1, String word2) {
        if (word1.length() > 4) {
            word1 = word1.substring(0, 4);
        }
        if (word2.length() > 4) {
            word2 = word2.substring(0, 4);
        }
        if (word1.length() >= word2.length()) {
            return word1.startsWith(word2);
        } else {
            return word2.startsWith(word1);
        }
    }

    private void putNullsGroup(Map<String, String> splitedElements, List<String> firstGroup, List<String> secondGroup) {
        for (String firstElement : firstGroup) {
            if (!splitedElements.containsKey(firstElement)) {
                boolean mapped = false;
                for (String secondElement : secondGroup) {
                    if (!splitedElements.containsValue(secondElement)) {
                        splitedElements.put(firstElement, secondElement);
                        mapped = true;
                        break;
                    }
                }
                if (!mapped) {
                    splitedElements.put(firstElement, "?");
                }
            }
        }

        for (String secondElement : secondGroup) {
            if (!splitedElements.containsValue(secondElement)) {
                splitedElements.put(secondElement, "?");
            }
        }
    }

    private List<String> prepareView(Map<String, String> splitedElements) {
        List<String> view = new ArrayList<>();
        for (Map.Entry<String, String> pair : splitedElements.entrySet()) {
            view.add(pair.getKey() + " : " + pair.getValue());
        }
        return view;
    }
}

