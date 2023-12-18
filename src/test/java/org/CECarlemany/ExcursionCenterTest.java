package org.CECarlemany;

import org.CECarlemany.Expedition.ExpeditionCatalogue;
import org.CECarlemany.Expeditionary.*;
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
    void should_call_expeditionary_catalogue_when_retrieving_expeditionaries() {
        ExpeditionaryCatalogue expeditionaryCatalogue = mock(ExpeditionaryCatalogue.class);
        ExcursionCenter excursionCenter = new ExcursionCenter(null, expeditionaryCatalogue, null);

        excursionCenter.retrieveExpeditionaries();

        verify(expeditionaryCatalogue).retrieveExpeditionaries();
    }
}