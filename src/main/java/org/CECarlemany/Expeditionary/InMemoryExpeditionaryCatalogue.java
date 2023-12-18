package org.CECarlemany.Expeditionary;

import org.CECarlemany.Expeditionary.Expeditionary;
import org.CECarlemany.Expeditionary.ExpeditionaryCatalogue;

import java.util.List;

public class InMemoryExpeditionaryCatalogue implements ExpeditionaryCatalogue {
    private final List<Expeditionary> expeditionaries;

    public InMemoryExpeditionaryCatalogue(List<Expeditionary> expeditionaries) {
        this.expeditionaries = expeditionaries;
    }
}
