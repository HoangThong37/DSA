package _150_interview_leetcode.hashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _383_Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {
        // cách 1. Dùng hashMap
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int index = map.getOrDefault(ransomNote.charAt(i), 0);
            if (index == 0) return false; // nếu có kí tự tại magazine mà ko có trong ransom thì false.

            map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
        }
        return true;
    }

    public static boolean canConstruct1(String ransomNote, String magazine) {
        // cách 2. Dùng two point
        char[] chars1 = ransomNote.toCharArray();
        char[] chars2 = magazine.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        //
        int i = 0;
        int j = 0;
        //
        while (i < chars1.length && j < chars2.length) {  //  a  b | a a b c
            if (chars1[i] == chars2[j]) {
                i++;
            }
            j++;
        }
        return i == chars1.length;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        canConstruct1(ransomNote, magazine);
    }
}


/*
Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true*/
