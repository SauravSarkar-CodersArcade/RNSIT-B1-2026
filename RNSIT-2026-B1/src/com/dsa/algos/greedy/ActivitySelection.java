package com.dsa.algos.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Activity {
    int start;
    int finish;
    public Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
}
public class ActivitySelection {
    // Comparator to sort the activities according to finish time
    static class ActivityCompare implements Comparator<Activity> {
        public int compare(Activity a1, Activity a2){
            return a1.finish - a2.finish; // Ascending order
        }
    }
    static void printMaxActivities(List<Activity> activities){
        // Sort the activities according to their finish time
        activities.sort(new ActivityCompare());
        // Always select the activity that finishes earliest
        int lastSelected = 0; // Start at index 0
        System.out.print("(" + activities.get(lastSelected).start + ", " +
                activities.get(lastSelected).finish + ")");
        for (int i=1; i<activities.size(); i++){
            if(activities.get(i).start >= activities.get(lastSelected).finish){
                // Print the current activity
                System.out.print("(" + activities.get(i).start + ", " +
                        activities.get(i).finish + ")");
                lastSelected = i; // Update the index to move to next
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
                new Activity(5,7),
                new Activity(8,9),
                new Activity(1,4),
                new Activity(5,9),
                new Activity(0,6),
                new Activity(3,5)
        );
        printMaxActivities(activities);
    }
}
