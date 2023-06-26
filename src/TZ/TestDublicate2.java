package TZ;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDublicate2 {
    public static final String INPUT = "C:\\Users\\Royal computers\\Desktop\\input.txt";
    public static final String OUTPUT = "C:\\Users\\Royal computers\\Desktop\\output.txt";

    public static void main(String[] args) throws IOException {

        TestDublicate2 dublicate2 = new TestDublicate2();

        System.out.println(dublicate2.splitMap(dublicate2.getFirstGroup(dublicate2.extracted()), dublicate2.getSecondGroup(dublicate2.extracted())));

        try {
            Files.write(Paths.get(OUTPUT), dublicate2.extracted(), StandardOpenOption.CREATE);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public List<String> extracted() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(TestDublicate2.INPUT), StandardCharsets.UTF_8);
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
        putNulls(splitedElements, firstGroup, secondGroup);
        return splitedElements;
    }
    //todo Программа должна сопоставить максимально похожие строки из первого множества со строками из второго множества (одна к одной) и вывести результат в файл output.txt.
    //todo Нужна проверка на пустую строкку, так же нужно написать регулярку на слова с разным окончанием

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

    private void putNulls(Map<String, String> splitedElements, List<String> firstGroup, List<String> secondGroup) {
        putNullsFirstGroup(splitedElements, firstGroup);
        putNullsSecondGroup(splitedElements, secondGroup);
    }

    private void putNullsFirstGroup(Map<String, String> splitedElements, List<String> firtstGroup) {
        for (String firstElement : firtstGroup) {
            if (!splitedElements.containsKey(firstElement)) {
                splitedElements.put(firstElement, null);
            }
        }
    }

    private void putNullsSecondGroup(Map<String, String> splitedElements, List<String> secondGroup) {
        for (String secondElement : secondGroup) {
            if (!splitedElements.containsValue(secondElement)) {
                splitedElements.put(secondElement, null);
            }
        }
    }

    private boolean compareLines(String firstLine, String secondLine) {
        List<String> lineWordsFirstGroup = List.of(firstLine.split(" "));
        List<String> lineWordsSecondGroup = List.of(secondLine.split(" "));
        for (String s1 : lineWordsFirstGroup) {
            for (String s2 : lineWordsSecondGroup) {
                if (s1.equalsIgnoreCase(s2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
