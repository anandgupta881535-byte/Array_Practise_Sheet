package ArraysCodingQuestions;

public class Find_the_length_of_the_longest_subarray_with_all_distinct_elements45 {
        public static int longestDistinctSubarray(int[] nums) {
            int maxLength = 0;

            // Check all subarrays
            for (int start = 0; start < nums.length; start++) {
                for (int end = start; end < nums.length; end++) {
                    if (allDistinct(nums, start, end)) {
                        maxLength = Math.max(maxLength, end - start + 1);
                    }
                }
            }

            return maxLength;
        }

        // Helper function to check if subarray nums[start..end] has all distinct elements
        private static boolean allDistinct(int[] nums, int start, int end) {
            for (int i = start; i <= end; i++) {
                for (int j = i + 1; j <= end; j++) {
                    if (nums[i] == nums[j]) {
                        return false; // duplicate found
                    }
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 1, 2, 4, 5};
            System.out.println("Length of longest distinct subarray: " + longestDistinctSubarray(nums));
        }
    }


