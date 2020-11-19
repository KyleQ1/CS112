## Question 1

Create a class with the following definition

`public class MyLinkedList<E extends Comparable<E>> extends AbstractList<E>`

You will be implementing your own linked list. Feel free to use the code we developed in class as a starting point.

You may not use any of Java's built it collections. You must create this list from scratch using the style from lecture.

Study the TestBench class to determine which methods you need to implement.

**Files Given**

_Demo1.java, TestBench.java_

## Question 2

Implement a shuffle method that randomly sorts the data.

`public void shuffle(long seed)`

This method will take a seed value for use with the Random class. A seed value makes it so the same sequence of "random" numbers is generated every time.

To implement this method, create an instance of the Random class using the seed: `Random rng = new Random(seed);`

Then, visit each element. Generate the next random number within the bounds of the list, and then swap the current element with the element that's at the randomly generated index.

**Files Given**

_Demo2.java, TestBench.java_

## Question 3

Implement a sort method

`public void sort()`

Implement any sort algorithm. Do not use any of Java's built-in sorting algorithms.

**Files Given**

_Demo3.java, TestBench.java_

## Question 4

Implement a reverse method

`public void reverse()`

This method will take a list and flip around all the elements such that the list is in reverse. Do not use any of Java's built-in algorithms.

**Files Given**

_Demo4.java, TestBench.java_

## Question 5 

Implement a method that removes the minimum value.

`public E removeMinimum()`

This method will return the element was removed from the list.

**Files Given**

_Demo5.java, TestBench.java_

## Question 6

Implement a method that removes all duplicates. Keep the first instance of the element but remove all subsequent duplicate elements.

`public void removeDuplicates()`

**Files Given**

_Demo6.java, TestBench.java_