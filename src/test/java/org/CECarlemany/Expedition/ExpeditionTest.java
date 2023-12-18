package org.CECarlemany.Expedition;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExpeditionTest {

    @Test
    void should_add_expeditionary() {
        List<String> expeditioners = new ArrayList<>();
        Expedition expedition = new Expedition(UUID.randomUUID().toString(), "Expedition", null, null, expeditioners);
        String expeditionaryToAddID = UUID.randomUUID().toString();

        expedition.addExpeditionary(expeditionaryToAddID);

        assertThat(expeditioners).contains(expeditionaryToAddID);
    }
}