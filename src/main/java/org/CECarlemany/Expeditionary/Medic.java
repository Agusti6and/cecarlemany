package org.CECarlemany.Expeditionary;

public class Medic extends Expeditionary {
    public Medic(String expeditionaryID, String expeditionaryName) {
        super(expeditionaryID, expeditionaryName);
        this.expeditionaryType = ExpeditionaryType.MEDIC;
    }
}
