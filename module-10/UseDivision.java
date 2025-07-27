
/*
 * Date: Jul 13, 2025
 * Author: Jelani Jenkins
 * Class: 402-j319
 * Teacher: Elijah Finch
 * Assignment: 10
 */
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intl1 = new InternationalDivision("Asia Pacific", 1, "Japan", "Japanese");
        InternationalDivision intl2 = new InternationalDivision("Europe HQ", 2, "Germany", "German");

        DomesticDivision dom1 = new DomesticDivision("East Coast Sales", 3, "New York");
        DomesticDivision dom2 = new DomesticDivision("West Coast Logistics", 4, "California");

        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}