import java.util.ArrayList;
import java.util.Scanner;

import org.omg.IOP.TransactionService;

class Account {

    String name;
    int accountnumber;
    double balance;
    ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(String name, int accountnumber, double balance) {
        this.accountnumber = accountnumber;
        this.name = name;
        this.balance = balance;
    }

    public void Deposit(double amount) {
        if (amount > 0)
            balance = amount;
        transactions.add(new Transaction("Deposit ", amount));
        System.out.println("Deposited sucessfully! ");
    }
}

class Transaction {
    String type;
    double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String tostring() {
        return type + ": Rs." + amount;

    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transaction.add(new Transactions("Withdrawal", amount));
            System.out.println("Withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance or invalid amount.");

        }
    }

    public void viewTransactions() {
        if (transaction.isEmpty()) {
            System.out.println("No transaction yet.");

        } else {
            for (Transactions t : transaction)
                ;
            {
                System.out.println(t);
            }

        }
    }

    public void checkbalance() {
        System.out.println("Current balance:Rs." + balance);

    }
}

static class Bankapp {
    static Scanner sc = new Scanner(System.in);
    public Account account;

    public static void main(String[] args) {

    }}{System.out.println("Enter account holder name :");

    String name = sc
            .nextLine();account=new Account(name,47267,0);System.out.println("Account created successfully. Account Number :");};
    int choice;do{System.out.println("\n1.Deposit\n2.Withdraw\n3.check Balance\n4.Veiw Transaction\n5.Exit ");System.out.println("Enter your choice:");choice=sc.nextInt();

    switch(choice){
            case 1:
                  System.out.println("Enter amount to deposit:")
                  double dep = sc.nextDouble();
                  account.Deposit(dep);
                  break;

           case 2:
                  System.out.println("Enter amount to withdraw:");
                  double with = sc.nextDouble();
                  account.withdraw(with);
                  break;
          case 3:
               account.checkBalance();
                break;
         case 4:
                 account.viewTransaction();
                 break;
         case 5:
                  System.out.println("Thank you for using the bank App.");
                       break;
              default:
              System.out.println("Invalid choice.");
            }
}while(choice!=5);
