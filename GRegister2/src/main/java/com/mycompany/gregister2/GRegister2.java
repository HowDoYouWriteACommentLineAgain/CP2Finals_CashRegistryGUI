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
        
        //code to call OrderMenu
        OrderMenu menu = new OrderMenu();
        menu.pack();
        menu.setVisible(true);
        
        //Sample Code with breif explanation 
        //Palagay nalang nito sa Ordermenu.
            RingedItems checkout = new RingedItems();//init the RingedItems arraylist. Name it whatever you want
            
            checkout.doesItemExist("133598000001");//sample of checking if Item exist. Returns bool
            //Ito Irun mo muna para macheck if if iyung item nageexist. 
            
            checkout.ringItem("133598000001");//sample of adding an item like bread.
            //nasa csv file lahat nung item IDs if you want to test just in case.
            
            checkout.printReciept();//this will print the reciept with all of the items with similar items combining
            //(Name) x(Amount) @ (Total price of how many times the Item occurs)
            //You can change the formating in the printReciept()method in RingedItems.java to fine tune it.
            
            checkout.totalAllItems();// print the Running Total.

//              debugging just ingore

//              checkout.ringItem("133598000001");//ground beef
//              checkout.ringItem("133598000001");//ground beef
//              checkout.ringItem("133598000001");//ground beef
//              checkout.ringItem("133598000001");//ground beef
//              checkout.ringItem("133598000002");//White Loaf Bread
//              checkout.ringItem("133598000002");//White Loaf Bread
//              checkout.ringItem("133598000002");//White Loaf Bread
//              checkout.printReciept();

    }
}