package org.example.combine;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {

        List<Integer> track = new ArrayList<>();
        backtrack(n, 1, k, track);
        return result;
    }

    private void backtrack(int n, int start, int k, List<Integer> track) {
        if (k - track.size() > n - start + 1) return;
        if (track.size() == k) {
            result.add(new ArrayList<Integer>(track));
            return;
        }
        for (int i = start; i <= n; i++) {
            track.add(i);
            backtrack(n, i + 1, k, track);
            track.remove(track.size() - 1);
        }
    }
}
