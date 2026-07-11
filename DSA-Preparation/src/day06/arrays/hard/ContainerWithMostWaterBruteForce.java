package day06.arrays.hard;

public class ContainerWithMostWaterBruteForce {

        public static int maxArea(int[] height) {

            int n = height.length;
            int maxWater = 0;

            for (int i = 0; i < n; i++) {

                for (int j = i + 1; j < n; j++) {

                    int width = j - i;

                    int currentHeight = Math.min(height[i], height[j]);

                    int area = width * currentHeight;

                    maxWater = Math.max(maxWater, area);

                }

            }

            return maxWater;
        }

        public static void main(String[] args) {

            int[] height = {1,8,6,2,5,4,8,3,7};

            System.out.println(maxArea(height));

        }

    }

