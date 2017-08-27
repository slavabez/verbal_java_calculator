package com.bezgachev;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ConsoleInterface app = new ConsoleInterface();
        System.out.println("Welcome to the Java Console text-based calculator.");

        // app.run();

        // eg four times five subtract six over one plus nine

        String test = "one plus three divided by five";

        try {
            String yo = NaturalParser.parseMultiWordSentence(test);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

}

