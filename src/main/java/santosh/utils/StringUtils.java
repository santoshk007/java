package santosh.utils;

/**
 * String utils class to maintain the String methods.
 */
public class StringUtils {

    public static boolean isPalindromeLocal(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        CommonUtils.print("Replaced String: " + s);
        StringBuilder b = new StringBuilder();
        String r = b.append(s).reverse().toString();
        CommonUtils.print("Reversed String: " + r);
        return s.equalsIgnoreCase(r);
    }

    /**
     * Solution is taken from Leetcode.
     * Credit goes to https://leetcode.com/sakshamkaushiik/
     *
     * @param s
     * @return boolean
     */
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
