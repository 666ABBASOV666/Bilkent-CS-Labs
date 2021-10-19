import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Lab03_Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        double height, weight, bmi;

        System.out.print("Enter your weight in kilograms: ");
        weight = sc.nextDouble();
        System.out.print("Enter your height in meters: ");
        height = sc.nextDouble();

        bmi = (weight / (height * height));

        if (bmi<18.5){
            System.out.printf("Your BMI is %4.2f ", bmi);
            System.out.print(" and you are in category of underweight.");
        }
        else if (18.5<=bmi && bmi<25){
            System.out.printf("Your BMI is %4.2f ", bmi);
            System.out.print(" and you are in category of healthy.");
        }
        else if (25<=bmi && bmi<30){
            System.out.printf("Your BMI is %3.2f ", bmi);
            System.out.print(" and you are in category of overweight.");
        }
        else{
            System.out.printf("Your BMI is %4.2f ", bmi);
            System.out.print(" and you are in category of obese.");
        }
        
        sc.close();
    }
}

//Graff75
