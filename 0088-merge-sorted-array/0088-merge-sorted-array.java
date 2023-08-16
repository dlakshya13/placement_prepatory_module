class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] comb = new int[m + n];
        while (k < m + n) {
            if (i == m) {
                comb[k++] = nums2[j++];
                continue;
            } else if (j == n) {
                comb[k++] = nums1[i++];
                continue;
            }
            if (nums1[i] < nums2[j]) {
                comb[k++] = nums1[i++];
            } else {
                comb[k++] = nums2[j++];
            }
            
            
        }
        for (int a = 0; a < m + n; a++) {
            nums1[a] = comb[a];
        }
    }
}