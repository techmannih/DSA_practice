package Question.Array.Easy.Running_Sum;

import java.util.*;
public class RunningSum {
    public static void main(String args[]) {
        System.out.println("hello");

        int[] nums = {1, 2, 3, 4, 5};
        int[] runningSum = new int[nums.length];

        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
            System.out.println(runningSum[i]);
        }

        System.out.println(Arrays.toString(runningSum));
    }
}
