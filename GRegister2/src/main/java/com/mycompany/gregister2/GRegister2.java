/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gregister2;
import java.nio.file.*;
import java.io.*;
import java.util.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
/**
 *
 * @author Admin
 */

/*
TODO:

-when printing total cost, add system which removes duplicates.

-add matching method in ringedItem and if it matched only then add the item
-clear ringed items after checkout
-ringedItem takes total cash and then gives the change.

test
-GUI for Casheier with method from Ringed item interactable there.
*/
public class GRegister2 {
    static Path p = Paths.get("inventory.csv").toAbsolutePath();

    public static void main(String[] args) {
        Inventory inventory = null;
        
        try {
            Scanner scanner = new Scanner(p);
            inventory = new Inventory(scanner);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        RingedItems checkout = new RingedItems();//stores items that are ringed
        
        checkout.add(inventory.get(0));
        checkout.add(inventory.get(1));
        checkout.add(inventory.get(1));
        checkout.add(inventory.get(0));
        checkout.add(inventory.get(0));
        checkout.add(inventory.get(2));
        checkout.add(inventory.get(2));
        
        Map<String, double[]> itemCount = checkout.generateReceipt();
        
        System.out.println("Receipt:");
        for (Map.Entry<String, double[]> entry : itemCount.entrySet()) {
            String itemName = entry.getKey();
            double[] summary = entry.getValue();
            System.out.println(itemName + " x" + (int)summary[0] + " @ " + summary[1] + " total");
            }
    }
}
//            System.out.println(inventory.get(i).getName());// use getName or getPrice etc for indiv.
//         inventory.printInventory();//prints all the inventory.