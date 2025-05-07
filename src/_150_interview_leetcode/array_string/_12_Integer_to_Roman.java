package _150_interview_leetcode.array_string;

import java.util.LinkedHashMap;
import java.util.Map;

public class _12_Integer_to_Roman {
    public static String intToRoman(int num) {
        Map<Integer, String> rs = mapValue();

        StringBuilder sb = new StringBuilder();
        for(Integer i : rs.keySet()) {
            while(num >= i) {
                sb.append(rs.get(i));
                num -= i;
            }
        }
        return sb.toString();
    }

    private static Map<Integer, String> mapValue() {
        Map<Integer, String> romanMap = new LinkedHashMap<>();
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");
        // 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
        return romanMap;
    }

    public static void main(String[] args) {
        int num = 3749;
        System.out.println(intToRoman(num));
    }
}


/*

Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000

Example 1:
Input: num = 3749
Output: "MMMDCCXLIX"

Explanation:
        3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
        700 = DCC as 500 (D) + 100 (C) + 100 (C)
        40 = XL as 10 (X) less of 50 (L)
        9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
*/
