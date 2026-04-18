package ArraysCodingQuestions;

public class Find_the_majority_element_occuring_more_than_n2_times37 {
    public class MajorityElement {
        public static int findMajorityElement(int[] nums) {
            int candidate = 0;
            int count = 0;

            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }

            // Step 2: Verify the candidate
            count = 0;
            for (int num : nums) {
                if (num == candidate) {
                    count++;
                }
            }

            if (count > nums.length / 2) {
                return candidate;
            } else {
                throw new IllegalArgumentException("No majority element found");
            }
        }

        public static void main(String[] args) {
            int[] nums = {2, 2, 1, 1, 2, 2, 2};
            System.out.println("Majority Element: " + findMajorityElement(nums));
        }
    }

}
