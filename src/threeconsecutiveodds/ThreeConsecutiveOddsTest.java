package threeconsecutiveodds;

public class ThreeConsecutiveOddsTest {
    public static void main(String[] args) {

        int[] arr = {1,2,34,3,4,5,7,23,12};
        int cnt = 0;
        boolean answer = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                cnt++;
                if (cnt >=3) {
                    System.out.println(true);
                }
            } else {
                cnt = 0;
            }
        }
        System.out.println(cnt);
    }
}
