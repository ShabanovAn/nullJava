package Algoritm;

public class Rdrd {
    public static void main(String[] args) {
        int[] arraus = new int[]{12, 3, 5, 677, 9897, 42, 43,1};
        int minArray = arraus[0];
        int minIndex = 0;
        for (int i = 0; i < arraus.length; i++) {
            if(minArray > arraus[i]) {
                minArray = arraus[i];
                minIndex = i;
            }
        }
        System.out.println(minArray + "");
    }
}
