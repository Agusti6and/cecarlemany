package org.CECarlemany;

import java.time.LocalDateTime;

public class Expeditionary {
    private final String expeditionaryID;
    private final String expeditionaryName;
    private final LocalDateTime signedUpDate;

    public Expeditionary(String expeditionaryID, String expeditionaryName) {
        this.expeditionaryID = expeditionaryID;
        this.expeditionaryName = expeditionaryName;
        this.signedUpDate = LocalDateTime.now();
    }
}
