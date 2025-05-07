package _150_interview_leetcode.array_string;

public class _28_Find_the_Index {
    public static int strStr(String haystack, String needle) {
        // Trường hợp needle rỗng
        if (needle.isEmpty()) {
            return 0;
        }

        int m = haystack.length();
        int n = needle.length();

        // Nếu needle dài hơn haystack
        if (n > m) {
            return -1;
        }

        int i = 0; // Con trỏ cho haystack
        int start = 0; // Lưu chỉ số bắt đầu của đoạn tiềm năng

        while (i < m) {
            // Nếu ký tự khớp
            if (haystack.charAt(i) == needle.charAt(i - start)) {
                i++;
                // Nếu đã khớp toàn bộ needle
                if (i - start == n) {
                    return start;
                }
            } else {
                // Không khớp, quay lại vị trí bắt đầu mới
                start++;
                i = start;
            }
        }

        return -1;
    }


    // s   a   d  b  u  t    s   a  d
    // s   a   d

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(haystack, needle));
    }
}


// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
/*
Example 1:
    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Explanation: "sad" occurs at index 0 and 6.
    The first occurrence is at index 0, so we return 0.
*/
