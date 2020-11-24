## Question 1

Create a class that represents an employee. This class will have three constructors to initialize variables. If the 
constructor doesn't provide a parameter for a field, make it either "(not set)" or "0" as appropriate.

Name:
`Employee`

Fields:
- `name : String`
- `idNumber : int`
- `department : String`
- `position : String`

Methods:
+ `Employee()`
+ `Employee(name : String, idNumber : int)`
+ `Employee(name : String, idNumber : int, department : String, position : String)`
+ `getName() : String`
+ `getDepartment() : String`
+ `getPosition() : String`
+ `getIdNumber() : int`

**Files Given**

_EmployeeDemo.java_

## Question 2

Ask the user for three employees. Store the data into three employee objects (use the **Employee** class from the 
previous question). Display those employees in a table. On this question, you'll submit two files: Employee.java and 
some other file that has a main.

## Question 3

Make a class that represents a file. This class will have the ability to calculate the number of lines in that file 
and the ability to search through the file.

The **getNumMatchingWords** method will take a bit of text and determine how many lines **contain** that text. 
Make the comparison not care about case.

Example: if the user is searching for **hello** and a line contains the text **hello hello hello** then this counts as 
one. Use the **contains** method defined on Strings to help with this.

Class Name
`FileStats`

Fields
- `filename : String`

Methods
+ `FileStats(filename : String)`
+ `getNumMatchingWords(key : String) : int`
+ `getNumLines() : int`

**Files Given**

_bill-of-rights.txt, dictionary.txt, romeo-and-juliet.txt, FileStatsDemo.java_

## Question 4

Ask the user for the name of a file and a word. Using the **FileStats** class, show how many lines the file has and 
how many lines contain the text.

**Files Given**

_romeo-and-juliet.txt, dictionary.txt, bill-of-rights.txt_

## Question 5

Make a class that represents an average of test scores. Make the class take an unlimited number of scores and calculate 
the number of tests taken along with the average.

Class name:
`TestScores`

Fields:
- `name : String`
- `totalScore : double`
- `numScores : int`

Methods:
+ `TestScores(name : String)`
+ `addTestScore(earned : double) : void`
+ `getNumTestsTaken() : int`
+ `getAverage() : double`

**Files Given**

_TestScoresDemo.java_

## Question 6

Ask the user for a name and for a list of test scores. Show the number of tests taken and the average. Allow the user 
to enter any number of scores and make the program end when a negative value is entered.
