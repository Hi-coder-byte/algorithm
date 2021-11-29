package org.example.leetcode.generateParenthesis;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GenerateParenthesisTest {

    @Test
    public void generateParenthesis() {

        GenerateParenthesis g = new GenerateParenthesis();
        List<String> result = g.generateParenthesis1(3);
        System.out.println(Arrays.toString(result.toArray()));
    }
}