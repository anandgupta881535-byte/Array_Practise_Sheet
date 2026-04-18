package ArraysCodingQuestions;

import java.util.Arrays;

public class Find_the_dupllicate_number_inAn_array41 {

        public static int findDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    return nums[i];
                }
            }
            return -1; // No duplicate found
        }

        public static void main(String[] args) {
            int[] nums = {3, 1, 3, 4, 2};
            System.out.println("Duplicate: " + findDuplicate(nums));
        }
    }

