package org.CECarlemany;

import org.CECarlemany.Expedition.Expedition;
import org.CECarlemany.Expedition.ExpeditionConsolePrinter;
import org.CECarlemany.Expeditionary.Expeditionary;
import org.CECarlemany.Expeditionary.ExpeditionaryConsolePrinter;
import org.CECarlemany.Expeditionary.ExpeditionaryType;
import org.CECarlemany.Mountain.InMemoryMountainCatalogue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExcursionCenter excursionCenter = new ExcursionCenter();

        Map<Integer, String> mainMenuOptions = new HashMap<>() {{
            put(1, "Get expeditions of an expeditionary");
            put(2, "Create expeditionary");
            put(3, "List expeditionaries");
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
                case 2 -> createExpeditionaryMenu(consoleLineScanner, excursionCenter);
                case 3 -> getAllExpeditionariesMenu(excursionCenter);
                case 5 -> System.exit(0);
                default -> System.out.println("Option not available");
            }
        } while (true);
    }

    private static void getAllExpeditionariesMenu(ExcursionCenter excursionCenter) {
        List<Expeditionary> expeditionaries = excursionCenter.retrieveExpeditionaries();
        for (Expeditionary expeditionary : expeditionaries) {
            ExpeditionaryConsolePrinter expeditionaryConsolePrinter = new ExpeditionaryConsolePrinter(expeditionary);
            expeditionaryConsolePrinter.print();
        }
    }

    private static void createExpeditionaryMenu(Scanner consoleLineScanner, ExcursionCenter excursionCenter) {
        Map<Integer, String> expeditionaryTypeMenuOptions = new HashMap<>() {{
            put(1, ExpeditionaryType.ALPINIST.name());
            put(2, ExpeditionaryType.MEDIC.name());
        }};
        System.out.println("Select Expeditionary type:");
        for (Map.Entry<Integer, String> entry : expeditionaryTypeMenuOptions.entrySet()) {
            System.out.printf("%d - %s\n", entry.getKey(), entry.getValue());
        }

        int selectedOption = consoleLineScanner.nextInt();
        String expeditionaryType = expeditionaryTypeMenuOptions.get(selectedOption);

        System.out.println("Enter expeditionary ID:");
        String expeditionaryID = consoleLineScanner.next();

        System.out.println("Enter expeditionary name:");
        String expeditionaryName = consoleLineScanner.next();

        excursionCenter.createExpeditionary(expeditionaryType, expeditionaryID, expeditionaryName);
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