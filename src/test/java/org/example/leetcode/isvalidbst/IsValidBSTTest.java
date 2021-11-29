package org.example.leetcode.isvalidbst;

import org.example.bst.BSTUtil;
import org.example.bst.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsValidBSTTest {

    /*
                    5
              1           4
           -1    2      3   6
     */
    @Test
    public void isValidBST() {
        Integer[] numbs = new Integer[] {5, 1, 4, null, null, 3, 6};
        Node root = BSTUtil.generateBinaryTree(numbs);
        IsValidBST isValidBST = new IsValidBST();
        boolean valid = isValidBST.isValidBST(root);
        System.out.println(valid);
    }

    /*
                    6
              1           7
           -1    2      5   9
     */
    @Test
    public void isValidBST1() {
        Integer[] numbs = new Integer[] {5, 1, 7, -1, 2, 5, 9};
        Node root = BSTUtil.generateBinaryTree(numbs);
        IsValidBST isValidBST = new IsValidBST();
        boolean valid = isValidBST.isValidBST(root);
        assert valid == false;
    }

    /*
                    6
              1           8
           -1    2      7   9
     */
    @Test
    public void isValidBST2() {
        Integer[] numbs = new Integer[] {6, 1, 8, -1, 2, 7, 9};
        Node root = BSTUtil.generateBinaryTree(numbs);
        IsValidBST isValidBST = new IsValidBST();
        boolean valid = isValidBST.isValidBST(root);
        assert valid == true;
    }

    /*
                    32
              26           47
        19                      56
            27
     */
    @Test
    public void isValidBST3() {
        Integer[] numbs = new Integer[] {32,26,47,19,null,null,56,null,27};
        Node root = BSTUtil.generateBinaryTree(numbs);
        IsValidBST isValidBST = new IsValidBST();
        boolean valid = isValidBST.isValidBST(root);
        assert valid == false;
    }

    /*
                   0
             -1
    */
    @Test
    public void isValidBST4() {
        Integer[] numbs = new Integer[] {0, -1};
        Node root = BSTUtil.generateBinaryTree(numbs);
        IsValidBST isValidBST = new IsValidBST();
        boolean valid = isValidBST.isValidBST(root);
        assert valid == true;
    }

    @Test
    public void minimum() {

        Integer[] numbs = new Integer[] {5, 1, 7, -1, 2, 5, 9};
        Node root = BSTUtil.generateBinaryTree(numbs);
        IsValidBST isValidBST = new IsValidBST();
        Node valid = isValidBST.minimum(root);
        System.out.println(valid);
    }
}