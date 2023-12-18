package org.CECarlemany.Expedition;

import org.CECarlemany.Expedition.Expedition;
import org.CECarlemany.Expedition.ExpeditionCatalogue;

import java.util.ArrayList;
import java.util.List;

public class InMemoryExpeditionCatalogue implements ExpeditionCatalogue {
    private final List<Expedition> expeditions;

    public InMemoryExpeditionCatalogue() {
        this.expeditions = new ArrayList<Expedition>();
    }

    public InMemoryExpeditionCatalogue(List<Expedition> expeditions) {
        this.expeditions = expeditions;
    }

    @Override
    public List<Expedition> retrieveExpeditionsFromExpeditionaryID(String expeditionaryId) {
        return expeditions.stream().filter(expedition -> expedition.expeditionaryID.contains(expeditionaryId)).toList();
    }

    @Override
    public void addExpedition(Expedition newExpedition) {
        expeditions.add(newExpedition);
    }

    @Override
    public List<Expedition> retrieveExpeditions() {
        return expeditions;
    }
}
