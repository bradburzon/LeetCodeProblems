import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTargetHoursTest {
    EmployeeTargetHours employeeTargetHours;

    @Before
    public void setUp() {
        employeeTargetHours = new EmployeeTargetHours();
    }

    @Test
    public void numberOfEmployeesWhoMetTarget_EmptyArray_ReturnZero() {
        int[] hours = new int[]{};
        int target = 10;

        int actual = employeeTargetHours.numberOfEmployeesWhoMetTarget(hours, target);

        assertEquals(0, actual);
    }

    @Test
    public void numberOfEmployeesWhoMetTarget_TargetZero_ReturnLengthOfArray() {
        int[] hours = new int[]{1, 2, 0, 3, 4, 0, 0};
        int target = 0;

        int actual = employeeTargetHours.numberOfEmployeesWhoMetTarget(hours, target);

        assertEquals(7, actual);
    }

    @Test
    public void numberOfEmployeesWhoMetTarget_TargetOne_ReturnNumberOfPositiveHours() {
        int[] hours = new int[]{8, 7, 0, 2, 5, 0, 1};
        int target = 1;

        int actual = employeeTargetHours.numberOfEmployeesWhoMetTarget(hours, target);

        assertEquals(5, actual);
    }

    @Test
    public void numberOfEmployeesWhoMetTarget_NoTargetMet_ReturnZero() {
        int[] hours = new int[]{8, 7, 0, 2, 5, 0, 1};
        int target = 100;

        int actual = employeeTargetHours.numberOfEmployeesWhoMetTarget(hours, target);

        assertEquals(0, actual);
    }

    @Test
    public void numberOfEmployeesWhoMetTarget_ALLTargetMet_ReturnLengthOfArray() {
        int[] hours = new int[]{85, 37, 456, 23, 55, 455, 13};
        int target = 12;

        int actual = employeeTargetHours.numberOfEmployeesWhoMetTarget(hours, target);

        assertEquals(7, actual);
    }
}