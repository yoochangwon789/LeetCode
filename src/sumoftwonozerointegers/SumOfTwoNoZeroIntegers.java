package sumoftwonozerointegers;

public class SumOfTwoNoZeroIntegers {
    public static void main(String[] args) {

    }

    public static int[] getNoZeroIntegers(int n) {
        int a = 0;
        int b = 0;
        String as = "";
        String bs = "";

        int[] answer = new int[2];

        for (int i = 1; i < n; i++) {
            a = i;
            b = n - i;
            if (a + b == n) {
                as = String.valueOf(a);
                bs = String.valueOf(b);

                if (as.indexOf("0") < 0 && bs.indexOf("0") < 0) {
                    answer[0] = a;
                    answer[1] = b;
                }
                b--;
            }
        }

        return answer;
    }
}
