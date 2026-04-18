package ArraysCodingQuestions;

public class Count_the_number_of_sub_arrays_with_a_given_sum44 {
    public class CountSubarrays {
        public static int countSubarraysWithSum(int[] nums, int target) {
            int count = 0;

            // Check all subarrays
            for (int start = 0; start < nums.length; start++) {
                int sum = 0;
                for (int end = start; end < nums.length; end++) {
                    sum += nums[end]; // accumulate sum
                    if (sum == target) {
                        count++;
                    }
                }
            }

            return count;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, -2, 5};
            int target = 5;
            System.out.println("Number of subarrays with sum " + target + ": " +
                    countSubarraysWithSum(nums, target));
        }
    }

}
