package threeconsecutiveodds;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {

        int[] arr = {1,2,34,3,4,5,7,23,12};

        System.out.println(threeConsecutiveOdds(arr));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int cnt = 0;
        boolean answer = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                cnt++;
                if (cnt >= 3) {
                    answer = true;
                }
            } else {
                cnt = 0;
            }
        }

        return answer;
    }
}
