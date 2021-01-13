package countnegativenumbers;

import java.util.ArrayList;

public class CountTest {
    public static void main(String[] args) {

        int[][] gridTest = {{5,1,0}, {-5,-5,-5}};

        int cnt = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < gridTest.length; i++) {
            for (int j = 0; j < gridTest[0].length; j++) {
                if (gridTest[i][j] * -1 > 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
