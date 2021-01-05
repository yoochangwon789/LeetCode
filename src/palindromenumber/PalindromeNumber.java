package palindromenumber;

import java.util.ArrayList;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1000021));
    }

    public static boolean isPalindrome(int x) {
        boolean answer = false;
        int num = 0;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        if (x == 0) {
            answer = true;
        }

        while (x != 0) {
            num = x % 10;
            arrayList1.add(num);
            x = x / 10;
        }

        for(int i = arrayList1.size() - 1; i >= 0; i--) {
            arrayList2.add(arrayList1.get(i));
        }

        for(int i = 0; i < arrayList1.size(); i++) {
            if (arrayList2.get(0) < 0) {
                arrayList2.add(arrayList1.get(arrayList1.size() - 1) * -1);
            }
        }

        answer = arrayList1.equals(arrayList2);

        return answer;
    }
}
