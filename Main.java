import java.util.Scanner;

public class Main {

    public static void doDeposit(Scanner scanner, Account person){
        System.out.println("Enter amdount: \n$");
        int withdrawAm = Integer.parseInt(scanner.nextLine());
        person.withdraw(withdrawAm);
    }

    public static void doWithdraw(Scanner scanner, Account person){
        System.out.println("Enter amount: $");
        int depositAm = Integer.parseInt(scanner.nextLine());
        person.deposit(depositAm);
    }

    public static boolean exit(Scanner scanner){
        System.out.println("Would you like to continue? Yes or No");
        String exitChoice = scanner.nextLine().toLowerCase();
        if(exitChoice.equals("no")){
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String name = "";
        boolean setCustomer = true;

        while(setCustomer){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is Your Name? ");
            name = scanner.nextLine();

            System.out.println("Would you like to Withdraw or Deposit?");
            String choice = scanner.nextLine().toLowerCase();
            Account person = new Account(1,0, name, "", "");

            if(choice.equals("w")){
                doDeposit(scanner, person);
                setCustomer = exit(scanner);

            }
            else if(choice.equals("d")){
                doWithdraw(scanner, person);
                setCustomer = exit(scanner);
            }

            else{
                setCustomer = exit(scanner);
            }

        }


    }
}