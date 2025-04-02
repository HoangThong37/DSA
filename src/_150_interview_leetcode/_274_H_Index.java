package _150_interview_leetcode;

import java.util.Arrays;

public class _274_H_Index {
    public static void main(String[] args) {
        int[] arr = {3,0,6,1,5};
        hIndex(arr);
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            int papers = citations.length - i;
            if (citations[i] >= papers) {
                h = papers;
            } else {
                break;
            }
        }
        return h;
    }
}

/*
Example 1:

Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.*/
