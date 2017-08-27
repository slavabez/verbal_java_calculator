package com.bezgachev;

import java.util.Objects;
import java.util.Scanner;

class ConsoleInterface {
    // Terminate condition
    private boolean terminate;
    private Scanner in;

    ConsoleInterface() {
        terminate = false;
        in = new Scanner(System.in);
    }

    void run(){
        while (!terminate){
            // Input, process
            String input = in.nextLine();
            if (Objects.equals(input, "exit")){
                terminate = true;
                break;
            }

            boolean isParsed = false;

            try {
                int parsed = NaturalParser.parseVerbalNumber(input);
                isParsed = true;
                System.out.println("You typed '" + input + "', which is " + parsed  + " as integer.");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

            if (!isParsed){
                System.out.println("Error parsing the number word string, please try again.");
            }

            // Check terminate condition

        }
    }
}
