package org.CECarlemany.Expedition;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Expedition {
    protected final String expeditionID;
    protected final String expeditionName;
    protected final LocalDateTime expeditionDate;
    protected final String mountainID;
    protected final List<String> expeditioners;

    public Expedition(String expeditionID, String expeditionName, LocalDateTime expeditionDate, String mountainID, List<String> expeditioners) {
        this.expeditionID = expeditionID;
        this.expeditionName = expeditionName;
        this.expeditionDate = expeditionDate;
        this.mountainID = mountainID;
        this.expeditioners = expeditioners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expedition that = (Expedition) o;
        return Objects.equals(expeditionID, that.expeditionID);
    }

    public void addExpeditionary(String expeditionary) {
        expeditioners.add(expeditionary);
    }
}
