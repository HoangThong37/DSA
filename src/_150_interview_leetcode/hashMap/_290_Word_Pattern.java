package _150_interview_leetcode.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _290_Word_Pattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if(map.containsKey(pattern.charAt(i))) {
                //
                String p = map.get(pattern.charAt(i));
                String w = words[i];
                if (!Objects.equals(p, w)) return false;
            } else {
                // khac key nhung giong value
                if(map.containsValue(words[i])) return false;
               map.put(pattern.charAt(i), words[i]);
            }
        }

        return true;
    }

    public static boolean wordPattern1(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        Map<Character, Integer> mapPattern = new HashMap<>();
        Map<String, Integer> mapS = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if(mapPattern.put(pattern.charAt(i), i) != mapS.put(words[i], i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
//        String s = "dog cat cat dog";
        String s = "dog map map dog";
        System.out.println(wordPattern1(pattern, s));
    }
}

/*
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Explanation:
The bijection can be established as:
        'a' maps to "dog".
        'b' maps to "cat".
*/
