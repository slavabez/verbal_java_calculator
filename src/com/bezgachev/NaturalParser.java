package com.bezgachev;

import java.util.HashMap;

/**
 * Parser from natural language (english) to a numeric expression
 */
class NaturalParser {

    private static final HashMap<String, Integer> NUMBER_MAP;

    static {
        HashMap<String, Integer> tempMap = new HashMap<>();
        tempMap.put("zero",         0);
        tempMap.put("one",          1);
        tempMap.put("two",          2);
        tempMap.put("three",        3);
        tempMap.put("four",         4);
        tempMap.put("five",         5);
        tempMap.put("six",          6);
        tempMap.put("seven",        7);
        tempMap.put("eight",        8);
        tempMap.put("nine",         9);

        NUMBER_MAP = tempMap;
    }

    static int parseVerbalNumber(String inputString) throws InvalidNumberWordStringException {

        // Format the input, to lower case, remove spaces
        inputString = inputString.toLowerCase();
        // Use simple RegEx to remove whitespaces
        inputString = inputString.replaceAll("\\s+", "");

        if (!NUMBER_MAP.containsKey(inputString)){
            throw new InvalidNumberWordStringException("Invalid or unknown string, can't parse to an integer");
        }

        return NUMBER_MAP.get(inputString);
    }

}


