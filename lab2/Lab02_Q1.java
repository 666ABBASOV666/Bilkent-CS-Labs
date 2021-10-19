import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Lab02_Q1
{
    public static void main (String [] args)
    {   
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        
        double width, height, area, circumference, diagonal, diagonal2;

        System.out.print( "Enter the width of the rectangle: ");
        width = sc.nextDouble();

        System.out.print( "Enter the height of the rectangle: ");
        height = sc.nextDouble();

        System.out.println();

        area = (width * height);
        System.out.printf ( "The area of the rectangle is: %19.3f ", area);

        System.out.println();

        circumference = (width + height) * 2;
        System.out.printf ( "The circumference of the rectangle is: %10.3f ", circumference);

        System.out.println();

        diagonal = ( width * width) + (  height * height);
        diagonal2 = Math.sqrt(diagonal);
        System.out.printf ( "The diagonal of the rectangle is: %15.3f ", diagonal2);


        sc.close();

       

        


    }





}


