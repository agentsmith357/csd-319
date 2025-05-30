/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jelani Jenkins
 * 
 */
import java.util.Scanner;

public class jjenkins_module_1_3_temp_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("The energy needed is %.2f joules.%n", energy);
    }
}