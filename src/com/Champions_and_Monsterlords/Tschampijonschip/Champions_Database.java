package com.Champions_and_Monsterlords.Tschampijonschip;

public class Champions_Database {
    String[] Champion_name_base = new String [1000];
    String[] Abilities_base = new String [1000];

    public Champions_Database() {
        /*
            Database should be filled in the following way:
            Champion Names:
                0 Ultreque the Brightlighted,
                1 Archwizard Ambonaire,
                2 William the Enlighted,
                3 Jan von Lichtverteidiger,
                4 Bourbaine the Lord,
                5 Willfred the Allied,
                6 Jim the Lordservant,
                7 Cecilia the Examplegiver,
                8 Elisabeth the Brightmagick,
                9 Julia the Crownholder
            Abilities:
                0,2,3 Healing and regeneration
                1,8 Summoning Elemented_Spawns, causing snowstorms, shielding
                4,5 Training Troops, Forging weapons
                6 Priest control, master of sermons and propaganda,
                7,9 Royal Specialists, government officials.
        */
        // Fill Champion Names
        Champion_name_base[0] = "Ultreque the Brightlighted";
        Champion_name_base[1] = "Archwizard Ambonaire";
        Champion_name_base[2] = "William the Enlighted";
        Champion_name_base[3] = "Jan von Lichtverteidiger";
        Champion_name_base[4] = "Bourbaine the Lord";
        Champion_name_base[5] = "Willfred the Allied";
        Champion_name_base[6] = "Jim the Lordservant";
        Champion_name_base[7] = "Cecilia the Examplegiver";
        Champion_name_base[8] = "Elisabeth the Brightmagick";
        Champion_name_base[9] = "Julia the Crownholder";

        // Fill Abilities
        Abilities_base[0] = "Healing and regeneration";
        Abilities_base[1] = "Summoning Elemented_Spawns, causing snowstorms, shielding";
        Abilities_base[2] = "Healing and regeneration";
        Abilities_base[3] = "Healing and regeneration";
        Abilities_base[4] = "Training Troops, Forging weapons";
        Abilities_base[5] = "Training Troops, Forging weapons";
        Abilities_base[6] = "Priest control, master of sermons and propaganda";
        Abilities_base[7] = "Royal Specialists, government officials";
        Abilities_base[8] = "Summoning Elemented_Spawns, causing snowstorms, shielding";
        Abilities_base[9] = "Royal Specialists, government officials";

        for (int champion_number=0;champion_number < 10;champion_number++){
            System.out.println("The champion named: "+ Champion_name_base[champion_number] + " Has the abilities of: "+Abilities_base[champion_number]);
        }
    }
}
