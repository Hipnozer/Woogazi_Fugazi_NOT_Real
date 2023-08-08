package com.Hipnozer.YanuschBuissnessu;

import java.util.Scanner;

public class Sword_of_Darkness {
    String owner = "";
    Double damage = 0.0;

    public Sword_of_Darkness() {
        // ANSI escape code for red text
        String redColorCode = "\u001B[31m";
        String resetColorCode = "\u001B[0m";

        System.out.println(redColorCode + "The corrupted weapon of the dark has been made: TREMBLE MORTALS!!!" + resetColorCode);

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the owner's name: ");
        owner = inputScanner.nextLine();

        System.out.print("Enter the damage value: ");
        damage = inputScanner.nextDouble();
    }


}

