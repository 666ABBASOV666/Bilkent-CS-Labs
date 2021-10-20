import java.util.Scanner; 
public class Lab02_Q4_Rev {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        double area, circumference, radius;
        double pi = 3.14;
        
        System.out.print("Enter the radius of the circle: "); //radius
        radius = sc.nextDouble();

        circumference = (2 * radius) * pi;
        System.out.printf("The circumference of the circle is");
        System.out.printf("%10s",":");
        System.out.printf("%10.3f", circumference);

        System.out.println();

        area =  radius * radius * pi;
        System.out.printf("The area of the circle is");
        System.out.printf("%19s", ":");
        System.out.printf("%10.3f ", area);
        System.out.println();

        sc.close();

    }  
}
