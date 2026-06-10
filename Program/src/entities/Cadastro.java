package entities;

public class Cadastro {
    private int accNumber;
    private String name;
    private double balance;

    public Cadastro(int accNumber, String name, double initialDeposit){
        this.accNumber = accNumber;
        this.name = name;
        addBalance(initialDeposit);
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
    
    public double getBalance(){
        return balance;
    }

    public void addBalance(double balance){
        this.balance += balance;
    }
    public void removeBalance (double balance){
        this.balance = (this.balance -5)-balance;
    }

    public String toString() {
        return "Account data: \n" + 
        "Account: " +getAcc()+", Holder: "+getName() + ", Balance: $ "+getBalance(); 
    }
}
