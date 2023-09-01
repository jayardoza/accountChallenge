/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountchallenge;

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[] args) {
        accountChallenge account = new accountChallenge("22103017", 1000.0, "Mendoza", "mendoza@gmail.com", "09422399305");

        System.out.println("Initial Account Information:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Account Balance: " + account.getAccountBalance());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone Number: " + account.getPhoneNumber());

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(800.0);

        System.out.println("Updated Account Balance: " + account.getAccountBalance());
    }
}

