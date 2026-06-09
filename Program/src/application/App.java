package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cadastro cadastro = new Cadastro(0, null, 0);

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.println("Is there an initial deposit y/n)?");
        String yesOrNo = sc.nextLine();
        if (yesOrNo.equals("y")) {
            System.out.println("Enter the intial deposit value: ");
            double balance = sc.nextDouble();
        } else {
            double balance = 0;
        }

        Cadastro.print(accNumber, name, accNumber);

        System.out.print("\nEnter a deposite value: ");
        cadastro.addBalance(sc.nextDouble());

        Cadastro.print(accNumber, name, accNumber);

        System.out.print("enter a withdraw value:");
        double withdraw = sc.nextDouble();
        while (withdraw > cadastro.getBalance() -5) {
                System.out.println("THATS MORE THAN WHAT YOU HAVE, REMEMBER IS COSTS YOU $5 TO MAKE A WITHDRAW! TRY AGAIN");
                System.out.print("enter a withdraw value:");
                withdraw = sc.nextDouble();
        }

        cadastro.removeBalance(withdraw);
        System.out.println();
        Cadastro.print(accNumber, name, accNumber);

        sc.close();
    }
}
