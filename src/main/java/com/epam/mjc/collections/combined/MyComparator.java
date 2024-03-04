package com.epam.mjc.collections.combined;

import java.util.Comparator;

public class MyComparator implements Comparator <String> {
    @Override
    public int compare (String a, String b)
    {return Integer.compare(b.length(), a.length());}

}
