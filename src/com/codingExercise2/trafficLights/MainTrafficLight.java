package com.codingExercise2.trafficLights;

public class MainTrafficLight {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 30);

        System.out.println("Current color: " + trafficLight.getColor());
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());

        trafficLight.changeColor("green");

        System.out.println("Current color: " + trafficLight.getColor());
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());

        trafficLight.setDuration(45);

        System.out.println("Current duration: " + trafficLight.getDuration());
    }
}
