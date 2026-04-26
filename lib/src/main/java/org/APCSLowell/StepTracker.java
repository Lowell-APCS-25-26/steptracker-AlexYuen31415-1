package org.APCSLowell;

public class StepTracker {
    private int minSteps;
    private int totalSteps = 0;
    private int totalDays = 0;
    private int totalActiveDays = 0;
    public StepTracker(int activityThreshold) {
        minSteps = activityThreshold;
    }
    public void addDailySteps(int stepCount) {
        totalSteps += stepCount;
        totalDays++;
        if (stepCount >= minSteps) {
            totalActiveDays++;
        }
    }
    public int activeDays() {
        return totalActiveDays;
    }
    public double averageSteps() {
        if (totalDays == 0) {
            return 0;
        }
        return (double)totalSteps/totalDays;
    }
}
