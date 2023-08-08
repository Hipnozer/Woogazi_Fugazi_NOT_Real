package com.Hipnozer.YanuschBuissnessu;
import java.util.Scanner;

public class Kitty_Kitty {
    static String Kitty_name;
    public static String Kitty_naming_fun() {
        System.out.println("The cat has been summoned. What shall its name be:");
        Scanner Kitty_name_scanner = new Scanner(System.in);
        Kitty_name = Kitty_name_scanner.nextLine();
        // No need to close the scanner here

        return Kitty_name;
    }

    public static void Meow() {
        System.out.println("Come here " + Kitty_name + ", Kitty, Kitty:");


        System.out.print("Is the cat angry? (type true or false): ");
        Scanner bool_scanner = new Scanner(System.in);
        boolean IsKittyAngry = bool_scanner.nextBoolean();

        if (IsKittyAngry) {
            System.out.println("MrrrEEEEOOOOOW!!!!");
            System.out.println("AAAARRRRGGGHH!!! (moaning of the dead and dying in the background)");
        } else {
            System.out.println("PurrPurr wanna hug");
        }
    }
    public static Sword_of_Darkness Kitty_sword_creator () {
        Sword_of_Darkness S1 = new Sword_of_Darkness ();
        return S1;
    }
}
