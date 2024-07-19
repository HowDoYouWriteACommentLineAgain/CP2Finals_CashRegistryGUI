/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gregister2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class RingedItems extends ArrayList<Item>{
    static Inventory inventory = null;
    
    public RingedItems(){
        Path p = Paths.get("inventory.csv").toAbsolutePath();
        try {
            Scanner scanner = new Scanner(p);
            inventory = new Inventory(scanner);            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ringItem(String id){
        int index = 0;
        for(Item i : inventory){
            index++;
            String compareThis = i.getId();
            if(compareThis.equals(id)){
                this.add(inventory.get(index));
            }
        }
//        this.add(item);
    }
    
    public double totalAllItems(){//Iterates all the Item obj in arraylist and totals the price
        int cost=0;
        for(int i = 1; i<=this.size()-1;i++){
            cost+=this.get(i).getPrice();
        }
        return cost;
    }
    
    public double getChangeDue(double paidAmount){//Use to get the change dues
        return paidAmount - totalAllItems();
    }
    
    public double getItemPrice(int i){
        return this.get(i).getPrice();
    }
    
    public void printAndIterateNames(){
        for (Item item : this){
            System.out.println(item.getName());
        }
        
    }
    
    //This is used by the method after this.
    private Map<String, double[]> generateReceipt() {
        // Initialize the hash map to store item counts
        Map<String, double[]> itemCount = new HashMap<>();

        // Iterate through the items in the list and combines all similar items
        for (Item item : this) {
            String itemName = item.getName();
            double itemPrice = item.getPrice();
            double[] summary = itemCount.getOrDefault(itemName, new double[2]);
            summary[0]++;//Stores how many of this item occurs
            summary[1] += itemPrice;//stores how much the items are total.
            itemCount.put(itemName, summary);
        }

        return itemCount;
    }
    
    //use this to print the reciept
    public void printReciept(){
        Map<String, double[]> itemCount = this.generateReceipt();
        
        System.out.println("Receipt:");
        for (Map.Entry<String, double[]> entry : itemCount.entrySet()) {
            String itemName = entry.getKey();
            double[] summary = entry.getValue();
            System.out.println(itemName + " x" + (int)summary[0] + " @ " + summary[1] + " total");
            }
    }
}
