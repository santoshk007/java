package santosh.utils;

import java.time.Instant;

/**
 * Common Util Class to maintain the common methods.
 */
public class CommonUtils {

    public static void print(String value) {
        System.out.println("Time: " + Instant.now() + " Output: " + value);
    }
}
