package org.CECarlemany.Expedition;

import java.time.LocalDateTime;
import java.util.List;

public class Expedition {
    protected final String expeditionID;
    protected final String expeditionName;
    protected final LocalDateTime expeditionDate;
    protected final String mountainID;
    protected final List<String> expeditionaryID;

    public Expedition(String expeditionID, String expeditionName, LocalDateTime expeditionDate, String mountainID, List<String> expeditionaryID) {
        this.expeditionID = expeditionID;
        this.expeditionName = expeditionName;
        this.expeditionDate = expeditionDate;
        this.mountainID = mountainID;
        this.expeditionaryID = expeditionaryID;
    }
}
