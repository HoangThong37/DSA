package _150_interview_leetcode.array_string;

import java.util.Arrays;

public class _238_Product_of_Array_Except_Self {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int mul = 1;

        int[] arrSum = new int[n];

        arrSum[0] = 1;
        for (int i = 1; i < n; i++) {
            arrSum[i] = mul * nums[i-1];
            mul = arrSum[i];
        }

        int right = 1;
        for (int i = n-1; i >= 0; i--) {
            arrSum[i] = arrSum[i] * right;
            right *= nums[i];
        }

        return arrSum;
    }

/*    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int mul = 1;
        int k = 0, j = 0;
        int[] arrNew = new int[n];

        for (int i = 0; i < n; i++) {
            for (int l = 0; l < n; l++) {
                if (i == l && nums[i] == 0)  {
                    continue;
                } else {
                    mul *= nums[l];
                }
            }

            if (nums[i] == 0) {
                arrNew[j++] = mul;
            } else {
                arrNew[j++] = mul / nums[i];
            }

            mul = 1;
        }

        return arrNew;
    }*/

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        //int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
