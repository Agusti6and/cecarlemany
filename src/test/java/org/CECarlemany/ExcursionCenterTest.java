package org.CECarlemany;

import org.CECarlemany.Expedition.ExpeditionCatalogue;
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
}