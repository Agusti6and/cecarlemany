package org.CECarlemany.Expedition;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryExpeditionCatalogueTest {

    @Test
    void retrieveExpeditionsFromExpeditionaryID() {
        String firstExpeditionaryId = UUID.randomUUID().toString();
        String secondExpeditionaryId = UUID.randomUUID().toString();
        Expedition firstExpedition = new Expedition(UUID.randomUUID().toString(), "Excursió al Montseny", null, null, List.of(firstExpeditionaryId));
        Expedition secondExpedition = new Expedition(UUID.randomUUID().toString(), "Paseo al Param", null, null, List.of(secondExpeditionaryId));
        ExpeditionCatalogue expeditionCatalogue = new InMemoryExpeditionCatalogue(List.of(firstExpedition, secondExpedition));

        List<Expedition> foundExpeditions = expeditionCatalogue.retrieveExpeditionsFromExpeditionaryID(firstExpeditionaryId);

        assertEquals(List.of(firstExpedition), foundExpeditions);
    }
}