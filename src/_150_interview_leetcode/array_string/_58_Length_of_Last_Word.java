package _150_interview_leetcode.array_string;

public class _58_Length_of_Last_Word {

    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        String[] str = s.split(" ");

        int max = str[str.length-1].length();

//        for (int i = 0; i < str.length; i++) {
//            max = Math.max(max, str[i].length());
//        }

        return max;
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
}


/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
    Input: s = "Hello World"
    Output: 5
    Explanation: The last word is "World" with length 5.
 */
