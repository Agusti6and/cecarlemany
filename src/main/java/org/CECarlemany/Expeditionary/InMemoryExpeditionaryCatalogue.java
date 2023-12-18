package org.CECarlemany.Expeditionary;

import org.CECarlemany.Expeditionary.Expeditionary;
import org.CECarlemany.Expeditionary.ExpeditionaryCatalogue;

import java.util.ArrayList;
import java.util.List;

public class InMemoryExpeditionaryCatalogue implements ExpeditionaryCatalogue {
    private final List<Expeditionary> expeditioners;

    public InMemoryExpeditionaryCatalogue() {
        this.expeditioners = new ArrayList<Expeditionary>();
    }

    public InMemoryExpeditionaryCatalogue(List<Expeditionary> expeditioners) {
        this.expeditioners = expeditioners;
    }

    @Override
    public void addExpeditionary(Expeditionary expectedExpeditionary) {
        expeditioners.add(expectedExpeditionary);
    }

    @Override
    public List<Expeditionary> retrieveExpeditioners() {
        return expeditioners;
    }
}
