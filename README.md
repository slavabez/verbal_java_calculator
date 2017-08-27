# CLI Verbal calculator in Java 

Note: This is part of an interview process, see the Specification.md file for the specification of this project.

## Summary

The project took me around 5 hours to complete, the longest amount of time was spent brainstorming and researching a suitable solution for evaluating string expressions, such as "5 * 4 / 3 + 4 - 7" without the use of libraries and JavaScript interpreters.

The approach taken for expression evaluation is detailed in the comments of the ExpressionEvaluator class. Essentially the long expression is split into parts by operator precedence (multiplication and division first, addition second). Subtraction was replaced with addition of negative integers.

### Limitations 

* Although technically not a limitation (perhaps even a feature), the program allows for whole numbers more than 10 as input if they are typed in succession (e.g. "seven five times three" will actually give you seventy five times three, 75*3). I did not implement a fix as I've already spent above the suggested time limit of four hours.

* The application does not have unit tests to ensure proper behaviour of each function.

* The application does not detect spelling errors and fails to provide a result.

* Dividing by zero follows standard Java behaviour, equals infinity.

### Finished project structure

The project is divided into three main classes:

* ConsoleInterface.java - class responsible for the 'UI'. Runs in a while loop, prompting for input in the console and outputs useful information.

* ExpressionEvaluator.java - class responsible for evaluating equation strings, such as "5*2/5+5-1". Does not recognise brackets.

* NaturalParser.java - class responsible for 'translating' equations from English words to their numeric and symbolic equivalents, e.g. "seven minus three times four" becomes "7-3*4". Follows the specification. Not case-sensitive.

* CustomParserException - simple class inherited from Exception to throw custom errors. 