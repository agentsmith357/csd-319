
/*
 * Date: Jul 13, 2025
 * Author: Jelani Jenkins
 * Class: 402-j319
 * Teacher: Elijah Finch
 * Assignment: 10
 */
public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String division_name, int acctNum, String country, String language) {
        super(division_name, acctNum);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("Name: " + division_name);
        System.out.println("Account #: " + accountNuacctNummber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}