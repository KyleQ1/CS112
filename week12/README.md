## Question 1

Create a class called **QueueUtils**. In it, create a method

`public static Queue<String> build(String line)`

Make it so this method returns a queue that contains all the tokens from the string.

The strings you're parsing contain prefix expressions, which will be evaluated in the next question.

You may use Java's built-in stacks and queues for this entire assignment. You do not need to make your own.

**Files Given**

_Demo1.java_

## Question 2

Add a method to **QueueUtils**

`public static int eval(Queue<String> s)`

Make this method evaluate all the prefix expression in the queue.

A prefix expression is where the operator comes first. For example, 5 + 7 would be 12.

**Files Given**

_Demo2.java_

## Question 3

Ask the user for prefix expressions and evaluate each expression. If the result of an expression is zero, then end.

## Question 4

Create a class called **StackUtils**. In it, create a method

`public static Stack<Character> buildStack(File f)`

Make this method find all the curly brackets in the file and place them in the stack.

**Files Given**

_Demo4.java, test.txt_

## Question 5

Add a method to **StackUtils**

`public static int reduce(File f)`

Make this method return 0 if the curly brackets are balanced. If the curly brackets aren't balanced, return any other integer.

**Files Given**

_Demo5.java, test.txt_