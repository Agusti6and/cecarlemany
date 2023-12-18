package org.CECarlemany.Mountain;

import java.util.Objects;

public class Mountain {
    protected final String mountainID;
    protected final String mountainName;
    protected final Integer mountainHeight;
    protected final MountainDifficulty mountainDifficulty;

    public Mountain(String mountainID, String mountainName, Integer mountainHeight, MountainDifficulty mountainDifficulty) {
        this.mountainID = mountainID;
        this.mountainName = mountainName;
        this.mountainHeight = mountainHeight;
        this.mountainDifficulty = mountainDifficulty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mountain mountain = (Mountain) o;
        return Objects.equals(mountainID, mountain.mountainID);
    }
}
