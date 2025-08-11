package _150_interview_leetcode.array_string;

public class _344_Reverse_String {
    public static void reverseString(char[] s) {
        int n = s.length;

        if (n <= 1) return;
        int k = 0;

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(s[i]);
        }

        StringBuilder builder1 = builder.reverse();
        for (int i = 0; i < builder.length(); i++) {
            char c = builder1.charAt(i);
            s[k++] = c;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        //System.out.println(reverseString(s));
        reverseString(s);
    }
}
