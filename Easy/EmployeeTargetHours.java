public class EmployeeTargetHours {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int targetHit = 0;
        for (int n : hours) {
            if (n >= target) {
                targetHit++;
            }
        }
        return targetHit;
    }
}