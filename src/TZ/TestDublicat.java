package TZ;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class TestDublicat {
    public static final String INPUT = "C:\\Users\\Royal computers\\Desktop\\input.txt";
    public static final String OUTPUT = "C:\\Users\\Royal computers\\Desktop\\output.txt";

    public static void main(String[] args) throws IOException {

        try {
            Files.write(Paths.get(OUTPUT), extracted(), StandardOpenOption.CREATE);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static List<String> extracted() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(TestDublicat.INPUT), StandardCharsets.UTF_8);
        List<String> newList = new ArrayList<>();
        for (String firstElements : getFirstGroup(lines)) {
            Set<String> duplicate = new HashSet<>();
            List<String> split = List.of(firstElements.split(" "));
            for (String splitElements : split) {
                for (String secondElements : getSecondGroup(lines)) {
                    if (secondElements.contains(splitElements)) {
                        duplicate.add(secondElements);
                        break;
                    }
                }
            }
            newList.add(firstElements + " : " + (duplicate.isEmpty() ? " ? " : String.join(" ", duplicate)));
        }
        for (String s : newList) {
            System.out.println(s);
        }
        return newList;
    }

    private static List<String> getFirstGroup(List<String> lines) {
        return lines.subList(1, Integer.parseInt(lines.get(0)) + 1);

    }

    private static List<String> getSecondGroup(List<String> lines) {
        return lines.subList(Integer.parseInt(lines.get(0)) + 2, lines.size());
    }

    private static List<String> splitList(List<String> listGroup) {
        List<String> splitFirstGr = new LinkedList<>();
        for (String s : listGroup) {
            splitFirstGr = List.of(s.split(" "));
        }
        return splitFirstGr;
    }
}
