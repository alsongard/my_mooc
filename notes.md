to read input we use:
```java
import java.util.Scanner
Scanner scanner =  new Scanner(System.in);
```
we use the java.util.Scanner library to use Scanner module enables reading input 

```
Scanner scanner = new Scanner(System.in);

String userInput = scanner.nextLine()
```

**Concatenation**
To concatenate strings we use the +(plus) sign
```java
System.out.println("Message" + "Qie");
```

**Variables**
example
```java
String name = "Javac";
System.out.println(name);
```

To declare a variable, start with the type of data being assigned to the Variable, e.g String , followed by the variable name.
```java
String name = "Javac";


System.out.println("Hai wo " + name);
```


**Common Data Types**
- Int: 12 // whole number
- Double : 2.353
- String : "Hello"
- Boolean : true or false


after setting the data type for a variable this cannot be changed. This is called Variable Types Persist.
E.g
```java
int number = 10;
// the above cannot be changed to
number = false; // this is wrong and the compilation will fail
```
Excpetions for Data Type Change
E.g 
```java
double number = 10.012;
int value = 9;
number = value;
System.out.println(number); // 9.0
```

**Type Conversion**
1. Converting string to integer
```java
Scanner scanner = new Scanner(System.in);
int value = Integer.valueOf(scanner.nextLine());

```

2. Converting string to Double
```java
Scanner scanner = new Scanner(System.in);
double value = Double.valueOf(scanner.nextLine());
```

