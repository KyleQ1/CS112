## Question 1

Create a class called **FileSumWrapper** with a method that has the signature

`public static void handle(String filename, int lowerBound)`

Make this method call **FileSum.read** and make your method catch all the errors. 

**FileSum.read** is a method that takes a filename and a lower bound, then sums up all the numbers in that file 
that are equal to or above the given lower bound.

**Files Given**

_FileSum.java, Question1,java, err.txt, t1.txt_

## Question 2

Ask the user for a bunch of integers. Show the sum of those numbers. 

Make your program handle strange input. Specifically, if they didn't enter a number, scan the String to find just the 
digits and piece those digits together to form a number.

If the user enters something without any digits, end the program.

## Question 3

Create a class called **Cipher**. Make the constructor accept some text and a key. Encrypt the given text using the key.

Use the following cipher: 

* Take the key and mod it by 26. Example: a key of 30 becomes 4.
* If the character is a letter, shift it by the key, but 'wrap around' the alphabet if necessary.
* If the character is not a letter, then shift it by the key but do not wrap.

Check the test cases for example.

Make **getters** to support the **CipherDemo**. Also, make two custom Exceptions called **UselessKeyException** and 
**EmptyPlainText**. In your constructor, throw **UselessKeyException** if the key is divisible by 26 and throw 
**EmplyPainText** if the plain text is zero characters.

**Files Given**

_CipherDemo.java_

## Question 4

Ask the user for a filename. In binary format, read all the integers in that file. Show the number of integers you 
read in, along with the maximum and minimum integer found.

**Files Given**

_n.dat_

## Question 5

Write a program that reads from a list of credit cards and determines if those cards are valid. Each file provided 
encodes the credit card numbers are longs. In binary, read each long and process the card.

To determine if a credit card is valid, use the following algorithm.

* From the rightmost digit, which is the check digit, and moving left, double the value of every second digit. The 
check digit is not doubled; the first digit doubled is immediately to the left of the check digit. If the result of 
this doubling operation is greater than 9 (e.g., 8 * 2 = 16), then add the digits of the result 
(e.g., 16: 1 + 6 = 7, 18: 1 + 8 = 9) or, alternatively, the same final result can be found by subtracting 9 from that 
result (e.g., 16: 16 - 9 = 7, 18: 18 - 9 = 9).
* Take the sum of all the digits. **(Display this to the user)**
* If the total modulo 10 is equal to 0 (if the total ends in zero) then the number is valid.

**Files Given**

_credit-cards.dat_
