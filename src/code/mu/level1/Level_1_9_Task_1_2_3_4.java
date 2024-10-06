package code.mu.level1;

import java.util.Objects;

public class Level_1_9_Task_1_2_3_4 {
    public static void main(String[] args) {
        //System.out.println(Level_1_9_Task_1_2_3_4.TwoWordsAreGiven("abv", "vbaf"));
        //System.out.println(Level_1_9_Task_1_2_3_4.getSecondOnTwenTy(2));
        //System.out.println("В сутках " + Level_1_9_Task_1_2_3_4.getSecondOnTwenTy(1) + " секунд");
        //System.out.println(Level_1_9_Task_1_2_3_4.printNumbers());
        System.out.println(Level_1_9_Task_1_2_3_4.concatCharToInt('1','2','3'));

    }

   public static boolean TwoWordsAreGiven(String first, String second) {
       if (!Objects.equals(first.charAt(0), second.charAt(second.length()-1))){
           return false;
       }
       return true;
   }

   public static int getSecondOnTwenTy(int sutki) {
       return sutki * 86400;
   }


   public static boolean printNumbers() {
       for (int i = -100; i <= 0; i++) {
           System.out.println(i);
       }
       return true;
   }

   public static Integer concatCharToInt(char chr1, char chr2, char chr3) {
       return Integer.parseInt(String.valueOf(new char[] {chr1, chr2, chr3}));
   }


}