3. Converting string to Boolean
When converting a string to Boolean in which boolean values are: true or false , any other string than : True/true (it's not case sensitive) will be ingored. 
```java
Scanner scanner = new Scanner(System.in);
Boolean value = Boolean.valueOf(scanner.nextLine());
```



## Arithmetic Operations

**Key Rules in Java:**
- Multiplication (*), Division (/), and Modulo (%) have equal precedence and are evaluated left to right. 
- Addition (+) and Subtraction (-) have equal precedence and are also evaluated left to right.
- Parentheses () have the highest precedence and should be used to clarify intent.
```java


import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        /*
            Give the first number:
            2
            Give the second number:
            8
            2 * 8 = 16
        */

        System.out.println("Give the first number:");
        int first = scanner.nextInt();

        System.out.println("Give the second number:");
        int second = scanner.nextInt();

        int result = first * second;

        System.out.println(first + " * " + second + " = " +  result);
    }
}

```

**Division**
In division the data type of variables given in the operation will affect the value returned in the operation. 
```java
int first = 3;
int second = 20;

int divisionResult = first / second;
// result in integer

int secondDivisionResut = (double) first / second;
//result in decimal
```

**Typecasting** 
```java
int first = 3;
int second = 20;

int divisionResult = (double) first / second;
// result in decimal 
```


**Comparison Operators**
| Operator | Description | 
| --- | --- |
| >	| greater than |
| >= 	| greater than or equal to |
| < 	| less than |
| <= 	| less than or equal to |
| == 	| equal to |
| != 	| not equal to |


The result of a condition is aa booelan vlaue and from the below  the boolean value from the comparison is stored in a boolean varialble.


```java
int first = 1;
int second = 3;
boolean isGreater = first > second;

```

**Module Operator**
The module operator returns the  remainder of a value. Take for example if we have:
```java
Scanner scanner = new Scanner(System.in);

int userInput = scanner.nextLine();
bool evaluate = userInput % 400 == 0 
System.out.println("Evaluation value: " + evaluate);
```



When comparing strings we use the equals-command, which is related to string variables.
```java
String userInput = scanner.nextLine();
if (userInput.equals("toSomeString")){
    System.out.println("Do these");
} else {
    System.out.println("Do these");
}
```


## Continue and break 
The ``break`` statement is used to exit a loop. 
The ``continue`` statement takes the execution of the program .



Example: 
```java
import java.util.Scanner

public class NumberOfNegatives() {

    public class static void main(string[] args) {
        // declare scanner variable
        Scanner scanner = new Scanner(System.in);

        // count number of negative values
        int negativeCount = 0;
        int userInput = 0;
        while (true) {
            // get userInput
            System.out.println("Give a number:");
            userInput = Integer.valueOf(scanner.nextLine());

            // check if zero exit
            if (userInput == 0) {
                break;
            }
            // check if number is negative
            if (userInput < 0) {
                negativeCount = negativeCount + 1;
            }
        }
        System.out.println("Number of negative numbers: " + negativeCount);
    }
}
```

## For loop
The for loop structure:
```
for (*introducing a variable*; *condition*; *increasing the counter*) {
    // Functionality to be executed
}
```


```java
for (int i = 0; i < userInput; i++) {  /// i++ is executed after the for block code is executed
    System.out.println("I is " + i);
}
```


## OOP Programming
When you are writing a program, whether it's an exercise or a personal project, figure out the types of parts the program needs to function and proceed by implementing them one part at a time. Make sure to test the program right after implementing each part.

Never try solving the whole problem at once, because that makes running and testing the program in the middle of the problem-solving process difficult. Start with something easy that you know you can do. When one part works, you can move on to the next.


## Functions / Methods
structure of function name;
```
public static void main() {
    // functional block
}
```
- public : visibility modifier for the function
- static :
- void : return type for the function
- main : name of the function

```java
public static void main() {
    // functional block
    greet();
}

public static void greet(){ 
    System.out.println("Hello World");
}
```

**Parameters**
Methods/Functions can take variables/arguments which can then be used withinn the functionm
```java
public static void Greeting(int userGreeting) {
    for (int i = 0; i < userGreeting; i++ )
    {
        // do sth
    }
}
```

**Passing multiple arguments to a function:**
```java
public static void sum (int firstNumber, int secondNumber) {
    int result = firstNumber + secondNumber;
    System.out.println(result);
}

sum(2, 5);
```

One can also pass an expression to a function arguments. The expression is evaluated prior to the method call
```java
public static void sum (int firstNumber, int secondNumber) {
    int result = firstNumber + secondNumber;
    System.out.println(result);
}
sum(2+2, 5);
```

method parameters are distinct from the variables (or parameters) of other methods, even if they had the same name. As a variable is passed to a method during a method call, the value of that variable gets copied to be used as the value of the parameter variable declared in the method definition. Variables in two separate methods are independent of one another.


**return values for a function**
A method can have a return value. To add a return value one must specify the type of the value in the definition of the method.
```java
public static int sum(int a , int b){
    int sumOfParameters = a + b;
    return sumOfParameters;
}
```



# Part 3

## Discovering errors
- always go through your code.
- set comments.
- add debugging statements to check execution of your code.
- when naming methods, set names that provide a description of their functionality.


## Lists

**Objectives**
- You are familiar with the list structure and know how to use a list in a program.
- You are familiar with the concept of an index, you can add values to a list, and you know how to retrieve information from a list's indices.
- You know how to iterate over a list with multiple different loop types.
- You know how to check if a value exists in a list, and also know how to remove values from a list.
- You are aware of the list being a reference-type variable, and become familiar with using lists as method parameters.


ArrayList : this is a premade tool in java that is used in creating List. it also provides various methods for array operations such as adding , removin and selecting items from a list.


Syntax:
```java
ArrayList<String> listName = new ArrayList<>();
```
the variable must be of type: ``ArrayList`` which is then followed by the type of the values stored in the list.   
To declare the new array we use: ``new ArrayList<>();``
When setting the type for the values in the ArrayList they must be capitalized.  
E.g
```java
ArrayList<String>
ArrayList<Integer>
ArrayList<Double>
ArrayList<Boolean>
```

Why?
There are 2 types of variables:
- primitive variables
In primitive varialbles hold the actual value  

- reference  variables
Reference variables know a reference point which knows where the actual values are stored. 

The reason for this has to do with how the ArrayList is implemented. Variables in Java can be divided into two categories: value type (primitive) and reference type (reference type) variables. Value-type variables such as int or double hold their actual values. Reference-type variables such as ArrayList, in contrast, contain a reference to the location that contains the value(s) relating to that variable.

Value-type variables can hold a very limited amount of information, whereas references can store a near limitless amount of it.


```java
import java.util.ArrayList;

class ArrayIntroduction {
    public static void main(String[] args) {
        // create new arraay varialble
        ArrayList<String> planets = new ArrayList<>();


        planets.add("Jupiter");
        plaents.add("Mars");
        planets.add("Earth");

        System.out.println(planets);

    }
}
```

To call a list method we: syntax: nameOfListVariable followed by dot and the list method. ``listVar.method()``

List Methods:
- add
add some value to the list

- get
retrieve using indexing


```java

System.out.println(planets.get(0));

```

**for each loop**
When you are not required to keep track of the index for the values in a list you can use the ``for each`` loop.
Syntax:
```
for (TypeOfVariable nameOfVariable: nameOfList)
```
where TypeOfVariable is the list's element type, and nameOfVariable is the variable that is used to store each value in the list as we go through it.

```java
ArrayList<Integer> numbers = new ArrayList()<>;


numbers.add(1)
numbers.add(2)
numbers.add(3)
numbers.add(4)
numbers.add(5)

for (int value : numbers) {
    System.out.println("number" + value);
}
```


**Remove Method**
The list remove() method is used to remove a value from an array using either the index or the value itself. 
however the method differs depending on the type of the array

- Integer array
To remove a value from an integer array we use: 
* index
```java
numberList.remove(0); // remove at index 0
```


* Value
To use the value we : 
convert the int to Integer
```java
numberList.remove(Integer.valueOf(15)); // in this case the numberList has a value of 15
```


- String array
in a stringg array you could either give the value or the index
```java
planetsArray.remove(0);

planetsArray.remove("Earth");
```


**contain method**
The list contain method is used to check if a value exist. It returns a boolean value : true if value exist and false if not
```
myList.contain("someVaue");
```


**List as an argument/parameter value to a method**
A list can be passed as an argument to a method in the following. 
- Define the type to be of list type
- Define the type of the values
- Define the name of the argument:

Example:
```java
public static void printItemsInList(ArrayList<String> userList) {
    for(String item: userList) {
        System.out.println(item);
    }
}
```


At anytime you provide a list as a parameter value to a method, any operation/modification performed on the list does affect the original value. 
As list is reference type variable(it knows the reference point to the values in the list). 

*When a list (or any reference-type variable) is copied for a method's use, the method receives the value of the list variable, i.e., a reference. In such a case the method receives a reference to the real value of a reference-type variable, and the method is able to modify the value of the original reference type variable, such as a list. In practice, the list that the method receives as a parameter is the same list that is used in the program that calls the method.*





## Arrays