package day06.arrays.hard;

public class ProductExceptSelf {

        public static int[] productExceptSelf(int[] nums) {

            int n = nums.length;
            int[] answer = new int[n];

            // Find product for every index
            for (int i = 0; i < n; i++) {

                int product = 1;

                // Multiply all elements except nums[i]
                for (int j = 0; j < n; j++) {

                    if (i != j) {
                        product *= nums[j];
                    }

                }

                answer[i] = product;
            }

            return answer;
        }

        public static void main(String[] args) {

            int[] nums = {1, 2, 3, 4};

            int[] result = productExceptSelf(nums);

            System.out.print("Output: ");

            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }

