package com.bezgachev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome! Type a string...");
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        System.out.println("You typed: \"" + input + "\"");
    }
}