package org.CECarlemany;

import org.CECarlemany.Expedition.Expedition;
import org.CECarlemany.Expedition.ExpeditionConsolePrinter;
import org.CECarlemany.Mountain.InMemoryMountainCatalogue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExcursionCenter excursionCenter = new ExcursionCenter();

        Map<Integer, String> mainMenuOptions = new HashMap<>(){{
            put(1, "Get expeditions of an expeditionary");
            put(5, "Exit program");
        }};

        Scanner consoleLineScanner = new Scanner(System.in);

        do {
            for (Map.Entry<Integer, String> entry : mainMenuOptions.entrySet()) {
                System.out.printf("%d - %s\n", entry.getKey(), entry.getValue());
            }

            int selectedOption = consoleLineScanner.nextInt();

            switch (selectedOption) {
                case 1 -> getExpeditionsByExpeditionaryIDMenu(consoleLineScanner, excursionCenter);
                case 5 -> System.exit(0);
                default -> System.out.println("Option not available");
            }
        } while (true);
    }

    private static void getExpeditionsByExpeditionaryIDMenu(Scanner consoleLineScanner, ExcursionCenter excursionCenter) {
        System.out.println("Enter expeditionary ID:");
        String expeditionaryID = consoleLineScanner.next();

        List<Expedition> foundExpeditions = excursionCenter.retrieveExpeditionsFromExpeditionaryID(expeditionaryID);
        for (Expedition expedition : foundExpeditions) {
            new ExpeditionConsolePrinter(expedition).print();
        }
    }
}