package org.example.leetcode.letterCombinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    Map<Character, String> characterMap = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }
        enrichCharacterMap();

        backtrack(combinations, digits, 0, new StringBuffer());

        return combinations;
    }

    private void backtrack(List<String> combinatioins, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinatioins.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            String digitCharacters = characterMap.get(digit);
            for (int i = 0; i < digitCharacters.length(); i++) {
                combination.append(digitCharacters.charAt(i));
                backtrack(combinatioins, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }

    }

    private void enrichCharacterMap() {
        characterMap.put('2', "abc");
        characterMap.put('3', "def");
        characterMap.put('4', "ghi");
        characterMap.put('5', "jkl");
        characterMap.put('6', "mno");
        characterMap.put('7', "pqrs");
        characterMap.put('8', "tuv");
        characterMap.put('9', "wxyz");
    }
}
