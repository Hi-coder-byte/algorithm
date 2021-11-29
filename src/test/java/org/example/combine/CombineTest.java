package org.example.combine;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CombineTest {

    @Test
    public void combine() {
        List<List<Integer>> result = new Combine().combine(4, 2);
        System.out.println(result);
    }
}