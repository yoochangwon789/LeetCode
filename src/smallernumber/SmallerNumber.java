package smallernumber;

import java.util.ArrayList;
import java.util.List;

public class SmallerNumber {
    public static void main(String[] args) {

        int[] num = {8,1,2,2,3};

        System.out.println(smallerNumbersThanCurrent(num));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        for (int i : nums) numList.add(i);

        int top = 0;

        while (true) {
            int cnt = 0;

            numList.remove(0);

            for (int i = 0; i < numList.size(); i++) {
                if (nums[top] > numList.get(i)) {
                    cnt++;
                }
            }

            numList.add(nums[top]);
            integerList.add(cnt);
            top++;

            if (integerList.size() == nums.length) {
                break;
            }
        }

        int[] answer = new int[integerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = integerList.get(i);
        }

        return answer;
    }
}
