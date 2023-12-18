package org.CECarlemany;

import org.CECarlemany.Expedition.Expedition;
import org.CECarlemany.Expedition.ExpeditionCatalogue;
import org.CECarlemany.Expeditionary.ExpeditionaryCatalogue;
import org.CECarlemany.Mountain.MountainCatalogue;

import java.util.ArrayList;
import java.util.List;

public class ExcursionCenter {
    private final MountainCatalogue mountainCatalogue;
    private final ExpeditionaryCatalogue expeditionaryCatalogue;
    private final ExpeditionCatalogue expeditionCatalogue;

    public ExcursionCenter(MountainCatalogue mountainCatalogue, ExpeditionaryCatalogue expeditionaryCatalogue, ExpeditionCatalogue expeditionCatalogue) {
        this.mountainCatalogue = mountainCatalogue;
        this.expeditionaryCatalogue = expeditionaryCatalogue;
        this.expeditionCatalogue = expeditionCatalogue;
    }

    public List<Expedition> retrieveExpeditionsFromExpeditionaryID(String expeditionaryID) {
        return new ArrayList<>();
    }
}
