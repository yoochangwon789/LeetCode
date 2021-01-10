package removeelement;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {

        int[] nums = {2,2,3,3};

        System.out.println(removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int answer = 0;
        int cnt = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            arrayList.add(nums[i]);
        }

        for (int j = 0; j < arrayList.size(); j++) {
            if (arrayList.get(j) == val) {
                cnt++;
            }
        }

        answer = arrayList.size() - cnt;

        return answer;
    }
}
