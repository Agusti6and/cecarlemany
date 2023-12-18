package org.CECarlemany.Expedition;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class InMemoryExpeditionCatalogueTest {

    @Test
    void should_retrieve_expeditions_of_an_expeditionary() {
        String firstExpeditionaryId = UUID.randomUUID().toString();
        String secondExpeditionaryId = UUID.randomUUID().toString();
        Expedition firstExpedition = new Expedition(UUID.randomUUID().toString(), "Excursió al Montseny", null, null, List.of(firstExpeditionaryId));
        Expedition secondExpedition = new Expedition(UUID.randomUUID().toString(), "Paseo al Param", null, null, List.of(secondExpeditionaryId));
        ExpeditionCatalogue expeditionCatalogue = new InMemoryExpeditionCatalogue(List.of(firstExpedition, secondExpedition));

        List<Expedition> foundExpeditions = expeditionCatalogue.retrieveExpeditionsFromExpeditionaryID(firstExpeditionaryId);

        assertEquals(List.of(firstExpedition), foundExpeditions);
    }

    @Test
    void should_call_add_method_on_addExpedition() {
        List expeditions = mock(List.class);
        InMemoryExpeditionCatalogue inMemoryExpeditionCatalogue = new InMemoryExpeditionCatalogue(expeditions);
        Expedition expedition = new Expedition(UUID.randomUUID().toString(), "Excursió al Montseny", null, null, List.of(UUID.randomUUID().toString()));

        inMemoryExpeditionCatalogue.addExpedition(expedition);

        verify(expeditions).add(expedition);
    }

    @Test
    void should_retrieve_all_expeditions() {
        List<Expedition> expeditions = List.of(new Expedition(UUID.randomUUID().toString(), "Excursió al Montseny", null, null, List.of(UUID.randomUUID().toString())));
        InMemoryExpeditionCatalogue inMemoryExpeditionCatalogue = new InMemoryExpeditionCatalogue(expeditions);

        List<Expedition> foundExpeditions = inMemoryExpeditionCatalogue.retrieveExpeditions();

        assertEquals(expeditions, foundExpeditions);
    }
}