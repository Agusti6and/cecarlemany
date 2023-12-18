package org.CECarlemany;

import java.util.List;

public class InMemoryExpeditionCatalogue implements ExpeditionCatalogue {
    private final List<Expedition> expeditions;

    public InMemoryExpeditionCatalogue(List<Expedition> expeditions) {
        this.expeditions = expeditions;
    }
}
