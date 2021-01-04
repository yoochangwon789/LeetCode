package twosum;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {3,4,4};

        TwoSum twoSum = new TwoSum();

        int[] answer = twoSum.twoSumSolution(nums, 8);

        for(int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public int[] twoSumSolution(int[] nums, int target) {
        int[] answer = {};

        for (int i = 0; i < nums.length; i++) {
            for (int j= i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer = new int[]{i, j};
                }
            }
        }
        return answer;
    }
}
