package org.CECarlemany.Expedition;

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
        return expeditions.stream().filter(expedition -> expedition.expeditioners.contains(expeditionaryId)).toList();
    }

    @Override
    public void addExpedition(Expedition newExpedition) {
        expeditions.add(newExpedition);
    }

    @Override
    public List<Expedition> retrieveExpeditions() {
        return expeditions;
    }

    @Override
    public Expedition retrieveExpeditionByID(String expeditionID) {
        return expeditions.stream().filter(expedition -> expedition.expeditionID.equals(expeditionID)).findFirst().orElse(null);
    }
}
