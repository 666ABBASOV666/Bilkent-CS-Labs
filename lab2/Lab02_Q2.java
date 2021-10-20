import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Lab02_Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        double odometer, oil, battery, brakes, tire, other, odometer2;
        String total = "TOTAL";

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

        System.out.printf("*Oil Change");
        System.out.printf("%19s", "30%" );
        System.out.printf("%19.3f ", oil);
        System.out.println();

        System.out.printf ("*Battery" );
        System.out.printf("%22s", "15%" );
        System.out.printf("%19.3f ", battery);
        System.out.println();

        System.out.printf ("*Brakes");
        System.out.printf("%23s", "25%" );
        System.out.printf("%19.3f ", brakes);
        System.out.println();

        System.out.printf ("*Tire");
        System.out.printf("%25s", "13%" );
        System.out.printf("%19.3f ", tire);
        System.out.println();
        
        System.out.printf ("*Other");
        System.out.printf("%24s", "17%" );
        System.out.printf("%19.3f ", other);
        System.out.println();

        System.out.printf("%32s",total);
        System.out.printf("%17.3f \n", odometer2);

        System.out.println("*************************************************");

        sc.close();
    }
    
}
