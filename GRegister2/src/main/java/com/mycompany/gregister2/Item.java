/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gregister2;

//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Item {
//    static Path p = Paths.get("inventory.csv").toAbsolutePath();
    
    private String id, name;
    private int amount;
    private double price;
    private static final int WIDTH = 4;
//    private ArrayList<String> tempStringHolder;

//    public void Item(){};
    
    public Item(int row, ArrayList<String> tempStringHolder) {//Will add the item on the row argument.
//        try {
            tempStringHolder = new ArrayList<>();
            int y = row;
//            Scanner InvScanner = new Scanner(p);
//TODO:
/*
-Remove scanner declaration here
-Add scanner parameter to Item(int row)
-declare scanner in main instead
*/
//            InvScanner.useDelimiter(",|\n");
//
//            while (InvScanner.hasNext()) {
//                tempStringHolder.add(InvScanner.next());
//            }

            id = tempStringHolder.get(y * WIDTH);
            name = tempStringHolder.get(y * WIDTH + 1);
            amount = Integer.parseInt(tempStringHolder.get(y * WIDTH + 2));
            price = Float.parseFloat(tempStringHolder.get(y * WIDTH + 3));
            
//            tempStringHolder.clear();
//            InvScanner.close();

//        } catch (Exception e) {
//            System.out.println("Error for Item.java: "+e);
//        }
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
//    public void printAll() {
//        for (int i = 0; i <= tempStringHolder.size() - 1; i++) {
//            System.out.println(i + " " + tempStringHolder.get(i));
//        }
//    }
}
