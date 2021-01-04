package twosum;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {3,4,4};

        TwoSum twoSum = new TwoSum();

        System.out.println(twoSum.twoSumSolution(nums, 8));
    }

    public ArrayList<Integer> twoSumSolution(int[] nums, int target) {
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j= 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    cnt1 = Arrays.binarySearch(nums, nums[i]);
                    cnt2 = Arrays.binarySearch(nums, nums[j]);
                }
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(cnt1);
        arrayList.add(cnt2);

        return arrayList;
    }
}
