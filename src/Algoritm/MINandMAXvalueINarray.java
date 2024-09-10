package Algoritm;

public class MINandMAXvalueINarray {
    public static void main(String[] args) {
        int[] array = new int[]{43, 65, 765, 34, 3, 32, 12};

        int minArray = array[0];
        int minValue = 0;
        int maxArray = array[0];

        for (int i = 1; i < array.length; i++) {
            if (minArray > array[i]) {
                minArray = array[i];
                minValue = i;
            }
            if (maxArray < array[i]) {
                maxArray = array[i];
            }
        }
            System.out.println(minArray);
            System.out.println(maxArray);
            //System.out.println(maxArray);

    }
}
