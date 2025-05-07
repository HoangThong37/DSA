package _150_interview_leetcode.array_string;

public class _14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 0) return "";
        if(n == 1) return strs[0];

        int minLen = Integer.MAX_VALUE;
        for(String item : strs) {
            minLen = Math.min(minLen, item.length());
        }

        StringBuilder buider = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            char ch = strs[0].charAt(i); // lấy kí tự i của ng đầu tiên
            for(String str : strs) {
                if(ch == str.charAt(i)) {
                    continue;
                } else {
                    return buider.toString();
                }
            }
            buider.append(ch);
        }
        return buider.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
/*
*  idea:
*  lay chuoi ngan nhat tong arr
*  check tung ki tu trong cai chuoi arr.
*  neu khac thi return luon
* */


/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
*/
