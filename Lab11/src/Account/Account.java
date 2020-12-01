/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public Account() {
        dateCreated = new Date();
    }
    public Account(int id, double balance) {
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
    }
    public Account(int id, double balance, String name) {
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate/100;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*this.getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        balance-=amount;
        transactions.add(new Transaction('w',amount,balance,"withdraw"));
    }
    public void deposit(double amount){
        balance+=amount;
        transactions.add(new Transaction('d',amount,balance,"deposit"));
    }
    public void summary(){
        System.out.println("Holder name => " + name + "\nInterest Rate => " + annualInterestRate*100 + "%\nBalance => " + balance);
        for(int i=0;i<transactions.size();i++){
            System.out.println("Date: " + transactions.get(i).getDate() + " Type: " + transactions.get(i).getType() + " Amount: " + transactions.get(i).getAmount() + " Balance: " + transactions.get(i).getBalance() + " Description: " + transactions.get(i).getDescription());
        }
    }
}
