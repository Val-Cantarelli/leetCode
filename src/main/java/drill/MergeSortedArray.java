package drill;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m-1;
        int second = n-1;
        int i = (m+n)-1;

        while (second >= 0) {
            if (first >= 0 && nums1[first] > nums2[second]) {
                nums1[i] = nums1[first];
                first--;
            } else {
                nums1[i] = nums2[second];
                second--;
            }
            i--;
        }
    }

    public static void main(String[] args) {
        int [] nums1 = new int[]{0};
        int m = 0;
        int [] nums2 = new int[]{1};
        int n = 1;

        new MergeSortedArray().merge(nums1,m,nums2,n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+ " ");

        }
    }
}
