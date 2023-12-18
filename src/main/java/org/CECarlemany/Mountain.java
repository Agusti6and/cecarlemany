package org.CECarlemany;

public class Mountain {
    private final String mountainID;
    private final String mountainName;
    private final Integer mountainHeight;
    private final MountainDifficulty mountainDifficulty;

    public Mountain(String mountainID, String mountainName, Integer mountainHeight, MountainDifficulty mountainDifficulty) {
        this.mountainID = mountainID;
        this.mountainName = mountainName;
        this.mountainHeight = mountainHeight;
        this.mountainDifficulty = mountainDifficulty;
    }
}
