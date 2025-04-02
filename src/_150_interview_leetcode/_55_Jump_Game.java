package _150_interview_leetcode;

public class _55_Jump_Game {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;

        for (int i = 0; i < n; i++) {
            if(maxReach < i) return false;
            maxReach = Math.max(maxReach, nums[i] + i);

            if(maxReach >= n - 1) return true;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,0,4};
        canJump(nums);
    }
}


//Example 1:
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
//
//Example 2:
//Input: nums = [3,2,1,0,4]
//Output: false
//Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0,
//which makes it impossible to reach the last index.