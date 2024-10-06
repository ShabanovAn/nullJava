package code.mu.level1;

public class Level_1_6_Task_1_2_3 {
    public static void main(String[] args) {
        Level_1_6_Task_1_2_3.sumAllElements();
        System.out.println(Level_1_6_Task_1_2_3.charToInt());

    }

    public static void sumAllElements() {
        Integer sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }

    public static int charToInt() {
        char a = '1';
        char b = '2';
        char c = '3';
        return Character.getNumericValue(a) + Character.getNumericValue(b) + Character.getNumericValue(c);
    }

    public static int megabiteToByte(int mb) {
        mb *= 1024 * 1024;
        return mb;
    }
}
