package day06.arrays.hard;

public class TrappingRainwaterBruteForce {
    public static int trap(int[] height) {

        int n = height.length;
        int totalWater = 0;

        // First and last buildings cannot trap water
        for (int i = 1; i < n - 1; i++) {

            int leftMax = height[i];

            // Find tallest building on the left
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            int rightMax = height[i];

            // Find tallest building on the right
            for (int j = i + 1; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            // Water trapped at current building
            totalWater += Math.min(leftMax, rightMax) - height[i];
        }

        return totalWater;
    }

    public static void main(String[] args) {

        int[] height = {4,2,0,3,2,5};

        System.out.println(trap(height));
    }
}
