package org.laboratoare.laborator4;

import java.util.Comparator;

public class Sort implements Comparator<Resident> {
    public int compare(Resident a, Resident b)
    {
        return a.getName().compareTo(b.getName());
    }

}
