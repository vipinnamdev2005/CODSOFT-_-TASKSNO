import java.util.ArrayList;
import java.util.Scanner;

class Bank {
    int id;
    int pin;
    float balance;
    float withdraw;
    float deposit;
    float checkBalance;
    float history;

    Bank(int id, int pin, float balance, float withdraw, float deposit, float checkBalance, float history) {
        this.id = id;
        this.pin = pin;
        this.balance = balance;
        this.deposit = withdraw;
        this.deposit = deposit;
        this.checkBalance = checkBalance;
        this.history = history;
    }

}

public class atm {
    static ArrayList<Bank> bank = new ArrayList<>();

    // static ArrayList<User>user = new ArrayList<>();
    public static void main(String[] args) {
        objBank();

    }

    static void swit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Check Balance: ");
        System.out.println("2. Widthdraw: ");
        System.out.println("3. Deposit: ");
        System.out.println("4. Transfer");
        System.out.println();
        System.out.println("Enter Number: ");

        int num = sc.nextInt();
        switch (num) {

            case 1:
                checkBalance();
                break;

            case 2:
                withdraw();
                break;

            case 3:
                deposit();

                break;

            case 4:
                transfer();

            default:
                break;
        }

    }

    static void objBank() {
        Bank b1 = new Bank(101, 101, 0, 0, 0, 0, 0);
        Bank b2 = new Bank(102, 102, 0, 0, 0, 0, 0);
        Bank b3 = new Bank(103, 103, 0, 0, 0, 0, 0);
        Bank b4 = new Bank(104, 104, 0, 0, 0, 0, 0);
        //  Bank b5 = new Bank(105, 105, 1000, 0, 0, 0, 0);

        bank.add(b1);
        bank.add(b2);
        bank.add(b3);
        bank.add(b4);
        swit();
    }

    static void user2() {
        Scanner sc = new Scanner(System.in);
        int amount = 0;
        for (Bank v : bank) {
            System.out.println("Enter User Id: ");
            int Id = sc.nextInt();
            if (Id == v.id) {
                System.out.println("Enter Amount: ");
                int usAmount = sc.nextInt();

                v.balance = v.balance + amount;
                v.deposit = amount;
                
                System.out.println("--------------------------");
                System.out.println("Transfer Succesfully: " + Id + "amount" + amount);
                System.out.println("--------------------------");
                swit();

            } else {
                System.out.println("--------------------------");
                System.out.println("User Id Not Found: ");
                System.out.println("--------------------------");
                swit();
            }

            

        }
        System.out.println("----------------------- ");
            swit();
    }

    static void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Id: ");
        int id = sc.nextInt();

        int amount = 0;
        for (Bank u : bank) {
            if (id == u.id) {
                user2();

            }
            System.out.println("--------------------------");
            System.out.println("This Id Does Not Found: ");
            System.out.println("--------------------------");
            swit();
        }
        System.out.println("-----------------------");
        System.out.println("This User Does Not Exist: ");
        System.out.println("-----------------------");
        swit();
    }

    static void checkBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Id: ");
        int id = sc.nextInt();

        int amount = 0;
        for (Bank u : bank) {
            if (id == u.id) {
                System.out.println("Enter Your PIN: ");
                int pin = sc.nextInt();

                if (pin == u.pin) {
                    System.out.println("------------------------------------");
                    System.out.println();
                    System.out.println("Your Total Amount is: " + u.balance);
                    System.out.println("-------------------------------------");
                    System.out.println();
                    swit();

                } else {
                    System.out.println("Pin is Wrong: ");
                    System.out.println("------------------------------------");
                    System.out.println();
                    swit();
                }
            }
        }
        System.out.println("This Id Does Not Exist: ");
        System.out.println("------------------------------------");
        System.out.println();
        swit();

    }

    static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Id: ");
        int id = sc.nextInt();

        int amount = 0;
        for (Bank u : bank) {
            if (id == u.id) {
                System.out.println("Enter Your PIN: ");
                int pin = sc.nextInt();

                if (pin == u.pin) {
                    System.out.println("Enter Amount: ");
                    amount = sc.nextInt();
                    u.balance = u.balance - amount;
                    System.out.println("------------------------------------");
                    System.out.println();

                    System.out.println("Amount Withdraw: " + amount);
                    System.out.println("------------------------------------");
                    System.out.println();
                    swit();
                } else {
                    System.out.println("Pin is Wrong: ");
                    System.out.println("------------------------------------");
                    System.out.println();
                    swit();
                }
            }
        }
        System.out.println("This Id Does Not Exist: ");
        System.out.println("------------------------------------");
        System.out.println();
        swit();

    }

    static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Id: ");
        int id = sc.nextInt();

        int amount = 0;
        for (Bank u : bank) {
            if (id == u.id) {
                System.out.println("Enter Your PIN: ");
                int pin = sc.nextInt();

                if (pin == u.pin) {
                    System.out.println("Enter Amount: ");
                    amount = sc.nextInt();
                    u.balance += amount;
                    System.out.println("------------------------------------");
                    System.out.println();
                    System.out.println("Deposit sucsesfully: " + amount);
                    System.out.println("-------------------------------");
                    System.out.println();
                    swit();
                    break;

                } else {
                    System.out.println("Pin is Wrong: ");
                    System.out.println("--------------------------------------");
                    System.out.println();
                    swit();
                }

            }
        }
        System.out.println("This Id Does Not Exist: ");
        System.out.println("------------------------------------");
        System.out.println();
        swit();
    }

}
