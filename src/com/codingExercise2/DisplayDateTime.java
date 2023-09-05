package com.codingExercise2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayDateTime {
    public static void displayCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Current Date and Time: " + formattedDateTime);
    }

    public static void main(String[] args) {
        displayCurrentDateTime();
    }
}
