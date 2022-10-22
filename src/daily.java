import java.util.*;
import java.util;

public class Daily{
    private ArrayList<Integer> dailyLog = new ArrayList<>();


    public static returnLogs(){
        dailyLog.add(0,KMDriven());
    }

    public static int KMDriven(int KM, int totalCarbonEmission, boolean done) {
        if(done) {
            return totalCarbonEmission;
        } else {
            totalCarbonEmission = totalCarbonEmission + KM;

        }

    }




}