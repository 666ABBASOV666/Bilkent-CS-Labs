import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Lab04_Q3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int num, old, values;
        double sum = 0;

        System.out.print( "Please input n: ");
        num = sc.nextInt();
        System.out.println( "Now input " + num + " positive integers: ");

        old = num;       
        int min = Integer.MIN_VALUE;       
        int max = Integer.MAX_VALUE;

        while (num > 0)
        {
            values = sc.nextInt();
            sum = sum + values;     
            num--;

                if(values > min) 
                {
                    min = values;
                }
                if(values < max)  
                {
                    max = values;
                }
        }

        System.out.println( "Max: " + min);
        System.out.println( "Min: " + max);
        System.out.println( "Average : " + (sum / old));
       
        sc.close();
    }
}


/graff75
