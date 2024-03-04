package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
Set <String> lessons = new LinkedHashSet<>();
for(Map.Entry <String, List <String>> entry : timetable.entrySet()) {
    String key = entry.getKey();
    List<String> value = entry.getValue();
    for (String elem: value)
    {lessons.add(elem);}
}

        return lessons;
    }
}

