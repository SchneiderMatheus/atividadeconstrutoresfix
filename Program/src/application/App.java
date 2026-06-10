package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double balance;

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Is there an initial deposit y/n)?");
        char yesOrNo = sc.next().charAt(0);
        if (yesOrNo == 'y') {
            System.out.println("Enter the intial deposit value: ");
            balance = sc.nextDouble();
        
        } else {
            balance = 0;
        }
        Cadastro cadastro = new Cadastro(accNumber, name, balance);

        //cadastro.addBalance(balance);

        System.out.println(cadastro);

        System.out.print("\nEnter a deposite value: ");
        cadastro.addBalance(sc.nextDouble());

        System.out.println(cadastro);

        System.out.print("\nEnter a withdraw value:");
        double withdraw = sc.nextDouble();
        while (withdraw > cadastro.getBalance() -5) {
                System.out.println("THATS MORE THAN WHAT YOU HAVE, REMEMBER IS COSTS YOU $5 TO MAKE A WITHDRAW! TRY AGAIN");
                System.out.print("Enter a withdraw value:");
                withdraw = sc.nextDouble();
        }

        cadastro.removeBalance(withdraw);
        System.out.println();
        System.out.println(cadastro);

        sc.close();
    }
}
