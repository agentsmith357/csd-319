
/*
 * Date: Jul 6, 2025
 * Author: Jelani Jenkins
 * Class: 402-j319
 * Teacher: Elijah Finch
 * Assignment: 9
 */

import java.util.ArrayList;
import java.util.Scanner;


public class module_9_movie_selector {

    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("The Conjuring");
        movies.add("Insidious");
        movies.add("Hereditary");
        movies.add("The Exorcist");
        movies.add("It");
        movies.add("The Ring");
        movies.add("A Nightmare on Elm Street");
        movies.add("Halloween");
        movies.add("The Babadook");
        movies.add("The Texas Chainsaw Massacre");
		
		

        for (String movie : movies) {
            System.out.println(movie);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the movie you want to see again:");

        String input = scanner.next();  // Autoboxing happens when converting String to Integer
        try {
            int index = Integer.valueOf(input);  // Autoboxing 
            String value = movies.get(index);    // Unboxing Integer to int
            System.out.println("Movie at index " + index + " is: " + value);
            
        }

        catch (Exception e) {
            System.out.println("Out of Bounds");
        }
        
    }
}
