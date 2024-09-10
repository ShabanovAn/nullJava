package newTestAlgoritm;

public class Application {
    public static void main(String[] args) {

        System.out.println(String.format("%, d",1000000000));
// number formatted with ,
        System.out.println(String.format("%,d",1000000000));
// just number
        System.out.println(String.format("%d",1000000000));
        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums.length; i++){
            for(int j=0; j < nums[i].length; j++){

//                System.out.printf("%, d ", nums[i][j]);
//
//                System.out.printf("%,d ", nums[i][j]);
//
//                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
    }


}
