package _150_interview_leetcode;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        hIndex(citations);
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations); // Tăng dần
        int h = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            int papers = citations.length - i; // Số bài từ cuối lên
            if (citations[i] >= papers) {
                h = papers;
            } else {
                break;
            }
        }
        return h;
    }
}
