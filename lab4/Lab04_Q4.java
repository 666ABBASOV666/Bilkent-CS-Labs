import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Lab04_Q4 {
        public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int s, i;

        System.out.print("Enter number of lines: ");
        s = sc.nextInt();
        i = 0;
        String a = ("*");
        while(i < s){
            System.out.println(a);
            a = a + "*";
            i++;
        }
    }
}
