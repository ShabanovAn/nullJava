public class minArray {
    public static void main(String[] args) {
        int[] array = new int[] {65, 22, 4534,56463, 33,12,44,54,2};
        int min = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
               min = array[i];
               minIndex = i;
            }

        }
    }
}
