package com.bezgachev.verbal_calculator;

import java.util.regex.Pattern;

class ExpressionEvaluator {

    static double computeStringEquation(String equation) {
        /*
        After a while of brainstorming, trying out different methods and doing some research I decided to use the below
        approach after seeing this:
        https://codereview.stackexchange.com/questions/84763/evaluating-an-expression-with-integers-and-as-well-as


        Pseudo code:
        1. Remove whitespace
        2. Change - to +- to effectively remove the - operation
        3. Split into two parts by precedence, i.e. * and / first, + last
        4. Calculate * and /
        5. Calculate +
         */

        double result = 0.0;
        // 1. Remove spaces
        equation = equation.replaceAll("\\s+", "");

        // 2. Change - to +-
        equation = equation.replaceAll(Pattern.quote("-"), "+-");

        // 3. Split into chunks by precedence, i.e. chunks that need to be calculated separately
        String[] exp = equation.split("\\+");

        // 4. Calculate the * and /, add them all
        for (String expression : exp) {
            result += calculateMultAndDivision(expression);
        }

        return result;
    }


    private static double calculateMultAndDivision(String expression) {
        // Split by / and *
        // Using 'lookahead' RegEx to keep the delimiters (Regex [/*] removes the * and / signs)
        String[] exp = expression.split("(?=[/*])|(?<=[/*])");

        // Start with the first number
        Double result = Double.parseDouble(exp[0]);

        // Start for loop at 1 (not 0) because we've got the first part already, we need the symbol
        // Increment by 2, not 1, to get to the next part of the expression (if composite e.g. 5 * 4 / 2 * 9)
        for (int i = 1; i < exp.length; i+=2){
            String sign = exp[i];
            Double number = Double.parseDouble(exp[i+1]);
            if (sign.equals("*")){
                result *= number;
            } else if (sign.equals("/")){
                result /= number;
            }
        }
        return result;
    }

}
