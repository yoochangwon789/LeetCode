package arraysreversing;

import java.util.Arrays;

public class ArraysReversing {
    public static void main(String[] args) {

        int[] target = {1,1,1};
        int[] arr = {1,1,1};

        System.out.println(canBeEqual(target, arr));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        int cnt = 0;
        boolean answer = false;

        if (target.length != arr.length) {
            answer = false;
        }

        Arrays.sort(target);
        Arrays.sort(arr);

        for (int i = 0; i < target.length; i++) {

            if (target[i] == arr[i]) {
                cnt++;

                if (target.length == cnt) {
                    answer = true;
                }
            }
        }

        return answer;
    }
}
