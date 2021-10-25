import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Lab04_Q1 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.ENGLISH);
    int f0, f1, num, sumOfTwo;
     f0 = 0;
     f1 = 1;
     sumOfTwo = 0;
    System.out.println("Please input n: ");
    num = sc.nextInt();
    int i = 2;
    
    while( i <= num){
        sumOfTwo = f0 + f1;
        f0 = f1;
        f1 = sumOfTwo;
        i++;   
    }
    System.out.println("Fib (" + num + ") is " + sumOfTwo);
}
}


/graff75
