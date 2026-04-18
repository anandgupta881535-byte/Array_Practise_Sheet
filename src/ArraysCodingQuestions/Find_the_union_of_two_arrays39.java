package ArraysCodingQuestions;

import java.util.Arrays;

public class Find_the_union_of_two_arrays39 {
        public static int[] findUnion(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);

            int i = 0, j = 0, k = 0;
            int[] temp = new int[nums1.length + nums2.length];

            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    if (k == 0 || temp[k-1] != nums1[i]) {
                        temp[k++] = nums1[i];
                    }
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    if (k == 0 || temp[k-1] != nums2[j]) {
                        temp[k++] = nums2[j];
                    }
                    j++;
                } else { // nums1[i] == nums2[j]
                    if (k == 0 || temp[k-1] != nums1[i]) {
                        temp[k++] = nums1[i];
                    }
                    i++;
                    j++;
                }
            }

            // Add remaining elements
            while (i < nums1.length) {
                if (k == 0 || temp[k-1] != nums1[i]) {
                    temp[k++] = nums1[i];
                }
                i++;
            }

            while (j < nums2.length) {
                if (k == 0 || temp[k-1] != nums2[j]) {
                    temp[k++] = nums2[j];
                }
                j++;
            }

            return Arrays.copyOf(temp, k);
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 2, 2, 3, 4};
            int[] nums2 = {2, 2, 3, 5, 6};

            int[] union = findUnion(nums1, nums2);
            System.out.println("Union: " + Arrays.toString(union));
        }
}
