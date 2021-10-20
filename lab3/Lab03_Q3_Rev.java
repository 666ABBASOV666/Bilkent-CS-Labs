import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Lab03_Q3_Rev {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String pin, choice, newBank, newPin;
        double initial = 1000.0;
        double withdraw, finalWithdraw, cardLimit;
        

        System.out.print("Enter your PIN: ");
        pin = sc.nextLine();

        if(pin.equals ("1234")){

            System.out.println("1- Request a credit card \n2- Withdraw Money \n3- Open a new account \n4- Change PIN");
            System.out.print("Select an operation: ");
            choice = sc.nextLine();
            

            //option 0 (Request a card)
            if( choice.equals ("1")){
                
                System.out.print("Enter the card limit (cannot exceed 2 * your balance): ");
                cardLimit = sc.nextDouble();
                if( cardLimit > (2 * initial)){
                    System.out.println("You entered an invalid amount! Bye!");
                }
                else{
                    System.out.println("Your credit card request has been successfully received! Bye");
                }
            }
            //option 1 (withdraw)
            if(choice.equals ("2")){
                System.out.print("Enter the amount to withdraw: ");
                withdraw = sc.nextDouble();
                finalWithdraw = initial - withdraw;
                System.out.println("Your new balance is " + finalWithdraw + " TRY. Bye!");
            }
            //option2 (new bank account)
            else if(choice.equals ("3")){
            
                System.out.println("1- TRY");
                System.out.println("2- USD");
                System.out.println("3- EUR");
                System.out.println("4- XAU");
                System.out.println("Select currency type:");

                newBank = sc.nextLine();
                //TRY
                if(newBank.equals ("1")){
                    System.out.println("Your new TRY account is now opened! Bye!");
                }
                //USD
                else if (newBank.equals ("2")){
                    System.out.println("Your new USD account is now opened! Bye!");
                }
                //EUR
                else if (newBank.equals ("3")){
                    System.out.println("Your new EUR account is now opened! Bye!");
                }
                //XAU
                else if (newBank.equals ("4")){
                    System.out.println("Your new XAU account is now opened! Bye!");
                }
                else{
                    System.out.println("Your selection is invalid! Bye!");
                }
            }    

                //option 3 (password change)
                else if (choice.equals ("4")){
                    System.out.print("Enter your new pin: ");
                    newPin = sc.next();
                    char ch1 = newPin.charAt(0);
                    char ch2 = newPin.charAt(3);
                    System.out.println("Your new PIN is changed to " + ch1 + "**" + ch2);
                }
            }    
         
        else{
            System.out.println("Invalid PIN! Bye!");
        }
        sc.close();
    }
}
    

//Elkhan Abbasov