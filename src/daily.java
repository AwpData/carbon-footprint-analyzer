/**************************************
* 
* Date of last modification: 6/8/2022 
* About: 
*  
* Assumptions: 
***************************************/

import java.util.*;
import java.util;

public class Daily{
    private ArrayList<Integer> dailyLog = new ArrayList<>();


    /***************************************************
    *  Purpose: returnLogs will retrieve total emission from all of the possible emissions causes   
    *           and input it into arraylist
    *  Input: dataFromApp is an ArrayList containing all data points needed to calculate emission
    *  Output: N/A - inserting into ArrayList
    ***************************************************/
    public static void returnLogs(ArrayList dataFromApp){
        dailyLog.add(0,KMDriven());
    }

    /***************************************************
    *  Purpose: Taking in the km given from vechile and calculating the total emission 
    *           (Uses recursive calls in case of multiple vechicles)
    *  Input: int km is the total km driven in car, int totalCarbonEmission - final carbon emission,   
    *         boolean done - true when final vechile is added
    *  Output: An integer with the total carbon emission of all vechiles 
    ***************************************************/
    public static int KMDriven(int KM, String vehicle) {
        boolean done = false;
        int totalCarbonEmission = 0;
        KMHelper(KM, totalCarbonEmission, done, vehicle);

    }

    /***************************************************
    *  Purpose: Private helper function for KmDriven
    *  Input: int km is the total km driven in car, int totalCarbonEmission - final carbon emission,   
    *         boolean done - true when final vechile is added
    *  Output: An integer with the total carbon emission of all vechiles 
    ***************************************************/
    private int KMHelper(int KM, int totalCarbonEmission, boolean done, String vehicle) {
        if(done) {
            return totalCarbonEmission;
        } else {
            // API is used for this section
            totalCarbonEmission = totalCarbonEmission + KM(vehicle);
            // user input for next vehicle and new KM, idk know how it works with connections to moblie interface
            KM = 5;
            vehicle = "";
            KMHelper(KM, totalCarbonEmission, done, vehicle);
        }
    }
    /***************************************************
    *  Purpose: Calculate total emission based on total water used
    *  Input: int totalWaterUsed - users total water usage for that day
    *  Output: An integer with total carbon emission from water
    ***************************************************/
    public static int waterUsage(int totalWaterUsed){

    }

    /***************************************************
    *  Purpose: Calculate total emission based on total food used
    *  Input: int totalFoodUsed - users total food usage for that day
    *  Output: An integer with total carbon emission from food usage 
    ***************************************************/
    public static int foodUsage(int totalFoodUsed){
        //recursive case for different types of food
    }

    /***************************************************
    *  Purpose: Private helper function for foodUsage
    *  Input: int totalFoodUsed - users total food usage for that day
    *  Output: An integer with total carbon emission from food usage 
    ***************************************************/
    





}