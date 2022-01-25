import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) throws Exception {
        BankAccount new_account = new BankAccount();

        String input_Ac_number = "";
        String input_Ac_name = "";
        double input_balance = 0.00; 

        // Taking user inputs ⬇︎
        System.out.println("Account number should start with (FI) + 6 digits afterward.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your account number: ");
            String Ac_num_pat = "FI\\d{6}";
            boolean is_Ac_num_Str = scanner.hasNext(Ac_num_pat);


            if (is_Ac_num_Str == true) {
                input_Ac_number = scanner.nextLine();
                break;
            } else {
                System.out.println("(FI) should be in capital letter and 6 digit afterward");
                System.out.println("Example. FI123456");
            }
            scanner.nextLine();

        }

        System.out.println("");

        while (true) {
            System.out.println("Enter your account name: ");
            boolean is_Ac_name_Str = scanner.hasNext();

            if (is_Ac_name_Str) {
                input_Ac_name = scanner.nextLine().toUpperCase();
                break;
            } else {
                System.out.println("Invalid Account name");
            }
            scanner.nextLine();
        }

        System.out.println("");

        while (true) {
            System.out.println("Enter your Account balance: ");
            boolean is_balance_doube = scanner.hasNextDouble();

            if (is_balance_doube) {
                input_balance = scanner.nextDouble();
                if(input_balance >= 0){
                    break;
                }
                else{
                    System.out.println("");
                    System.out.println("Negative value is not acceptable, try again!");
                }
            } else {
                System.out.println("Please enter a valid number!");
                System.out.println("If value (0.00) not get accepted, try value (0,00) instead!");
            }
            scanner.nextLine();
        }
        scanner.close();

        // setting input values to fied variables
        new_account.setAccount_number(input_Ac_number);
        new_account.setAccount_owner(input_Ac_name);
        new_account.setBalance(Math.floor(input_balance * 1e2) / 1e2);

        System.out.println("");
        new_account.print(); // Printing bank info
        System.out.println("");
        new_account.withdraw(100.23); // makign a widthdraw
        System.out.println("");
        new_account.print(); // Printing bank info again
        System.out.println("");
        // new_account.deposit(500); // Making a deposit
        // System.out.println("");
        // new_account.print(); // Printing account information again 
        
    }
}
