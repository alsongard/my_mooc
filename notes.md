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




























