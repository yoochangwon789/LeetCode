package numberofdigits;

public class NumberOfDigits {

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};

        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        String[] answerNums = new String[nums.length];
        int[] answer = new int[answerNums.length];

        int cnt = 0;

        for (int i = 0; i < answerNums.length; i++) {
            answerNums[i] = String.valueOf(nums[i]);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerNums[i].length();

            if (answer[i] % 2 == 0) {
                cnt++;
            }
        }

        return cnt;
    }
}
