package dsa.twoPointer;

/// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of
/// the ith line are `(i, 0)` and `(i, height[i])`.
///
/// Find two lines that together with the x-axis form a container, such that the container contains the most water.
///
/// Return the maximum amount of water a container can store.
///
/// Notice that you may not slant the container.
/// Input: height = `[1,8,6,2,5,4,8,3,7]`
/// Output: `49`

public class MaximumWaterContent {
    public static void main(String[] args) {
        int[] wallHeights = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum amount of water content is : "+calWaterContent(wallHeights));
    }

    private static int calWaterContent(int[] height) {
        int maxArea = 0, left = 0, right = height.length-1;
        while(left < right) {
            int currArea = Math.min(height[left],height[right])*(right-left); // extracting the area, breath x length
            maxArea = Math.max(currArea, maxArea);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}
