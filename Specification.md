





### Specification

Needs to be a console based application that lets user type a calculation using words, e.g. "two plus four divided by two".

##### Supported Input Values
* The supported input values are the whole numbers between zero and ten inclusive.
* Input values must be expressed as text, e.g. ‘one’, ‘five’, etc
* Input values are not case-sensitive. Both ‘two and ‘TWO’ are equally valid.

##### Supported Arithmetic Operators
* The supported arithmetic operators and the permitted natural language aliases for
these commands are detailed in the table below.
* Aliases are not case-sensitive. Both ‘add’ and ‘ADD’ are equally valid. 

|Operator       |Permitted Aliases      |
|---------------|-----------------------|
|Add (+)        | add, plus             |
|Subtract (-)   | subtract, minus, less |
|Multiply (*)   | multiplied-by, times  |
|Divide (/)     | divided-by, over      |


##### Operation Chaining 
* Any number of operations may be chained together. 

##### Operator Precedence 

* When two or more operations are chained together, any multiply or divide operation
must take precedence over any add or subtract operation, similar to how a real
calculator works.
* The examples section contains further examples to illustrates operator precedence.
* Note that there is no requirement to support the use of brackets to alter operator
precedence. 