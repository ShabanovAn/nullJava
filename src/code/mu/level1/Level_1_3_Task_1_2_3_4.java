package code.mu.level1;

public class Level_1_3_Task_1_2_3_4 {
    public static void main(String[] args) {
        //System.out.println(Level_1_3_Task_1_2_3_4.IfThereIsMoreThanOneCharacterInThisLine("azwb"));
        //System.out.println(Level_1_3_Task_1_2_3_4.findTheRemainderOfTheDivisionOfTheFirstNumberByTheSecond(3, 2));
        System.out.println(Level_1_3_Task_1_2_3_4.determineAtWhatTimeOfTheYearThisMmonthFalls(13));

    }

    public static void OutputAllIntegersToTheConsole() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Числа " + i);
        }
    }

    public static String IfThereIsMoreThanOneCharacterInThisLine(String str) {
        if (str.length() <= 1) {
            System.out.println("Введите больше одного символа");
        }

        return String.valueOf(str.charAt(str.length() -2));
    }

    public static int findTheRemainderOfTheDivisionOfTheFirstNumberByTheSecond(Integer first, Integer second) {
        return first % second;

    }

    public static Season determineAtWhatTimeOfTheYearThisMmonthFalls(int month) {
        if (month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }

        if (month >= 3 && month <= 5) {
            return Season.SPRING;
        } else if (month >= 6 && month <= 8) {
            return Season.SUMMER;
        } else if (month >= 9 && month < 12) {
            return Season.AUTUMN;
        }
        return Season.WINTER;
    }

}
enum Season {
    WINTER( "Winter"),
    SPRING( "Spring"),
    SUMMER( "Summer"),
    AUTUMN( "Autumn");

    private final String name;

    Season( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
