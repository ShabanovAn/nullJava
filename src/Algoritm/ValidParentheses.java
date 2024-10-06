package Algoritm;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        java.sql.Date nearestSendingDate = new java.sql.Date(System.currentTimeMillis() + 365 * 24 * 60 * 60 * 1000);
        System.out.println(nearestSendingDate);

        String string = new String("fdsf");
        string.intern();

    }

    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        //peek получить верхнюю часть стопки

        for (char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }


}
