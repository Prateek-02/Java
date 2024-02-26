import java.util.*;


/* CLASS AND OBJECTS */

/*
public class Online2 {
    //attributes(instance properties)
    int x =5;
    int y =6;

    // Default constructor
    Online2(){
        this.x = 8;
        this.y = 10;
        System.out.println("Object Created");
    }
    //Parameterized constructor
    Online2(int x,int y){
        this.x=x;
        this.y=y;

        System.out.println("Object created with data points "+ this.x + " and " + this.y);
    }

    public void setX(int x){
        this.x=x;
        System.out.println((x));
    }

    public int getX(){
        return this.x;
    }
    public static void main(String[] args){
        Online2 obj = new Online2(10,20);
        int x = obj.x;
        int y = obj.y;
        int z = x+y;
        System.out.println("Sum of x+y: "+z);

        x += 5; 
        y += 5; 
        z = x+y;
        System.out.println("Sum of x+y: "+z);

        Online2 obj2 = new Online2();
        obj2.setX(2);

        System.out.println(obj2.getX());
    }
}
*/


// Inheritance

/*
class A{
    public int a;
    public void show(){
        System.out.println("Inside class A "+this.a);
    }
    public void show(int n1,int n2){
        System.out.println("The numbers are: "+n1+" and "+n2);
    }
    public void show(float n3,float n4){
        System.out.println("The numbers are: "+n3+" and "+n4);
    }
}

class B extends A{
    public void show(){
        System.out.println("Inside class B "+this.a);
    }

    public void show1(){
        System.out.println("Inside class B "+this.a);
    }
}


public class Online2 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();
        obj1.show(1,2);
        obj1.show(1.5f,2.7f);

        B obj2 = new B();
        obj2.show();
        obj2.show1();
    }   
}
*/


/* Practice Questions */

import java.util.Scanner;

class Bank {
    private int accno;
    private String name;
    private double balance;

    // Inner class representing an account
    class Account {
        private int accno;
        private String name;
        private double balance;

        public Account(int accno, String name, double balance) {
            this.accno = accno;
            this.name = name;
            this.balance = balance;
        }

        // Getters and setters for account attributes
        public void setAccno(int accno) {
            this.accno = accno;
        }

        public int getAccno() {
            return accno;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        // Method to display account details
        public void show() {
            System.out.println("Account Number: " + accno);
            System.out.println("Name: " + name);
            System.out.println("Balance: " + balance);
        }

        // Method to deposit money into the account
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited " + amount + " successfully.");
            System.out.println("Updated balance: "+balance);
        }

        // Method to withdraw money from the account
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + " successfully.");
                System.out.println("Updated balance: "+balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        }
    }

    public Bank(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public void addAcc(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public void show() {
        System.out.println("Account Number: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Online2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of accounts: ");
        int number = sc.nextInt();
        Bank.Account[] arr = new Bank.Account[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for Account " + (i + 1) + ": ");
            System.out.print("Enter account number: ");
            int accno = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();
            System.out.println();

            Bank bank = new Bank(accno, name, balance);
            arr[i] = bank.new Account(accno, name, balance);
        }

        for (int i = 0; i < number; i++) {
            System.out.println();
            System.out.println("Details of Account " + (i + 1) + ":");
            arr[i].show(); // Using the show method to display account details
            System.out.println();
        }

        // Asking user if they want to deposit, withdraw or do nothing
        System.out.print("\nDo you want to deposit, withdraw, or do nothing? (d/w/n): ");
        char choice = sc.next().charAt(0);

        switch (choice) {
            case 'd':
                System.out.print("Enter the account number to deposit money: ");
                int accnoDeposit = sc.nextInt();
                System.out.print("Enter the amount to deposit: ");
                double amountDeposit = sc.nextDouble();
                for (int i = 0; i < number; i++) {
                    if (arr[i].getAccno() == accnoDeposit) {
                        arr[i].deposit(amountDeposit);
                        break;
                    }
                }
                break;
            case 'w':
                System.out.print("Enter the account number to withdraw money: ");
                int accnoWithdraw = sc.nextInt();
                System.out.print("Enter the amount to withdraw: ");
                double amountWithdraw = sc.nextDouble();
                for (int i = 0; i < number; i++) {
                    if (arr[i].getAccno() == accnoWithdraw) {
                        arr[i].withdraw(amountWithdraw);
                        break;
                    }
                }
                break;
            case 'n':
                System.out.println("No action taken.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
