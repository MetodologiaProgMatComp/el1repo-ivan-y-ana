package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA1;

public class Account {
    private String id;
    private String name;
    private int balance=0;
    public Account(String id,String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id,String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    public int credit(int amount){
        balance = amount + balance;
        return balance;
    }
    public int debit(int amount){
        if (amount <= this.balance){
            balance= balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public int transferTo(Account anotherAccount,int amount){
        if (amount <= this.balance){
            balance = balance - amount;
            anotherAccount.credit(amount);

        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public String toString(){
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}

