package org.CECarlemany;

import java.time.LocalDateTime;
import java.util.List;

public class Expedition {
    private final String expeditionID;
    private final String expeditionName;
    private final LocalDateTime expeditionDate;
    private final String mountainID;
    private final List<String> expeditionaryID;

    public Expedition(String expeditionID, String expeditionName, LocalDateTime expeditionDate, String mountainID, List<String> expeditionaryID) {
        this.expeditionID = expeditionID;
        this.expeditionName = expeditionName;
        this.expeditionDate = expeditionDate;
        this.mountainID = mountainID;
        this.expeditionaryID = expeditionaryID;
    }
}
