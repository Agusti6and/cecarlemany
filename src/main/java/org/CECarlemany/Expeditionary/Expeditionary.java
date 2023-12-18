package org.CECarlemany.Expeditionary;

import java.time.LocalDateTime;

public class Expeditionary {
    protected final String expeditionaryID;
    protected final String expeditionaryName;
    protected final LocalDateTime signedUpDate;

    public Expeditionary(String expeditionaryID, String expeditionaryName) {
        this.expeditionaryID = expeditionaryID;
        this.expeditionaryName = expeditionaryName;
        this.signedUpDate = LocalDateTime.now();
    }
}
