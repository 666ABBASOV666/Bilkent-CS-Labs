import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Lab02_Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        double odometer, oil, battery, brakes, tire, other, odometer2;

        //Odometer input
        System.out.print ("Enter the odometer reading of the car in kilometers: ");
        odometer = sc.nextDouble();
        odometer2 = odometer * 0.1;

        System.out.println("*************************************************");
        System.out.println("****** Maintenance Cost Distribution Table ******");
        System.out.println("*************************************************");

       
        oil = odometer2 * 30 / 100;
        battery = odometer2 * 15/ 100;
        brakes = odometer2 * 25 / 100;
        tire = odometer2 * 13 / 100;
        other = odometer2 * 17 / 100;


        System.out.println ("*Oil Change: 30%   " + oil);
        System.out.println ("*Battery:    15%   " + battery);
        System.out.println ("*Brakes:     25%   " + brakes);
        System.out.println ("*Tire:       13%   " + tire);
        System.out.println ("*Other:      17%   " + other);
        System.out.println ("*          TOTAL   " + odometer2); 
        System.out.println("*************************************************");


        
        
    }
    
}
