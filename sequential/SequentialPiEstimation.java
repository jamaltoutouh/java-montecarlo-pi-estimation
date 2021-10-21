package com.progdist.piestimation.sequential;

public class SequentialPiEstimation {

    private int totalPoints;
    private int insideCirclePoints;

    SequentialPiEstimation(int totalPoints) {
        this.totalPoints = totalPoints;
        this.insideCirclePoints = 0;
    }

    public int getInsideCirclePoints() {
        return insideCirclePoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints){
        this.totalPoints = totalPoints;
    }

    public double getPiEstimation(){
        if (this.totalPoints > 0) {
            return 4.0 * this.insideCirclePoints / this.totalPoints;
        }else{
            System.out.println("[ERROR] No random points to generate.");
            System.out.println("[ERROR] Please use setTotalPoints to set a number of points higher than 0.");
            return -1;
        }

    }

    public double runMonteCarlo(){
        if (this.totalPoints <= 0) {
            System.out.println("[ERROR] No random points to generate.");
            System.out.println("[ERROR] Please use setTotalPoints to set a number of points higher than 0.");
            return -1;
        }

        this.insideCirclePoints = 0;
        double x, y;
        for(int i = 0; i < this.totalPoints; i++){
            x = Math.random();      // Generate a random point
            y = Math.random();
            if (x*x + y*y <= 1) this.insideCirclePoints++;
        }
        return getPiEstimation();
    }
}
