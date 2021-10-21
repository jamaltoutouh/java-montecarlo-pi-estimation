package com.progdist.piestimation.sequential;

public class Main {

    public static void main(String[] args) {
	    int randomPointsToGenerate = 65000;
        SequentialPiEstimation piEstimation = new SequentialPiEstimation(randomPointsToGenerate);
        double piValue = piEstimation.runMonteCarlo();
        double absoluteError = Math.abs(Math.PI - piValue);
        System.out.println("- Estimated Pi value: " + piValue + "\n" +
                "  + Absolute error with \"actual\" Pi value: " + absoluteError + "\n" +
                "  + Generated " + randomPointsToGenerate + " random points");
    }
}
