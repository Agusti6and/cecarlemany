package org.CECarlemany.Mountain;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class InMemoryMountainCatalogueTest {

    @Test
    void should_call_add_method_on_addMountain() {
        List mountains = mock(List.class);
        InMemoryMountainCatalogue inMemoryMountainCatalogue = new InMemoryMountainCatalogue(mountains);
        Mountain mountain = new Mountain(UUID.randomUUID().toString(), "Montseny", 1700, MountainDifficulty.MEDIUM);

        inMemoryMountainCatalogue.addMountain(mountain);

        verify(mountains).add(mountain);
    }

    @Test
    void should_retrieve_all_mountains_on_retrieveMountains() {
        List<Mountain> mountains = List.of(new Mountain(UUID.randomUUID().toString(), "Montseny", 1700, MountainDifficulty.MEDIUM));
        InMemoryMountainCatalogue inMemoryMountainCatalogue = new InMemoryMountainCatalogue(mountains);

        List<Mountain> foundMountains = inMemoryMountainCatalogue.retrieveMountains();

        assertEquals(mountains, foundMountains);
    }

    @Test
    void should_retrieve_mountain_on_retrieveMountainByID() {
        String mountainIDToLookFor = UUID.randomUUID().toString();
        Mountain firstMountain = new Mountain(UUID.randomUUID().toString(), "Montseny", 1700, MountainDifficulty.MEDIUM);
        Mountain secondMountain = new Mountain(mountainIDToLookFor, "Montseny", 1700, MountainDifficulty.MEDIUM);
        List<Mountain> mountains = List.of(firstMountain, secondMountain);
        InMemoryMountainCatalogue inMemoryMountainCatalogue = new InMemoryMountainCatalogue(mountains);

        Mountain foundMountain = inMemoryMountainCatalogue.retrieveMountainByID(mountainIDToLookFor);

        assertEquals(secondMountain, foundMountain);
    }
}