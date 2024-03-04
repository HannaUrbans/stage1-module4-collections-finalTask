package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {



        Map<Integer, Set<String>> finalMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> sourceEntry : sourceMap.entrySet()) {
            String sourceEntryKey = sourceEntry.getKey();
            Integer sourceEntryValue = sourceEntryKey.length();
//извлекает из карты finalMap значение, связанное с ключом sourceValue - если оно есть.
// Если значение существует, оно будет сохранено в переменной set.
// Если значение не существует, то будет создан новый экземпляр класса LinkedHashSet и сохранен в переменной set.
            Set<String> set = finalMap.getOrDefault(sourceEntryValue,new HashSet<>());
            set.add(sourceEntryKey);
            finalMap.put(sourceEntryValue, set);
        }

        return finalMap;
    }
}


//Input
//
//one - 1
//two - 2
//three - 3
//five - 4
//ten - 10
//Output
//
//3 - one, two, ten
//4 - five
//5 - three

