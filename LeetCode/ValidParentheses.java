package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(isValid(s));


    }

    private static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()) return false;
                if (stack.peek() == oppositeBracket(s.charAt(i))) {

                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.empty()) return true;
        else return false;
    }

    private static char oppositeBracket(char symbol) {

        if(symbol == '}') return '{';
        else if (symbol == ')') return '(';
        else return '[';
    }
}
