package com.Realms_of_the_Skullasaurus.Realms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Institute_of_MonsterlordAxis_Technology {
    private List<String> list_of_inventions = new ArrayList<>();
    private double Research_Budget_axu = 1000.0;
    private double axu_50 = 50.0;
    private Map<String, Double> projectTypeToBudgetMap = new HashMap<>();

    public Institute_of_MonsterlordAxis_Technology() {
        initializeInventions();
        initializeProjectTypeToBudgetMap();
        System.out.println("Institute_of_MonsterlordAxis_Technology has been founded. Key Info:\r\n");
        for (String invention : list_of_inventions) {
            System.out.println(invention);
        }
    }

    private void initializeInventions() {
        list_of_inventions.add("Laser Disintegrator");
        list_of_inventions.add("Digitale Fernseher (Digital TV)");
        list_of_inventions.add("Überwachungsnetzwerk (Surveillance Network)");
        list_of_inventions.add("LordNET - advanced monsterlord computer network");
        list_of_inventions.add("Speakers");
        list_of_inventions.add("Satellite");
        list_of_inventions.add("Advanced Keyboard");
    }

    private void initializeProjectTypeToBudgetMap() {
        projectTypeToBudgetMap.put("tiny", axu_50);
        projectTypeToBudgetMap.put("small", 2 * axu_50);
        projectTypeToBudgetMap.put("medium", 3 * axu_50);
        projectTypeToBudgetMap.put("relatively large", 4 * axu_50);
        projectTypeToBudgetMap.put("large", 5 * axu_50);
        projectTypeToBudgetMap.put("very large", 6 * axu_50);
        projectTypeToBudgetMap.put("gargantuan", 7 * axu_50);
    }

    public void fundIncrease(String fundType) {
        if (fundType.equals("small")) {
            Research_Budget_axu += 2 * axu_50;
        } else if (fundType.equals("medium")) {
            Research_Budget_axu += 3 * axu_50;
        } else if (fundType.equals("large")) {
            Research_Budget_axu += 6 * axu_50;
        }
    }

    public void projectStart(String projectType) {
        double requiredBudget = projectTypeToBudgetMap.getOrDefault(projectType, 0.0);
        if (Research_Budget_axu >= requiredBudget) {
            Research_Budget_axu -= requiredBudget;
        }
    }
}

