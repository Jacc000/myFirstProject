import java.util.Scanner;

class BankAccount{
    double balance;

    BankAccount(double b){
        balance = b;
    }

    void deposit(double a){
        if (a != 0) {
            balance = balance + a;
            System.out.println("$" + a + " deposited successfully");
        }
        else
            System.out.println("Transaction canceled: No amount provided");
    }

    void withdraw(double a) {
        if (a > balance)
            System.out.println("Error: Insufficient Balance");
        else {
            if (a != 0) {
                balance = balance - a;
                System.out.println("$" + a + " withdrawn successfully.");
            } else
                System.out.println("Transaction canceled: No amount provided");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double startingBalance;
        double amount;
        int menuInput;


        System.out.println("Please input your account balance: ");
        startingBalance = in.nextDouble();

        BankAccount user = new BankAccount(startingBalance);

        System.out.println("Welcome, user. What would you like to do?");
        System.out.println("[0] Exit \n[1] Withdraw \n[2] Deposit");
        menuInput = in.nextInt();

        while (menuInput != 0){
            if (menuInput == 1){
                System.out.println("You have $" + user.balance);
                System.out.println("Input the amount you wish to withdraw: ");
                amount = in.nextDouble();
                user.withdraw(amount);
            }
            if (menuInput == 2){
                System.out.println("You have $ " + user.balance);
                System.out.println("Input the amount you wish to deposit: ");
                amount = in.nextDouble();
                user.deposit(amount);
            }
            System.out.println("Welcome, user. What would you like to do?");
            System.out.println("[0] Exit \n[1] Withdraw \n[2] Deposit");
            menuInput = in.nextInt();
        }

        System.out.println("Thank you, and goodbye.");
    }
}