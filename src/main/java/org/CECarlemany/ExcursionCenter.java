package org.CECarlemany;

import org.CECarlemany.Expedition.Expedition;
import org.CECarlemany.Expedition.ExpeditionCatalogue;
import org.CECarlemany.Expedition.InMemoryExpeditionCatalogue;
import org.CECarlemany.Expeditionary.*;
import org.CECarlemany.Mountain.InMemoryMountainCatalogue;
import org.CECarlemany.Mountain.Mountain;
import org.CECarlemany.Mountain.MountainCatalogue;
import org.CECarlemany.Mountain.MountainDifficulty;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ExcursionCenter {
    private final MountainCatalogue mountainCatalogue;
    private final ExpeditionaryCatalogue expeditionaryCatalogue;
    private final ExpeditionCatalogue expeditionCatalogue;

    public ExcursionCenter() {
        this.mountainCatalogue = new InMemoryMountainCatalogue();
        this.expeditionaryCatalogue = new InMemoryExpeditionaryCatalogue();
        this.expeditionCatalogue = new InMemoryExpeditionCatalogue();
    }

    public ExcursionCenter(MountainCatalogue mountainCatalogue, ExpeditionaryCatalogue expeditionaryCatalogue, ExpeditionCatalogue expeditionCatalogue) {
        this.mountainCatalogue = mountainCatalogue;
        this.expeditionaryCatalogue = expeditionaryCatalogue;
        this.expeditionCatalogue = expeditionCatalogue;
    }

    public List<Expedition> retrieveExpeditionsFromExpeditionaryID(String expeditionaryID) {
        return expeditionCatalogue.retrieveExpeditionsFromExpeditionaryID(expeditionaryID);
    }

    public void createExpeditionary(String expeditionaryType, String expeditionaryID, String expeditionaryName) {
        Expeditionary newExpeditionary = null;
        if (expeditionaryType.equals(ExpeditionaryType.ALPINIST.name())) {
            newExpeditionary = new Alpinist(expeditionaryID, expeditionaryName);
        }
        if (expeditionaryType.equals(ExpeditionaryType.MEDIC.name())) {
            newExpeditionary = new Medic(expeditionaryID, expeditionaryName);
        }
        expeditionaryCatalogue.addExpeditionary(newExpeditionary);
    }

    public List<Expeditionary> retrieveExpeditioners() {
        return expeditionaryCatalogue.retrieveExpeditioners();
    }

    public void createMountain(String mountainID, String mountainName, Integer mountainHeight, String mountainDifficulty) {
        MountainDifficulty mountainDifficultyEnum = MountainDifficulty.valueOf(mountainDifficulty);
        Mountain newMountain = new Mountain(mountainID, mountainName, mountainHeight, mountainDifficultyEnum);
        mountainCatalogue.addMountain(newMountain);
    }

    public List<Mountain> retrieveMountains() {
        return mountainCatalogue.retrieveMountains();
    }

    public void createExpedition(String expeditionID, String expeditionName, String expeditionDate, String expeditionMountainID, String expeditionExpeditionaryID) {
        LocalDateTime expeditionDateLocalDateTime = LocalDateTime.parse(expeditionDate);
        Expedition newExpedition = new Expedition(expeditionID, expeditionName, expeditionDateLocalDateTime, expeditionMountainID, List.of(expeditionExpeditionaryID));
        expeditionCatalogue.addExpedition(newExpedition);
    }
}
