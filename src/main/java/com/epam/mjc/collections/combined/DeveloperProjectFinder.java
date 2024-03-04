package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developerProject = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String key = entry.getKey();
            Set<String> value = entry.getValue();

            if (value.contains(developer)) {
                developerProject.add(key);
                MyComparator myComparator = new MyComparator();
                Collections.sort(developerProject, myComparator);
            }
        }

        return developerProject;
    }
}

