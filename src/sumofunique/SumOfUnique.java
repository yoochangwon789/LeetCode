package sumofunique;

import java.util.ArrayList;
import java.util.List;

public class SumOfUnique {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        int answer = 0;
        int cnt = 0;

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int pik = nums[i];

            for (int j = 0; j < nums.length; j++) {
                if (pik == nums[j]) {
                    cnt++;
                }
            }

            if (cnt == 1) {
                integerList.add(pik);
            }
            cnt = 0;
        }

        for (int i = 0; i < integerList.size(); i++) {
            answer += integerList.get(i);
        }

        return answer;
    }
}
