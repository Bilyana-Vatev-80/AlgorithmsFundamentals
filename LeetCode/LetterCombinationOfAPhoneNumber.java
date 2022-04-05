package LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LetterCombinationOfAPhoneNumber {
    private static final String[] KEYS = {"", "",  "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.nextLine();
        System.out.println(letterCombination(digits));

    }

    private static List<String> letterCombination(String digits) {
        List<String> ret = new LinkedList<>();
        if(digits.length() < 1){
            return ret;
        }
        combination("", digits, 0, ret);
        return ret;
    }

    private static void combination(String prefix, String digits, int offset, List<String> ret) {
        if(offset >= digits.length()){
            ret.add(prefix);
            return;
        }
        String letters = KEYS[(digits.charAt(offset) - '0')];
        for (int i = 0; i < letters.length(); i++) {
            combination(prefix + letters.charAt(i), digits, offset + 1, ret);
        }
    }
}
