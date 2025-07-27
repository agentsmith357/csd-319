
/*
 * Date: Jul 27, 2025
 * Author: Jelani Jenkins
 * Class: 402-j319
 * Teacher: Elijah Finch
 * Assignment: M12
 */
public class AutoService {

    // Base service cost
    public static int yearlyService() {
        return 200;
    }

    public static int yearlyService(int oilChange) {
        return 200 + oilChange;
    }

    public static int yearlyService(int oilChange, int tireRotation) {
        return 200 + oilChange + tireRotation;
    }

    public static int yearlyService(int oilChange, int tireRotation, int coupon) {
        return 200 + oilChange + tireRotation - coupon;
    }

    public static void main(String[] args) {
        System.out.println("Standard Service: $" + yearlyService());
        System.out.println("Service + Oil Change: $" + yearlyService(30));
        System.out.println("Service + Oil + Tires: $" + yearlyService(30, 20));
        System.out.println("Full Service with Coupon: $" + yearlyService(30, 20, 15));
    }
}