import java.util.ArrayList;
import java.util.List;

public class RecentCalls {

    List<Integer> list;
    int lastPosition;

    public RecentCalls() {
        list = new ArrayList<>();
        this.lastPosition = 0;
    }

    public int ping(int t) {
        list.add(t);
        int count = lastPosition;
        for (int i = lastPosition; i < list.size(); i++) {
            int pingNum = list.get(i);
            if (pingNum >= t - 3000 && pingNum <= t) {
                count++;
            }
        }
        return count;
    }
}