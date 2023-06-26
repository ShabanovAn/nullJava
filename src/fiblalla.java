import com.sun.tools.javac.Main;

public class fiblalla {
    public static void main(String[] args) {
        fiblalla fiblalla = new fiblalla();
        fiblalla.fibonacciValue(4);

    }

    public int fibonacciValue(int num) {
        if (num <= 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else {
            int a = fibonacciValue2(num - 2);//2
            int b = fibonacciValue(num - 1);
            return a + b;
        }
    }


    public int fibonacciValue2(int num) {
        if (num <= 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else {
            int a = fibonacciValue(num - 2);//2
            int b = fibonacciValue(num - 1);
            return a + b;
        }
    }
}
