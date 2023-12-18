package org.CECarlemany.Expeditionary;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class InMemoryExpeditionaryCatalogueTest {

    @Test
    void should_call_add_method_on_addExpeditionary() {
        List expeditioners = mock(List.class);
        InMemoryExpeditionaryCatalogue inMemoryExpeditionaryCatalogue = new InMemoryExpeditionaryCatalogue(expeditioners);
        Expeditionary expeditionary = new Alpinist(UUID.randomUUID().toString(), "Joan");

        inMemoryExpeditionaryCatalogue.addExpeditionary(expeditionary);

        verify(expeditioners).add(expeditionary);
    }

    @Test
    void should_retrieve_all_expeditioners() {
        List<Expeditionary> expeditioners = List.of(new Alpinist(UUID.randomUUID().toString(), "Joan"));
        InMemoryExpeditionaryCatalogue inMemoryExpeditionaryCatalogue = new InMemoryExpeditionaryCatalogue(expeditioners);

        List<Expeditionary> foundExpeditioners = inMemoryExpeditionaryCatalogue.retrieveExpeditioners();

        assertEquals(expeditioners, foundExpeditioners);
    }

    @Test
    void should_retrieve_expeditionary_by_id() {
        String expeditionaryIdToLookFor = UUID.randomUUID().toString();
        Expeditionary firstExpeditionary = new Alpinist(UUID.randomUUID().toString(), "Joan");
        Expeditionary secondExpeditionary = new Alpinist(expeditionaryIdToLookFor, "Joan");
        List<Expeditionary> expeditioners = List.of(firstExpeditionary, secondExpeditionary);
        InMemoryExpeditionaryCatalogue inMemoryExpeditionaryCatalogue = new InMemoryExpeditionaryCatalogue(expeditioners);

        Expeditionary foundExpeditionary = inMemoryExpeditionaryCatalogue.retrieveExpeditionaryByID(expeditionaryIdToLookFor);

        assertEquals(secondExpeditionary, foundExpeditionary);
    }
}