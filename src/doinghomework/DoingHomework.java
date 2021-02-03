package doinghomework;

public class DoingHomework {
    public static void main(String[] args) {

        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        int query = 4;

        System.out.println(busyStudent(startTime, endTime, query));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt = 0;
        int answer = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                cnt++;
            }
        }

        answer = cnt;

        return answer;
    }
}
