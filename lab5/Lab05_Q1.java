
import java.util.Scanner;

public class Lab05_Q1{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print( "Please enter city plan string: ");
        String num = sc.next();
        System.out.print("City blueprint: ");
        System.out.println();
    
        int length  = num.length(); 

        int columns = 0; 
        int result = 0;

        for(int i = 0; length > i; i++) 
        {  
            result = num.charAt(i) - '0';
            if(result >= columns)
            {
                columns = result;
            }
        }
        for(int x = 0; columns > x; x++) //columns
        {
            for (int y = 0; length > y; y++) // *
            {   
                result = num.charAt(y) - '0'; 
                if (result >= columns - x ) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
        sc.close();
        }
    }
    

