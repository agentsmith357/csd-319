/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Author: Jelani Jenkins
 * Date: Jun 22, 2025
 * Class Name: Java for Programmers
 * Teacher: Elijah Finch
 */
 
public class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6.0;
    private String color = "white";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // My getter
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // my setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // This is my override method for the ToString 
    public String toString() {
        return "Fan status: " + (on ? "ON" : "OFF") +
               ", Speed: " + speedToString(speed) +
               ", Radius: " + radius +
               ", Color: " + color;
    }

    private String speedToString(int speed) {
        switch (speed) {
            case SLOW: return "SLOW";
            case MEDIUM: return "MEDIUM";
            case FAST: return "FAST";
            default: return "STOPPED";
        }
    }

    public static void main(String[] args) {
        // Fan 1 using default function without overriding anything
        Fan fan1 = new Fan();
        System.out.println("Fan 1: " + fan1);

        // Fan 2 using argumentaa
        Fan fan2 = new Fan(Fan.FAST, true, 10.5, "blue");
        System.out.println("Fan 2: " + fan2);

        // Modify fan1 using setters
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8.0);
        fan1.setColor("black");

        System.out.println("Updated Fan 1: " + fan1);
    }

}
