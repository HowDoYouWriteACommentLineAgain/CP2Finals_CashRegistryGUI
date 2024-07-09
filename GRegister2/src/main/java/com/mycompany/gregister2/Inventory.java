/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gregister2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Inventory extends ArrayList<Item>{
//    ArrayList<Item> inventory = new ArrayList<>();//Creates the inventory
    
        public Inventory(int rows){
            for (int i = 1; i <= rows; i++) {
                this.add(new Item(i));
            }
        }
        
        public void printInventory(){
            for (int i = 0; i <= this.size() - 1; i++) 
                this.get(i).printData();
        }
}
