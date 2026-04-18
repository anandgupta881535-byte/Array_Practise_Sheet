package ArraysCodingQuestions;

import java.util.Arrays;

public class Find_the_Intersection_of_two_arrays38 {

        public static int[] findIntersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);

            int i = 0, j = 0, k = 0;
            int[] temp = new int[Math.min(nums1.length, nums2.length)];

            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    if (k == 0 || temp[k-1] != nums1[i]) { // avoid duplicates
                        temp[k++] = nums1[i];
                    }
                    i++;
                    j++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                } else {
                    j++;
                }
            }

            return Arrays.copyOf(temp, k);
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 2, 2, 3, 4};
            int[] nums2 = {2, 2, 3, 5};

            int[] intersection = findIntersection(nums1, nums2);
            System.out.println("Intersection: " + Arrays.toString(intersection));
        }
}


