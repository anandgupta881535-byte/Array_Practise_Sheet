package ArraysCodingQuestions;

public class Find_the_element_that_appears_only_once_while_others_appear_twice42 {
        public static int findSingle(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                int count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
                if (count == 1) {
                    return nums[i]; // Found the element that appears only once
                }
            }
            return -1; // No single element found
        }

        public static void main(String[] args) {
            int[] nums = {2, 3, 5, 4, 5, 3, 4};
            System.out.println("Element appearing once: " + findSingle(nums));
        }
    }

