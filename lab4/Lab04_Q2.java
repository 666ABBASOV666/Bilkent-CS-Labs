import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Lab04_Q2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.ENGLISH);
    String str;
    
    System.out.print("Please input the string: ");
    str = sc.next();
    int i = 0, j = str.length() - 1;

    while (i < j) {
        i++;
        j--;
        if (str.charAt(i) == str.charAt(j)){
            System.out.println("It is polindrome");
            break;
        }
        else{
            System.out.println("It is not polindrome");
            break;
        }
    }
    }
}
