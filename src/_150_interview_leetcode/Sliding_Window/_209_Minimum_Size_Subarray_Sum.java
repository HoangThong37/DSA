package _150_interview_leetcode.Sliding_Window;

public class _209_Minimum_Size_Subarray_Sum {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int min = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            while (sum >= target) {
                min = Math.min(min, i - start + 1);
                sum -= nums[start];
                start++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12,28,83,4,25,26,25,2,25,25,25,12};
        //int[] nums = new int[]{2,3,1,2,4,3};
        System.out.println(minSubArrayLen(213, nums));
    }

}

/*
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:
    Input: target = 7, nums = [2,3,1,2,4,3]
    Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
*/
