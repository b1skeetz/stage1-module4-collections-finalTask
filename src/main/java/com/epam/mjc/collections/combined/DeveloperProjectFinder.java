package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Set<String>> e : projects.entrySet()){
            if(e.getValue().contains(developer)){
                result.add(e.getKey());
            }
        }
        result.sort((o1, o2) -> {
            if(o1.length() == o2.length()){
                return o2.compareTo(o1);
            }
            return o2.length() - o1.length();
        });
        return result;
    }
}