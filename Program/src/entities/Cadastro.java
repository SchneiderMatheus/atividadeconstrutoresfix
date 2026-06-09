package entities;

public class Cadastro {
    private final int accNumber;
    private String name;
    private double balance;

    public Cadastro(int accNumber, String name, double balance){
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAcc(){
        return accNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void addBalance(double balance){
        this.balance += balance;
    }
    public void removeBalance (double balance){
        this.balance -=balance -5;
    }

    public void print() {
        System.out.println("Account data: ");
        System.out.print("Account: "+getAcc()+" Holder: "+getName() + " Balance: $ "+getBalance()); 
    
    }
}
