package org.CECarlemany.Expeditionary;

public class Alpinist extends Expeditionary {
    public Alpinist(String expeditionaryID, String expeditionaryName) {
        super(expeditionaryID, expeditionaryName);
        this.expeditionaryType = ExpeditionaryType.ALPINIST;
    }
}
