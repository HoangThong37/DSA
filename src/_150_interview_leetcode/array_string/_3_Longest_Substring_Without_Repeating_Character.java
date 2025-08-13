package _150_interview_leetcode.array_string;

import java.util.ArrayList;
import java.util.List;

public class _3_Longest_Substring_Without_Repeating_Character {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        List<Character> window = new ArrayList<>();
        int maxLen = 0;

        for (char c : s.toCharArray()) {
            if (window.contains(c)) {
                // Xóa từ đầu đến ký tự trùng
                int index = window.indexOf(c);
                for (int i = 0; i <= index; i++) {
                    window.remove(0);
                }
            }
            window.add(c);
            maxLen = Math.max(maxLen, window.size());
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
