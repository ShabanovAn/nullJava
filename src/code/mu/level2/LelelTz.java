package code.mu.level2;

public class LelelTz {
    public static void main(String[] args) {
        //System.out.println(LelelTz.calculate(4, 1, 3)); //2
        //System.out.println(LelelTz.calculate(4, 4, 1)); //3
        //System.out.println(LelelTz.calculate(4, 4, 3)); //1
        System.out.println(LelelTz.calculate(3, 3, 1)); //2


    }

    public static int calculate(int n, int left, int right) {
        int rounds = 0;
        boolean direction = true;

        while (true) {
            if (direction) {
                left--;
                right++;
            } else {
                left++;
                right--;
            }
            rounds++;

            if (left == 0 || right == 0) {
                return rounds + 1;
            }
            if (left == right) {
                direction = false;
            }
            if(left == n || right == n) {
                return rounds;
            }

        }
    }

}

