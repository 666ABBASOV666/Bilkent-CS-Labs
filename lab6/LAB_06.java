import java.util.Scanner;
import java.math;
public class LAB_06 {
    
    //////////////////// Fibbonaci ///////////////////////
    public static boolean isPerfectSquare (int a){

        if (a >= 0){
        int sr = (int) Math.sqrt(a);
        return ((sr * sr) == a);
    }
    return false;
}

    public static boolean isFibbonaci (int a){

        int b = 5 * a * a + 4;
        int c = 5 * a * a - 4;
        if (isPerfectSquare(b) || isPerfectSquare(c))
        {
            return true;
        }
        return false;
    }

    //////////////////// Harshad ///////////////////////

    public static int sumOfDigits (int a){
        int number = a;
        int sum = 0;
        int digits = 0;
        int secondNumber = number;
        while(secondNumber > 0){

            digits = secondNumber % 10;
            sum = sum + digits ;
            secondNumber = secondNumber / 10; // removes the last digit

          }

          return sum;
    }

    public static boolean isHarshad (int a){

        while(a % sumOfDigits(a) == 0)
        {
            return true;
        }
        return false; 
    }

     //////////////////// Prime Number ///////////////////////
     
     static boolean isPrime(int a)
     {   
         if (a <= 1) // equal to 1
             return false;
        
         else if (a == 2) //number is 2 = true
             return true;
  
         else if (a % 2 == 0)
             return false;
  
         for (int i = 3; i <= Math.sqrt(a); i += 2)
         {
             if (a % i == 0)
                 return false;
         }
         return true;
     }

     ////////////////////////Narciss Number//////////////////////
     static int countDigits(int a){
        int number = a;
        int sum = 0;
        int digits = 0;
        int secondNumber = number;
        while(secondNumber > 0){

            digits = secondNumber % 10;
           
            sum = sum + 1 ;
            secondNumber = secondNumber / 10; // removes the last digit
          } 
          return sum;
     }

     static int power(int a, int b){
        int power = 1;
        int cem = 1;
        int newCem = 1;
        for(int i = 0; i < b; i++){
            cem = power * a;
            newCem = newCem * cem; 
        }
        return newCem;  
    }

    public static boolean isNarcissistic(int a){
        int newResult = 0;
        int digits = countDigits(a);
        int ourNum = a;
        for(int i = 0; i <= digits; i++){
            int digit = ourNum % 10;
            int result = power(digit,digits);
            newResult += result;
            ourNum = ourNum / 10;
        }
            if(newResult == a){
                    return true;
                }   
                return false;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be examined: ");
        int number = sc.nextInt();

       //////////////////// Fibbonaci ///////////////////////
        if (isFibbonaci(number) == true){

            System.out.println((number) + " is Fibbonaci number.");
        }

        else{
            System.out.println((number) + " is not Fibbonnaci number.");
        }
        
        //////////////////////////Harshad//////////////////////
        if (isHarshad(number) == true){

            System.out.println((number) + " is Harshad number.");
        }

        else{
            System.out.println((number) + " is not Harshad number.");
        }

         ////////////////////////Prime Number//////////////////////
         if (isPrime(number) == true){

            System.out.println((number) + " is Prime number.");
        }

        else{
            System.out.println((number) + " is not Prime number.");
        }

        ///////////////////////Narcissistic Number//////////////////////

        if (isNarcissistic(number) == true){

            System.out.println((number) + " is Narcissistic.");
        }

        else{
            System.out.println((number) + " is not Narcissistic.");
        }
    }
}
