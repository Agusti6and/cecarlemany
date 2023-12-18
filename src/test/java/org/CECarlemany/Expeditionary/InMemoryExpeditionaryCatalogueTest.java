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
    void retrieveExpeditioners() {
        List<Expeditionary> expeditioners = List.of(new Alpinist(UUID.randomUUID().toString(), "Joan"));
        InMemoryExpeditionaryCatalogue inMemoryExpeditionaryCatalogue = new InMemoryExpeditionaryCatalogue(expeditioners);

        List<Expeditionary> foundExpeditioners = inMemoryExpeditionaryCatalogue.retrieveExpeditioners();

        assertEquals(expeditioners, foundExpeditioners);
    }
}