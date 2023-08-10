package com.Hipnozer.YanuschBuissnessu;
import com.Champions_and_Monsterlords.Tschampijonschip.Champions_Database;
import com.Champions_and_Monsterlords.Tschampijonschip.Monsterlords_Database;
import com.Champions_and_Monsterlords.Tschampijonschip.Blacklist;
import java.util.Scanner;

public class Main {
    public static void Code_Verifying_Barrier (){
        Scanner code_verifying_scanner = new Scanner(System.in);

        System.out.print("Do you want to execute the code further after that part? (true/false): ");
        boolean executeCode = code_verifying_scanner.nextBoolean();

        if (executeCode) {
            System.out.println("Going further with the code execution");
        } else {
            System.out.println("Code execution not requested. Program ends.");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        //----------------------------------------------------------------------------
        Code_Verifying_Barrier();
        System.out.println("Woogazi Fugazi code execution:\r\n");
        String hello_asshole = "Welcome to the desert of the real. Here the reality crumbles apart.\r\n";
        System.out.printf(hello_asshole);
        String sraczqua = "";

        int i_int = 0;
        for (float i = 0; i <= 15; i += 0.5) {
            i_int = (int) i;
            sraczqua += String.valueOf(i_int) + ": " + String.valueOf(i) + " :" + String.valueOf(i_int) + "\r\n";
            Woogazi_Foogazi.Proper_Woogazi_Fugazi(sraczqua);
        }

        System.out.println("Sraczqua: " + sraczqua + "\r\n");

        Scanner scanner = new Scanner(System.in); // Create a single Scanner instance for input
        //----------------------------------------------------------------------------
        Code_Verifying_Barrier();
        System.out.println("Kitty java code execution:\r\n");
        Kitty_Kitty K1 = new Kitty_Kitty();
        K1.Kitty_naming_fun();
        K1.Meow();
        K1.Kitty_sword_creator();
        //----------------------------------------------------------------------------
        Code_Verifying_Barrier();
        System.out.println("Champions and Monsterlords package execution:\r\n");
        Champions_Database CH1 = new Champions_Database();
        Monsterlords_Database ML1 = new Monsterlords_Database();
        Blacklist BL1 = new Blacklist();
    }
}

