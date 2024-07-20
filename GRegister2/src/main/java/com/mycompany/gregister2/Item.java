/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gregister2;


import java.util.ArrayList;


public class Item {
    
    private String id, name;
    private int amount;
    private double price;
    private static final int WIDTH = 4;

    public void Item(){};
    
    public Item(int row, ArrayList<String> tempStringHolder) {//Will add the item on the row argument.
        int y = row;
        id = tempStringHolder.get(y * WIDTH);
        name = tempStringHolder.get(y * WIDTH + 1);
        amount = Integer.parseInt(tempStringHolder.get(y * WIDTH + 2));
        price = Double.parseDouble(tempStringHolder.get(y * WIDTH + 3));
    }

    public Item(String i, String n, int a, double p) {//will add the item per the users argument.
        id = i;
        name = n;
        amount = a;
        price = p;
    }

    public void printData() {
        System.out.println("ID: " + id + " Name: " + name + " Amount: " + amount + " Price: " + price);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public void printPrice() {
        System.out.println("₱" + price);
    }
}
