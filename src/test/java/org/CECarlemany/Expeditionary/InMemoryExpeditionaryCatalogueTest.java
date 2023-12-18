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
        List expeditionaries = mock(List.class);
        InMemoryExpeditionaryCatalogue inMemoryExpeditionaryCatalogue = new InMemoryExpeditionaryCatalogue(expeditionaries);
        Expeditionary expeditionary = new Alpinist(UUID.randomUUID().toString(), "Joan");

        inMemoryExpeditionaryCatalogue.addExpeditionary(expeditionary);

        verify(expeditionaries).add(expeditionary);
    }

    @Test
    void retrieveExpeditionaries() {
        List<Expeditionary> expeditionaries = List.of(new Alpinist(UUID.randomUUID().toString(), "Joan"));
        InMemoryExpeditionaryCatalogue inMemoryExpeditionaryCatalogue = new InMemoryExpeditionaryCatalogue(expeditionaries);

        List<Expeditionary> foundExpeditionaries = inMemoryExpeditionaryCatalogue.retrieveExpeditionaries();

        assertEquals(expeditionaries, foundExpeditionaries);
    }
}