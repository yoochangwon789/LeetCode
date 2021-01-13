package sumoftwonozerointegers;

public class SumOfTwoNoZeroIntegers {
    public static void main(String[] args) {

        int n = 1010;

        int a = 0;
        int b = 0;
        String as = "";
        String bs = "";

        int[] answer = new int[2];

        while (true) {
            a = 1;
            b = n - 1;

            if (a + b == n) {
                as = String.valueOf(a);
                bs = String.valueOf(b);

                if (as.indexOf("0") < 0 && bs.indexOf("0") < 0) {
                    answer[0] = a;
                    answer[1] = b;
                }
            }
            a++;
            b++;
            if (answer[0] > 0) {
                break;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

//    public static int[] getNoZeroIntegers(int n) {
//        int a = 0;
//        int b = 0;
//        String as = "";
//        String bs = "";
//
//        int[] answer = new int[2];
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        for (int i = 1; i < n; i++) {
//            for (int j = n - 1; j >= 0; j--) {
//                a = i;
//                b = j;
//
//                if (a % 10 != 0 && b % 10 != 0) {
//                    int a1 = a;
//                    int b1 = b;
//                    as = String.valueOf(a1);
//                    bs = String.valueOf(b1);
//
//                    if (as.indexOf("0") < 0 && bs.indexOf("0") < 0) {
//                        if (a1 + b1 == n) {
//                            arrayList.add(a1);
//                            arrayList.add(b1);
//                        }
//                    }
//                }
//            }
//        }
//
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = arrayList.get(i);
//        }
//
//        return answer;
//    }
}
