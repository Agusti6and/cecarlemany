package org.CECarlemany.Mountain;

import java.util.List;

public interface MountainCatalogue {
    void addMountain(Mountain expectedMountain);

    List<Mountain> retrieveMountains();
}
