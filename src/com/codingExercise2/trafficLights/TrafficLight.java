package com.codingExercise2.trafficLights;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String initialColor, int initialDuration) {
        color = initialColor;
        duration = initialDuration;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int newDuration) {
        duration = newDuration;
    }
}
