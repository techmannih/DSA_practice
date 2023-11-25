// https://leetcode.com/problems/shuffle-the-array/
package Question.Array.Easy.ShuffleArray;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5, 6 }; // nums.lenght=2n
        int n = 3;
        int[] result = new int[(n * 2)];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];

        }
        System.out.println(Arrays.toString(result));
    }

}
