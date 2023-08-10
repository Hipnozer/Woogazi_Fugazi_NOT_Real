//this is the list of the people excluded by both monsterlords and Champions
package com.Champions_and_Monsterlords.Tschampijonschip;
import java.util.ArrayList;
import java.util.List;
public class Blacklist {
    List<String> Blacklist_database = new ArrayList<>();
    public Blacklist () {
        System.out.println("Blacklist - this is the list of the people excluded by both monsterlords and Champions");
        Blacklist_database.add("Wanderer the Forbidden - leader of the outside knowledge");
        Blacklist_database.add("Mystery the Unknown - master of the unknown regions of the Tschampijonschip world");
        Blacklist_database.add("George the Guessing - master of ancient order questioning riddles");
        System.out.println("Blacklist contains following names:");
        for (String person : Blacklist_database) {
            System.out.println(person);
        }
    }

}
