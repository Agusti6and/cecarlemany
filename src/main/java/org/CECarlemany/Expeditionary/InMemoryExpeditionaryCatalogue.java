package org.CECarlemany.Expeditionary;

import org.CECarlemany.Expeditionary.Expeditionary;
import org.CECarlemany.Expeditionary.ExpeditionaryCatalogue;

import java.util.ArrayList;
import java.util.List;

public class InMemoryExpeditionaryCatalogue implements ExpeditionaryCatalogue {
    private final List<Expeditionary> expeditionaries;

    public InMemoryExpeditionaryCatalogue() {
        this.expeditionaries = new ArrayList<Expeditionary>();
    }

    public InMemoryExpeditionaryCatalogue(List<Expeditionary> expeditionaries) {
        this.expeditionaries = expeditionaries;
    }

    @Override
    public void addExpeditionary(Expeditionary expectedExpeditionary) {
        expeditionaries.add(expectedExpeditionary);
    }
}
