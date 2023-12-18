package org.CECarlemany;

import org.CECarlemany.Expedition.ExpeditionCatalogue;
import org.CECarlemany.Expeditionary.*;
import org.CECarlemany.Mountain.Mountain;
import org.CECarlemany.Mountain.MountainCatalogue;
import org.CECarlemany.Mountain.MountainDifficulty;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ExcursionCenterTest {

    @Test
    void should_call_expedition_catalogue_when_retrieving_expeditions_of_an_expeditionary() {
        ExpeditionCatalogue expeditionCatalogue = mock(ExpeditionCatalogue.class);
        ExcursionCenter excursionCenter = new ExcursionCenter(null, null, expeditionCatalogue);
        String expeditionaryId = UUID.randomUUID().toString();

        excursionCenter.retrieveExpeditionsFromExpeditionaryID(expeditionaryId);

        verify(expeditionCatalogue).retrieveExpeditionsFromExpeditionaryID(expeditionaryId);
    }

    @Test
    void should_call_expeditionary_catalogue_when_creating_alpinist() {
        ExpeditionaryCatalogue expeditionaryCatalogue = mock(ExpeditionaryCatalogue.class);
        ExcursionCenter excursionCenter = new ExcursionCenter(null, expeditionaryCatalogue, null);
        String expeditionaryType = ExpeditionaryType.ALPINIST.name();
        String expeditionaryId = UUID.randomUUID().toString();
        String expeditionaryName = "Joan";

        excursionCenter.createExpeditionary(expeditionaryType, expeditionaryId, expeditionaryName);

        Expeditionary expectedExpeditionary = new Alpinist(expeditionaryId, expeditionaryName);
        verify(expeditionaryCatalogue).addExpeditionary(expectedExpeditionary);
    }

    @Test
    void should_call_expeditionary_catalogue_when_creating_medic() {
        ExpeditionaryCatalogue expeditionaryCatalogue = mock(ExpeditionaryCatalogue.class);
        ExcursionCenter excursionCenter = new ExcursionCenter(null, expeditionaryCatalogue, null);
        String expeditionaryType = ExpeditionaryType.MEDIC.name();
        String expeditionaryId = UUID.randomUUID().toString();
        String expeditionaryName = "Joan";

        excursionCenter.createExpeditionary(expeditionaryType, expeditionaryId, expeditionaryName);

        Expeditionary expectedExpeditionary = new Medic(expeditionaryId, expeditionaryName);
        verify(expeditionaryCatalogue).addExpeditionary(expectedExpeditionary);
    }

    @Test
    void should_call_expeditionary_catalogue_when_retrieving_expeditioners() {
        ExpeditionaryCatalogue expeditionaryCatalogue = mock(ExpeditionaryCatalogue.class);
        ExcursionCenter excursionCenter = new ExcursionCenter(null, expeditionaryCatalogue, null);

        excursionCenter.retrieveExpeditioners();

        verify(expeditionaryCatalogue).retrieveExpeditioners();
    }

    @Test
    void should_call_mountain_catalogue_when_creating_mountain() {
        MountainCatalogue mountainCatalogue = mock(MountainCatalogue.class);
        ExcursionCenter excursionCenter = new ExcursionCenter(mountainCatalogue, null, null);
        String mountainID = UUID.randomUUID().toString();
        String mountainName = "Montseny";
        Integer mountainHeight = 1700;
        String mountainDifficulty = MountainDifficulty.MEDIUM.name();

        excursionCenter.createMountain(mountainID, mountainName, mountainHeight, mountainDifficulty);

        Mountain expectedMountain = new Mountain(mountainID, mountainName, mountainHeight, MountainDifficulty.MEDIUM);
        verify(mountainCatalogue).addMountain(expectedMountain);
    }

    @Test
    void should_call_mountain_catalogue_when_retrieving_mountains() {
        MountainCatalogue mountainCatalogue = mock(MountainCatalogue.class);
        ExcursionCenter excursionCenter = new ExcursionCenter(mountainCatalogue, null, null);

        excursionCenter.retrieveMountains();

        verify(mountainCatalogue).retrieveMountains();
    }
}