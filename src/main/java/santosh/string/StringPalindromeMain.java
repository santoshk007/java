package santosh.string;

import santosh.utils.CommonUtils;
import santosh.utils.StringUtils;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * <p>
 * Example 3:
 * <p>
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */
public class StringPalindromeMain {
    public static void main(String... args) {
        CommonUtils.print("LeetCode Program - 125. Valid Palindrome");
        case1();
        case2();
        case3();
    }

    private static void case1() {
        String s = "A man, a plan, a canal: Panama";
        CommonUtils.print("Case 1 Original String: " + s);
        CommonUtils.print(" String s '" + s + "' is Palindrome: " + StringUtils.isPalindrome(s));
    }

    private static void case2() {
        String s = "race a car";
        CommonUtils.print("Case 2 Original String: " + s);
        CommonUtils.print(" String s '" + s + "' is Palindrome: " + StringUtils.isPalindrome(s));
    }

    private static void case3() {
        String s = " ";
        CommonUtils.print("Case 3 Original String: " + s);
        CommonUtils.print(" String s '" + s + "' is Palindrome: " + StringUtils.isPalindrome(s));
    }
}
