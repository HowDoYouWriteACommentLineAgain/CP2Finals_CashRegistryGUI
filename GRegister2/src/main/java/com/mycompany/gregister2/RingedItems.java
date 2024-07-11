/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gregister2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
/**
 *
 * @author Admin
 */
public class RingedItems extends ArrayList<Item>{
    private double paidAmount = 0.0;
    
    public void ringItem(Item item){
        this.add(item);
    }
    
    public double totalAllItems(){//Iterates all the Item obj in arraylist and totals the price
        int cost=0;
        for(int i = 1; i<=this.size()-1;i++){
            cost+=this.get(i).getPrice();
        }
        return cost;
    }
    
    public void setPaidAmount(double x){//Use to set the paidAmount of the array through the GUI.
        paidAmount = x;
    }
    
    public double getChangeDue(){//Use to get the change due
        //!!! Note:Only call if setPaidAmount and totalAllItems are cleared.
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
//    public void getAllItemsRingedIndividually(){
//        
//    }
}
