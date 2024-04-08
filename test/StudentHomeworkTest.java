import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentHomeworkTest {

    StudentHomework studentHomework;

    @Before
    public void setup(){
        studentHomework = new StudentHomework();
    }

    @Test
    public void busyStudent_EmptyTimes_ReturnZero(){
        int actual = studentHomework.busyStudent(new int[]{}, new int[]{}, 5);

        assertEquals(0, actual);
    }

    @Test
    public void busyStudent_OneStudentMatch_ReturnOne(){
        int[] startTime = new int[]{1};
        int[] endTime = new int[]{3};
        int queryTime = 2;

        int actual = studentHomework.busyStudent(startTime, endTime, queryTime);

        assertEquals(1, actual);
    }

    @Test
    public void busyStudent_OneStudentNonMatch_ReturnZero(){
        int[] startTime = new int[]{1};
        int[] endTime = new int[]{3};
        int queryTime =10;

        int actual = studentHomework.busyStudent(startTime, endTime, queryTime);

        assertEquals(0, actual);
    }

    @Test
    public void busyStudent_MultipleStudents_ReturnCorrectMatch(){
        int[] startTime = new int[]{1, 2, 3};
        int[] endTime = new int[]{3, 2, 7};
        int queryTime =4;

        int actual = studentHomework.busyStudent(startTime, endTime, queryTime);

        assertEquals(1, actual);
    }

    @Test
    public void busyStudent_LargeNumberOfStudents_ReturnCorrectMatch(){
        int[] startTime = new int[]{1, 2, 3, 1, 2, 3, 4, 6, 7, 3};
        int[] endTime = new int[]{ 3, 4, 6, 7, 3, 1, 2, 3, 1, 2,};
        int queryTime =4;

        int actual = studentHomework.busyStudent(startTime, endTime, queryTime);

        assertEquals(3, actual);
    }
}