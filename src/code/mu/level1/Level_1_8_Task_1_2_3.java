package code.mu.level1;

public class Level_1_8_Task_1_2_3 {
    public static void main(String[] args) {
        //Level_1_8_Task_1_2_3.printNumberFrom100To1();
        Level_1_8_Task_1_2_3.reversAndPrint("abwgd");
    }

    public static void printNumberFrom100To1() {
        for (int i = 100; i >=1 ; i--) {
            System.out.println(i);
        }
    }

    public static void reversAndPrint(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String newString = stringBuilder.reverse().toString();
        char letter = ' ';
        for (int i = 0; i < newString.length(); i++) {
            letter = newString.charAt(i);
            System.out.println("Буква " + (i + 1) + ": " + letter);

        }
    }


    public static void toGbToMbToKb() {
        int b = 353564577;

        double gigabytes = (double) b / (1024 * 1024 * 1024);
        double megabytes = (double) b / (1024 * 1024);
        double kilobytes = (double) b / 1024;

        System.out.println("Гигабайты: " + gigabytes);
        System.out.println("Мегабайты: " + megabytes);
        System.out.println("Килобайты: " + kilobytes);
    }
}
