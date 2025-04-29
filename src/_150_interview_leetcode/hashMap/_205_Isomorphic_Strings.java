package _150_interview_leetcode.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _205_Isomorphic_Strings {
    // use HashMap and 2 point.
    public static boolean isIsomorphic(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        if (charT.length != charS.length) return false;

        Map<Character, Character> map = new HashMap<>();
        int i = 0;
        int j = 0;

        while (i < charS.length && j < charT.length) {
            if(!map.containsKey(charS[i])) {
                if (map.containsValue(charT[j])) return false;
                map.put(charS[i], charT[j]);
            } else {
                if (map.get(charS[i]) != charT[j]) return false;
            }
            i++;
            j++;
        }
        return true;
    }

    // c2. use HashMap and HashSet.
    public static boolean isIsomorphic1(String s, String t) {
        if (s.length() != t.length()) return false;
        //
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();  // value duy nhất.
        //
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (map.containsKey(cs)) {
                if (map.get(cs) != ct) return false;
            } else {
                if (set.contains(ct)) return false;
            }
            map.put(cs, ct);
            set.add(ct);
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic1(s, t));
    }
}


/*
Input: s = "egg", t = "add"
Output: true

Explanation:
The strings s and t can be made identical by:
Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
*/
