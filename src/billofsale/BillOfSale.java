/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package billofsale;

/**
 *
 * @author evrob0095
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double shirt = 12.49;
        int payment = 20;
        double tax = shirt*0.13;
        double total = tax + shirt;
        double change = payment - shirt;
        System.out.println("Shirt: $" + shirt);
        System.out.println("Payed: $" + payment);
        System.out.println("Total: $" + shirt);
        System.out.println("Total + Tax: $" + total);
        System.out.println("Change: $" + change);
        
    }
    
}
