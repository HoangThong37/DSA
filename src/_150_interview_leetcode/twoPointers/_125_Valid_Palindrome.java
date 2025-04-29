package _150_interview_leetcode.twoPointers;


import java.util.Stack;

public class _125_Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "0P";
        // c1. for check dau cuoi
        // c2. Dunn stack de push vao r so sanh
        //isPalindrome(s1);
        isPalindrome1(s);
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome1(String s1) {
        StringBuilder sb = new StringBuilder();
        for(char c : s1.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        // Stack
        Stack<Character> charStack = new Stack<>();
        for(char c : sb.toString().toCharArray()) {
            charStack.push(c);
        }
        //
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != charStack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/*
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*/
