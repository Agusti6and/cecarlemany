package org.CECarlemany.Expedition;

import org.CECarlemany.ConsolePrinter;
import org.CECarlemany.Expedition.Expedition;

public class ExpeditionConsolePrinter implements ConsolePrinter {

    private final Expedition expedition;

    public ExpeditionConsolePrinter(Expedition expedition) {
        this.expedition = expedition;
    }

    @Override
    public void print() {
        System.out.println("Expedition ID: " + expedition.expeditionID);
        System.out.println("Expedition name: " + expedition.expeditionName);
        System.out.println("Expedition date: " + expedition.expeditionDate);
        System.out.println("Mountain ID: " + expedition.mountainID);
        for (String expeditionaryID : expedition.expeditionaryID) {
            System.out.println("    Expeditionary ID: " + expeditionaryID);
        }
    }

}
