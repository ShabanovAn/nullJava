package test2;

public class Program2 {
    public static void main(String[] args) {
        int[] numbers =  {10,12,13,14,15,16,17,18};

        Program2 p = new Program2();
        p.searchMAth(numbers, 10);
    }

    public String searchMAth(int[] num, Integer k) {
        for (int i = 0; i < num.length; i++) {
            if(num[i] == k) {
                System.out.println(i);;
            }

        }
        return "Не найденно";
    }
}
