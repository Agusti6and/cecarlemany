package org.CECarlemany;

import java.util.List;

public class InMemoryExpeditionaryCatalogue implements ExpeditionaryCatalogue {
    private final List<Expeditionary> expeditionaries;

    public InMemoryExpeditionaryCatalogue(List<Expeditionary> expeditionaries) {
        this.expeditionaries = expeditionaries;
    }
}
