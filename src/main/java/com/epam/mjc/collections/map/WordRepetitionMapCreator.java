package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordMap = new HashMap<>();
        String[] words = sentence.split("[, !?.]");
        for (String word : words) {
            word = word.toLowerCase();
            if (word.isBlank() || word.isEmpty()) {
                continue;
            }
            if (wordMap.containsKey(word)) {
                wordMap.replace(word, wordMap.get(word) + 1);
            }
            else {
                wordMap.put(word, 1);
            }
        }

        return wordMap;
    }
}
