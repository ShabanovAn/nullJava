package Algoritm;

import java.util.Random;

public class Xyeta {
    public static void main(String[] args) {

        Random random = new Random();
        //random.nextInt(5)
        int[] a = {10, 9, 8, 7, 6};
        int[] reverse = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            reverse[i] = a[a.length-1-i];
        }

        for (int i : a) {
            System.out.print(i);
        }
        System.out.println("");
        for (int i : reverse) {
            System.out.print(i);
        }
       //
        // 0, 1, 2, 3, 4 = i
        //-1,-2,-3,-4,-5 =

//        System.out.println("");
//        List<Integer> list = Arrays.asList(1, 2, 3, 4);
//        System.out.println(Xyeta.reverseList(list));
    }

//    public static List<Integer> reverseList(List<Integer> list) {
//        List<Integer> rev = new ArrayList<>(list);
//        Collections.reverse(rev);
//        return rev;
//    }
}
