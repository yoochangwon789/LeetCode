package richestcustomerwealth;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] accounts = {{2,8,7}, {7,1,3}, {1,9,5}};

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int answer = 0;

        for (int i = 0; i < accounts.length; i++) {
            int max = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                max += accounts[i][j];
            }
            answer = Math.max(answer, max);
        }

        return answer;
    }
}
