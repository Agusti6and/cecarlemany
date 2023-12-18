package org.CECarlemany.Expeditionary;

import java.util.List;

public interface ExpeditionaryCatalogue {
    void addExpeditionary(Expeditionary expectedExpeditionary);

    List<Expeditionary> retrieveExpeditioners();

    Expeditionary retrieveExpeditionaryByID(String expeditionaryID);

    boolean existsExpeditionary(String expeditionaryID);
}
