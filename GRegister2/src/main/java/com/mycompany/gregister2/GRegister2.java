/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gregister2;
import java.nio.file.*;
import java.io.*;
import java.util.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */

/*
TODO:
-Remove scanner declaration in item
-Add scanner parameter to Item(int row) in item
-declare scanner in main instead in item

-when printing total cost, add system which removes duplicates.

-add matching method in ringedItem and if it matched only then add the item
-clear ringed items after checkout
-ringedItem takes total cash and then gives the change.

test
-GUI for Casheier with method from Ringed item interactable there.
*/
public class GRegister2 {

    public static void main(String[] args) {
         Inventory inventory = new Inventory(5);//Note that 0 is the header and should be skipped;
         RingedItems checkout = new RingedItems();//stores items that are ringed
         
         checkout.add(new Item("TestBarCode", "TestName", 2, 12));
         System.out.println(checkout.get(0).getName());//testing of checkout.
         
//         System.out.println("Your Total is: $"+checkout.totalAllItems());
//         inventory.printInventory();
    }
}
//            System.out.println(inventory.get(i).getName());// use getName or getPrice etc for indiv.
//         inventory.printInventory();//prints all the inventory.