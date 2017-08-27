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

            /*try {
                int parsed = NaturalParser.parseVerbalNumberOperator(input);
                isParsed = true;
                System.out.println("You typed '" + input + "', which is " + parsed  + " as integer.");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }*/

            /*if (!isParsed){
                System.out.println(ANSI_RED + "Error parsing the number word string, please try again." + ANSI_RESET);
            }*/

            System.out.println("");



        }
    }
}
