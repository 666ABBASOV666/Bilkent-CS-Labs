import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Lab02_Q3 {
    public static void main (String[] args){

    Scanner sc = new Scanner (System.in);
    sc.useLocale(Locale.ENGLISH);
    
    String title;
    int length;
    
    System.out.print ( "Enter the title: ");
    title = sc.nextLine();
    
    System.out.println ("-------------------------------------");

    length = title.length();
    System.out.println( "Number of characters: " + length); //length

    System.out.println("All uppercase: " + title.toUpperCase()); //uppercase
    System.out.println("Remove leading and trailing blank characters:" + title.strip()); //remove blank characters
    System.out.println("Character at index position 5:" + title.substring(5,6)); //index position
    System.out.println("Title from 3rd character to 8th character (not included):" + title.substring(2,7));
    System.out.println("First occurence of character 'a':" + title.indexOf("a")); //first appearence of a
    System.out.println("Last occurence of character 'a':" + title.lastIndexOf("a")); //last appearence of a
    





    }
}
