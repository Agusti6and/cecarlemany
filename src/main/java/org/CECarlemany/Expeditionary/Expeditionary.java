package org.CECarlemany.Expeditionary;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Expeditionary {
    protected final String expeditionaryID;
    protected final String expeditionaryName;
    protected final LocalDateTime signedUpDate;

    protected ExpeditionaryType expeditionaryType;

    public Expeditionary(String expeditionaryID, String expeditionaryName) {
        this.expeditionaryID = expeditionaryID;
        this.expeditionaryName = expeditionaryName;
        this.signedUpDate = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expeditionary that = (Expeditionary) o;
        return Objects.equals(expeditionaryID, that.expeditionaryID);
    }
}
