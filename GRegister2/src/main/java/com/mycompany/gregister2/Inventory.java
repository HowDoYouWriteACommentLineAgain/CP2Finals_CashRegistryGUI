/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gregister2;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Inventory extends ArrayList<Item>{
//    ArrayList<Item> inventory = new ArrayList<>();//Creates the inventory
    
        public Inventory(Scanner s){
            ArrayList<String> tempStringHolder = new ArrayList<>();
            s.useDelimiter(",|\n");
            
            // Skip header row
            if (s.hasNextLine()) {
                s.nextLine();
            }

            while (s.hasNext()) {
                tempStringHolder.add(s.next());//Adds item while there is one.
            }

            int rows = tempStringHolder.size() / 4;//Dynamically holds the rows of the csv file.
            
            for (int i = 0; i < rows; i++) {
                this.add(new Item(i, tempStringHolder));
            }
        }
        
        
        
        public void printInventory() {
        for (Item item : this) {
            item.printData();
        }
    }
}
