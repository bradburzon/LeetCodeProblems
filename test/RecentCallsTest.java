import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecentCallsTest {

    RecentCalls recentCalls;

    @Test
    public void ping_OneCall_ReturnOne(){
        recentCalls = new RecentCalls();

        int actual = recentCalls.ping(1);

        assertEquals(1, actual);
    }

    @Test
    public void ping_TwoCallsWithinThreeSecond_ReturnTwo(){
        recentCalls = new RecentCalls();
        recentCalls.ping(1);

        int actual = recentCalls.ping(100);

        assertEquals(2, actual);
    }

    @Test
    public void ping_CallAtEdgeOfTimeWindow_IncludesEdgeCallInCount() {
        recentCalls = new RecentCalls();
        recentCalls.ping(1);

        int actual = recentCalls.ping(3001);

        assertEquals(2, actual);
    }

    @Test
    public void ping_MultipleCallsWithinTimeWindow_ReturnCorrectCount() {
        recentCalls = new RecentCalls();
        recentCalls.ping(100);
        recentCalls.ping(200);
        recentCalls.ping(300);

        int actual = recentCalls.ping(1000);

        assertEquals(4, actual);
    }

    @Test
    public void ping_LastCallPlacedMuchLater_ReturnOne() {
        recentCalls = new RecentCalls();
        recentCalls.ping(1);
        recentCalls.ping(1000);
        recentCalls.ping(2000);
        recentCalls.ping(4000);

        int actual = recentCalls.ping(10000);

        assertEquals(1, actual);
    }
}