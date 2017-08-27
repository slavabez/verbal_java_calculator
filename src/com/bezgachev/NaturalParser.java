package com.bezgachev;

import java.util.HashMap;

/**
 * Parser from natural language (english) to a numeric expression
 */
class NaturalParser {

    // The 'dictionary'
    private static final HashMap<String, String> NUMBER_MAP;

    static {
        HashMap<String, String> tempMap = new HashMap<>();
        tempMap.put("zero", "0");
        tempMap.put("one", "1");
        tempMap.put("two", "2");
        tempMap.put("three", "3");
        tempMap.put("four", "4");
        tempMap.put("five", "5");
        tempMap.put("six", "6");
        tempMap.put("seven", "7");
        tempMap.put("eight", "8");
        tempMap.put("nine", "9");
        tempMap.put("add", "+");
        tempMap.put("plus", "+");
        tempMap.put("subtract", "-");
        tempMap.put("minus", "-");
        tempMap.put("less", "-");
        tempMap.put("multiplied-by", "*");
        tempMap.put("times", "*");
        tempMap.put("divided-by", "/");
        tempMap.put("over", "/");

        NUMBER_MAP = tempMap;
    }

    static String parseVerbalNumberOperator(String inputString) throws CustomParserException {

        // Format the input, to lower case, remove spaces
        inputString = inputString.toLowerCase();
        // Use simple RegEx to remove whitespaces
        inputString = inputString.replaceAll("\\s+", "");

        if (!NUMBER_MAP.containsKey(inputString)) {
            throw new CustomParserException("Invalid or unknown string, can't parse to an integer");
        }

        return NUMBER_MAP.get(inputString);
    }

    static String parseMultiWordSentence(String inputString) throws CustomParserException {
        // Split by spaces, lookup using the above function, build a string
        String[] parts = inputString.split(" ");


        return "";
    }


}


