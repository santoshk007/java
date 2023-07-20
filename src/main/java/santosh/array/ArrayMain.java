package santosh.array;

import santosh.utils.CommonUtils;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n,
 * where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * Example 2:
 * <p>
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * Example 3:
 * <p>
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 * <p>
 * Constraints:
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[j] <= 109
 * <p>
 * Follow up: Can you come up with an algorithm that runs in O(m + n) time?
 */
public class ArrayMain {
    public static void main(String... args) {
        CommonUtils.print("LeetCode Program - 88. Merge Sorted Array");
        case1();
        case2();
        case3();
    }

    private static void case1() {
        CommonUtils.print("Case 1: " + "nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3");
        // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        CommonUtils.print(Arrays.toString(nums1));
    }

    private static void case2() {
        CommonUtils.print("Case 2: " + "nums1 = [1], m = 1, nums2 = [], n = 0");
        // nums1 = [1], m = 1, nums2 = [], n = 0
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        merge(nums1, m, nums2, n);
        CommonUtils.print(Arrays.toString(nums1));
    }

    private static void case3() {
        CommonUtils.print("Case 3: " + "nums1 = [0], m = 0, nums2 = [1], n = 1");
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
        CommonUtils.print(Arrays.toString(nums1));
    }

    /**
     * Solution provided here is to merge the arrays and then sort it using Arrays.sort function.
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int a2 = (n - 1), a1 = (m + n) - 1; a2 >= 0; a2--, a1--) {
            // CommonUtils.print("nums1[" + a1 + "] = " + nums1[a1]);
            // CommonUtils.print("nums2[" + a2 + "] = " + nums2[a2]);
            nums1[a1] = nums2[a2];
        }
        Arrays.sort(nums1);
    }
}
