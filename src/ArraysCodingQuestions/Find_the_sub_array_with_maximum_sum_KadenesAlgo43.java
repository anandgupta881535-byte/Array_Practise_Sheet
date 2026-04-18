package ArraysCodingQuestions;

public class Find_the_sub_array_with_maximum_sum_KadenesAlgo43 {
        public static int maxSubArraySum(int[] nums) {
            int maxSoFar = nums[0];   // stores the maximum sum found so far
            int currentSum = nums[0]; // stores the current subarray sum

            for (int i = 1; i < nums.length; i++) {
                // Either extend the current subarray or start a new one
                currentSum = Math.max(nums[i], currentSum + nums[i]);

                // Update max if currentSum is greater
                maxSoFar = Math.max(maxSoFar, currentSum);
            }

            return maxSoFar;
        }

        public static void main(String[] args) {
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            System.out.println("Maximum Subarray Sum: " + maxSubArraySum(nums));
        }
    }

