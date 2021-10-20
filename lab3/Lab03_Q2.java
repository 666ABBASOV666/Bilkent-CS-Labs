import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Lab03_Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String pin, choice, newBank, newPin;
        int newPin1;
        double initial = 1000.0;
        double withdraw, finalWithdraw;
        

        System.out.print("Enter your PIN: ");
        pin = sc.nextLine();

        if(pin.equals ("1234")){

            System.out.println("1- Withdraw Money \n2- Open a new account \n3- Change PIN");
            System.out.print("Select an operation: ");
            choice = sc.nextLine();
            
            //option 1 (withdraw)
            if(choice.equals ("1")){
                System.out.print("Enter the amount to withdraw: ");
                withdraw = sc.nextDouble();
                finalWithdraw = initial - withdraw;
                System.out.println("Your new balance is " + finalWithdraw + " TRY. Bye!");
            }
            //option2 (new bank account)
            else if(choice.equals ("2")){
            
                System.out.println("1- TRY");
                System.out.println("2- USD");
                System.out.println("Select currency type:");

                newBank = sc.nextLine();
                if(newBank.equals ("1")){
                    System.out.println("Your new TRY account is now opened! Bye!");
                }
                else if (newBank.equals ("2")){
                    System.out.println("Your new USD account is now opened! Bye!");
                }
            }    
                //option 3 (password change)
                else if (choice.equals ("3")){
                    System.out.print("Enter your new pin: ");
                    newPin = sc.next();
                    newPin1 = Integer.parseInt(newPin);
                    if (newPin.length() > 4){
                        System.out.println("Error. Characters limit more than 4!");
                    } 
                    else{
                    char ch1 = newPin.charAt(0);
                    char ch2 = newPin.charAt(3);
                    System.out.println("Your new PIN is changed to " + ch1 + "**" + ch2);
                    }
                }
            }    
         
        else{
            System.out.println("Invalid PIN! Bye!");
        }
        sc.close();
    }
}
    

//graff75
