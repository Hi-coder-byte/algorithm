package org.example.leetcode.letterCombinations;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationsTest {

    @Test
    public void letterCombinations() {

        String digits = "23";
        LetterCombinations letterCombinations = new LetterCombinations();
        List<String> result = letterCombinations.letterCombinations(digits);
        System.out.println(Arrays.toString(result.toArray()));
    }
}