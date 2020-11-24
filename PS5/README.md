## Question 1

Ask the user for a balance. From the **accounts.dat** file, display all the accounts that have a balance of at least 
what the user entered.

**accounts.dat** is a binary file. Each entry contains a credit card number (long), a balance (double), and a cash 
back flag (boolean).

**Files Given**

_accounts.dat_

## Question 2

Display all the names of a given length from **names.dat.** This file is in binary. Each entry is in the format: 
name length (integer) and name (string).

There are no **String** reading methods for binary files. You'll have to figure out how to use the length value and 
**readChar** method to read all the names.

**Files Given**

_names.dat_

## Question 3

Create a **Person** class that will make the **Demo** work as expected.

**Files Given**

_Demo.java_

## Question 4

Ask the user for an account balance. Show, in descending order, all the accounts that have a balance greater than what 
the user input.

Each entry is **int, string, long, double, boolean** (name length, name, credit card number, balance, cashback).

**Files Given**

_accounts-with-names.dat_

## Question 5

Add a method called **save** to your **Person** class. This method will write the object out to a binary file. 
Use the **Serializeable** format. Name the file accountNumber.dat where **accountNumber** is the credit card number 
from the object.

**Files Given**

_Demo.java_

