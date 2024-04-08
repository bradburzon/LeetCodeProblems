public class StudentHomework {

    public int busyStudent( int[] startTime, int[] endTime, int queryTime){
        int studentStudying =0;
        for(int i = 0; i < startTime.length; i++){
            if(startTime[i] <= queryTime && queryTime <= endTime[i]){
                studentStudying++;
            }
        }
        return studentStudying;
    }
}