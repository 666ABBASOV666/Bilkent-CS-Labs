import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Lab03_Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int year, century;
        String sort;

        System.out.print("Enter the year to be evaluated: ");
        year = sc.nextInt();

        century = (year/100)+1; //century
        
        //first, second, third, etc.
        if( year % 100 == 1){
            sort = ("st");
        }
        else if( year % 100 == 2){
            sort = ("nd");
        }
        else if( year % 100 == 3){
            sort = ("rd");
        }
        else{
            sort = ("th");
        }
        //leap or not a leap
        if( year % 4 == 0 && year % 100 != 0){
            System.out.println("The year " + year + " is in the " + century + sort + " century and is a leap year.");
        }
        else if(year % 400 == 0){
            System.out.println("The year " + year + " is in the " + century + sort + " century and is a leap year.");
        }
        else{
            System.out.println("The year " + year + " is in the " + century + sort + " century and is not a leap year.");
        }
    sc.close();
    }
}


//Graff75
