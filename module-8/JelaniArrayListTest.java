/*
 * Date: Jul 6, 2025
 * Author: Jelani Jenkins
 * Class: 402-j319
 * Teacher: Elijah Finch
 * Assignment: M8
 */


import java.util.ArrayList;
import java.util.Scanner;



public class JelaniArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type an integer or press 0 to complete:");

        while (true) {
            String data = scanner.next();
            if (data.matches("-?\\d+")) { // Added a check to see if its a digit to avoid errors
            int number = Integer.parseInt(data);
            numbers.add(number);
            if (number == 0) {
                System.out.println("Analyzing...");
                break;             
            }
            }
            else{
                System.out.println("Only numbers please.");
    
            }
        }
        
        Integer largest = max(numbers);
        System.out.println("The largest value is: " + largest);
        
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        
        Integer largest = list.get(0);
        for (Integer number : list) {
            if (number > largest) {
                largest = number;
                
                
            }
        }
        return largest;
    }
}