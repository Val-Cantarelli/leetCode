package drill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArrayTest {

    @Test
    void example1_leetCode() {
        MergeSortedArray merger = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merger.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void example2_leetCode() {
        MergeSortedArray merger = new MergeSortedArray();

        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        merger.merge(nums1, m, nums2, n);

        int[] expected = {1};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void example3_leetCode() {
        MergeSortedArray merger = new MergeSortedArray();

        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        merger.merge(nums1, m, nums2, n);

        int[] expected = {1};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void nums2SmallerValues() {
        MergeSortedArray merger = new MergeSortedArray();

        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        merger.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, nums1);
    }

    @Test
    void interleavedValues() {
        MergeSortedArray merger = new MergeSortedArray();

        int[] nums1 = {1, 4, 7, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 3, 6};
        int n = 3;

        merger.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 3, 4, 6, 7};
        assertArrayEquals(expected, nums1);
    }
}
