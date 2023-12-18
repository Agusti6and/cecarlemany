package org.CECarlemany.Expeditionary;

import org.CECarlemany.ConsolePrinter;
import org.CECarlemany.Expeditionary.Expeditionary;

public class ExpeditionaryConsolePrinter implements ConsolePrinter {

    private final Expeditionary expeditionary;

    public ExpeditionaryConsolePrinter(Expeditionary expeditionary) {
        this.expeditionary = expeditionary;
    }

    @Override
    public void print() {
        System.out.println("Expeditionary type: " + expeditionary.expeditionaryType);
        System.out.println("Expeditionary ID: " + expeditionary.expeditionaryID);
        System.out.println("Expeditionary name: " + expeditionary.expeditionaryName);
        System.out.println("Expeditionary signed up date: " + expeditionary.signedUpDate);
    }
}
