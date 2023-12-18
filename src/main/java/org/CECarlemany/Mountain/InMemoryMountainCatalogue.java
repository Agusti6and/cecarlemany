package org.CECarlemany.Mountain;

import java.util.ArrayList;
import java.util.List;

public class InMemoryMountainCatalogue implements MountainCatalogue {
    private final List<Mountain> mountains;

    public InMemoryMountainCatalogue() {
        this.mountains = new ArrayList<Mountain>();
    }

    public InMemoryMountainCatalogue(List<Mountain> mountains) {
        this.mountains = mountains;
    }
}
