package com.leetcode.array.console1464;

import java.util.Arrays;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

    public static void main(String[] args) {
        System.out.println(new MaxProduct().maxProduct(new int[]{3, 4, 5, 2}));
    }
}
