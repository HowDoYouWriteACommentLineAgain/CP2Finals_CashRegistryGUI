/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gregister2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class GRegister2 {
    static Path p = Paths.get("inventory.csv").toAbsolutePath();

    public static void main(String[] args) {

        //code to call OrderMenu
        OrderMenu menu = new OrderMenu();
        menu.pack();
        menu.setVisible(true);
    }
}