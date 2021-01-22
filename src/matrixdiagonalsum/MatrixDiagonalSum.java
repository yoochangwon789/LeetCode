package matrixdiagonalsum;

import java.util.ArrayList;
import java.util.List;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        List<Integer> integerList = new ArrayList<>();

        int top = 0;
        int answer = 0;

        if (mat.length % 2 == 1 && mat[0].length % 2 == 1) {
            for (int i = 0; i < mat.length; i++) {
                integerList.add(mat[i][i]);
            }
            integerList.remove(integerList.get(integerList.size() / 2));

            for (int i = mat.length - 1; i >= 0; i--) {
                integerList.add(mat[top][i]);
                top++;
            }
        } else {
            for (int i = 0; i < mat.length; i++) {
                integerList.add(mat[i][i]);
            }

            for (int i = mat.length - 1; i >= 0; i--) {
                integerList.add(mat[top][i]);
                top++;
            }
        }

        for (int i : integerList) {
            answer += i;
        }

        return answer;
    }
}
