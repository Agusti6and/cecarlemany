package org.CECarlemany.Mountain;

import org.CECarlemany.ConsolePrinter;
import org.CECarlemany.Mountain.Mountain;

public class MountainConsolePrinter implements ConsolePrinter {

    private final Mountain mountain;

    public MountainConsolePrinter(Mountain mountain) {
        this.mountain = mountain;
    }

    @Override
    public void print() {
        System.out.println("Mountain ID: " + mountain.mountainID);
        System.out.println("Mountain name: " + mountain.mountainName);
        System.out.println("Mountain height: " + mountain.mountainHeight);
        System.out.println("Mountain difficulty: " + mountain.mountainDifficulty);
    }
}
