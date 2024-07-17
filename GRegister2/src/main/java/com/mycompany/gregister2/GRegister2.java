/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gregister2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

/*
TODO:
-connect gui
-add regex for searching items
*/
public class GRegister2 {
    static Path p = Paths.get("inventory.csv").toAbsolutePath();

    public static void main(String[] args) {
        
//        OrderMenu menu = new OrderMenu();
//        menu.pack();
//        menu.setVisible(true);
        
        Inventory inventory = null;
        
        try {
            Scanner scanner = new Scanner(p);
            inventory = new Inventory(scanner);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        RingedItems checkout = new RingedItems();//stores items that are ringed
        
        checkout.add(inventory.get(0));//this works
        
        
        checkout.printReciept(checkout.generateReceipt());
    }
}
//            System.out.println(inventory.get(i).getName());// use getName or getPrice etc for indiv.
//         inventory.printInventory();//prints all the inventory.