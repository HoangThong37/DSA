package _150_interview_leetcode.hashMap;

import java.util.Arrays;

public class _242_Valid_Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaran";
        System.out.println(isAnagram1(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        // cach 1 : sort xong compare tuefng ki tu
        if (s.length() != t.length()) return false;
        //
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        //
        Arrays.sort(s1);
        Arrays.sort(t1);
        //
        int i = 0, j = 0;
        while (i < s1.length && j < t1.length) {
            if (s1[i] == t1[j]) {
                i++;
            }
            j++;
        }
        return i == j;
    }

    public static boolean isAnagram1(String s, String t) {
        // cach 2: usse StringBuilder
        if (s.length() != t.length()) return false;
        char[] t1 = t.toCharArray();
        //
        StringBuilder ss = new StringBuilder(s);
        for (int i = 0; i < t1.length; i++) {
            int c = ss.indexOf(String.valueOf(t1[i]));
            if (c != -1) {
                ss.deleteCharAt(c);
            }
        }
        //
        if(ss.isEmpty()) return true;

        return false;
    }
}


/*
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
*/
