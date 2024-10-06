package code.mu.level1;

public class Level_1_7_Task_1_2_3_4_5_6 {
    public static void main(String[] args) {
        //Level_1_7_Task_1_2_3_4_5_6.FindTheSumOfAllTheAddInntegersInTheRangeFrom1To100();
        //Level_1_7_Task_1_2_3_4_5_6.WriteACodeThatOutputsTheFirstNOowersofTwo(4);
        //Level_1_7_Task_1_2_3_4_5_6.printPowersOfTwo(4);
        //System.out.println(Level_1_7_Task_1_2_3_4_5_6.addUpTheValuesOfTheseStringsAsIntegers());
        System.out.println(Level_1_7_Task_1_2_3_4_5_6.reversNumbers(12345));
    }

    public static void FindTheSumOfAllTheAddInntegersInTheRangeFrom1To100() {
        Integer sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void WriteACodeThatOutputsTheFirstNOowersofTwo(int N) {
        int num = 2;
        for (int i = 1; i <= N; i++) {
            System.out.println("2^" + i + " = " + num);
                num *= 2 ;
        }
    }

    public static void printPowersOfTwo(int N) {
        long power = 1;
        for (int i = 0; i < N; i++) {
            System.out.println("2^" + i + " = " + power);
            power *= 2;
        }
    }


    public static Integer addUpTheValuesOfTheseStringsAsIntegers() {
        String str1 = "123";
        String str2 = "456";
        String str3 = "789";
      return fromStringToInteger(str1) + fromStringToInteger(str2) + fromStringToInteger(str3);
    }

    private static Integer fromStringToInteger(String str) {
        return Integer.parseInt(str);
    }


    public static Integer reversNumbers(Integer number) {
        String str = String.valueOf(number);
        StringBuilder sb = new StringBuilder(str);
        return Integer.parseInt(sb.reverse().toString());
    }

    public static void fromGb() {
        float gb = 35.24f;

        float mb = gb * 1024;
        float kb = mb * 1024;
        float bytes = kb * 1024;

        System.out.println("Мегабайты: " + mb);
        System.out.println("Килобайты: " + kb);
        System.out.println("Байты: " + bytes);
    }

}
