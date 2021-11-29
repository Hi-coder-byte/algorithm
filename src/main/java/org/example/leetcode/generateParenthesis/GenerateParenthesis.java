package org.example.leetcode.generateParenthesis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        generateAll(result, 0, 2 * n, new char[2 * n]);
        return result;
    }

    private void generateAll(List<String> result, int index, int n, char[] chars) {
        if (index == n) {
            if (isValid(chars)) {
                result.add(new String(chars));
            }
            return;
        }
        chars[index] = '(';
        generateAll(result, index + 1, n, chars);
        chars[index] = ')';
        generateAll(result, index + 1, n, chars);
    }

    private boolean isValid(char[] chars) {
        int balance = 0;
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }


    public List<String> generateParenthesis1(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuffer(), 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuffer sb, int open, int close, int max) {
        if (open == max && close == max) {
            result.add(sb.toString());
            return;
        }
        if (open < max) {
            sb.append('(');
            backtrack(result, sb, open + 1, close, max);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(')');
            backtrack(result, sb, open, close + 1, max);
            sb.deleteCharAt(sb.length() - 1);
        }
    }


}
