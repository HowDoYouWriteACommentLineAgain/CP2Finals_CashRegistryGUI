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
    
    
    public void ringItem(Item item){
        boolean MatchedPrevious = false;
        int positionOfItem = 1;
        
        for(int i=1; i<=this.size()-1;i++){
            String compare = this.get(i).getName();
            if (compare.equalsIgnoreCase(item.getName())){
                MatchedPrevious = true;
                positionOfItem = i;
                break;
            }
        }
        if(!MatchedPrevious){
            this.add(item);
        }else{
            this.set(positionOfItem, item);
        }
       
    }
    
    public double totalAllItems(){//Iterates all the Item obj in arraylist and totals the price
        double cost=0;
        for(int i = 1; i<=this.size()-1;i++){
            cost+=this.getItemTOtalPrice(i);
        }
        return cost;
    }
    
    public double getChangeDue(double paidAmount){//Use to get the change dues
        return paidAmount - totalAllItems();
    }
    
    public double getItemPrice(int i){
        return this.get(i).getPrice();
    }
    
    public double getItemTOtalPrice(int i){
        return this.get(i).getPrice() * this.get(i).getAmount();
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
