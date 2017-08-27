package com.bezgachev;

import java.util.Objects;
import java.util.Scanner;

class ConsoleInterface {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";

    // Terminate condition
    private boolean terminate;
    private Scanner in;

    ConsoleInterface() {
        terminate = false;
        in = new Scanner(System.in);
    }

    void run(){
        while (!terminate){
            System.out.println("---------------------");
            System.out.println("Please type a mathematical equation, e.g. eight times five divided-by three, or type exit to quit.");
            // Input, process
            String input = in.nextLine();

            // Check terminate condition
            if (Objects.equals(input, "exit")){
                terminate = true;
                break;
            }

            boolean isParsed = false;

            try {
                String parsedEquation = NaturalParser.parseMultiWordSentence(input);
                isParsed = true;
                System.out.println("Parsed equation is: " + parsedEquation);
                Double result = ExpressionEvaluator.computeStringEquation(parsedEquation);
                System.out.println("Answer: " + result);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

            if (!isParsed){
                System.out.println(ANSI_RED + "Error parsing the number word string, please try again." + ANSI_RESET);
            }

            // Print empty line for readability
            System.out.println("");

        }
    }
}
