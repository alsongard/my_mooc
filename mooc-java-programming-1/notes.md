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
in a string array you could either give the value or the index
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
arrays are known as the ancestors of ArrayList: ``ArrayList<Integer> myList = new ArrayList<>();``  

To use an array use the following syntax:
```java
int[] myNewArray = new int[5]
```

The above myNewArray has 5 values which can be accessed using indexing as follows:  
```java
myNewArray[0];
```

To add values into the array: 
* Using the index to assign a value


```java
myNewArray[0] = 20;
myNewArray[3] = 2;
```

One can also use a loop to iterate values within the array:  

```java
int i = 0;
while (i < myNewArray.length) {
    System.out.println(myNewArray[i]);
    i++;
}
```


You can create an array stating the type of the elements of the array followed by square brackets (typeofelements[]).
``String[] myPlanets = new String[5];`` 

Array is an object, so when you change the array inside the method, the changes persist after the execution of the method.


**Initializing an array with a block**
When you initialize an array with a block, the length of the array is precisely the number of the values specified in the block. The values of the block are assigned to the array in the order, eg. the first value is assigned to index 0, the second value to index 1 etc.
```java
String[] planets = {"Earth", "Uranus", "Saturn"};

int a = 0; 
while (a < planets.length) {
    System.out.println("Planet" + planets[a]);
    a++;
}
```



## Using strings
Learning Objectives
- Revising reading, printing and comparing Strings
- Knowing how to split a string into several pieces


**Reading Input**  
```java
import java.util.Scanner;

class StringIntroduction {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String userInput = scanner.nextLine();
    }
}
```

**Outputing Strings**
```java
System.out.println("User is set to study");
```

**Equals() method for string comparisons**

```java
String myString = "hello world";
if (myString.equals("hello")){
    System.out.println("Not equals to string: hello");
} else if (myString.contains("hello")) {
    System.out.println("text contains string: hello");
} else {
    System.out.println("Did not found any string match!!");
}
```
When comparing strings, you should make sure the string variable has some value assigned to it. If it doesn't have a value, the program will produce a NullPointerException error

You can split a string to multiple pieces with the split-method of the String class. The method takes as a parameter a string denoting the place around which the string should be split. The split method returns an array of the resulting sub-parts. In the example below, the string has been split around a space.


**Getting characters using charAt() method**
get a character at a specified index of a string with the charAt method.

```java
String myText = "hello world";
myText.charAt(myText.charAt(0));
```

**Length() string method**

Returns the length of the string
```java
String myText = "hello world";
myText.length();
```


# Part 4

## Introduction to object-oriented programming


**Learning Objectives**  
- You're familiar with the concepts of class, object, constructor, object methods, and object variables.
- You understand that a class defines an object's methods and that the values of instance (object) variables are object-specific.
- You know how to create classes and objects, and know how to use objects in your programs.



**Introduction**
To define a class we use the following syntax:
```
modifier class nameOfClass {
    // define the class/instance variables
    // define the class methods
}
```

The modifier can either be:
- public
- private
- protected

Followed by the ``class keyword`` and lastly open & closed curly braces ``{}``

```java
public class Person {
    private String name; //  declare name property/variable for the class
    private int age; // declare age property/variable for the class
}
```


Defining a Constructor

We want to set an initial state for an object that's created. Custom objects are created the same way as objects from pre-made Java classes, such as ArrayList, using the new keyword. It'd be convenient to pass values ​​to the variables of that object as it's being created. For example, when creating a new person object, it's useful to be able to provide it with a name:
```java
public static void main(String[] args) {
    Person ada = new Person("Ada");
    // ...
}
```

This is achieved by defining the method that creates the object, i.e., its constructor. The constructor is defined after the instance variables. In the following example, a constructor is defined for the Person class, which can be used to create a new Person object. The constructor sets the age of the object being created to 0, and the string passed to the constructor as a parameter as its name:
```java
public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
}
```
The constructor's name is always the same as the class name. The class in the example above is named Person, so the constructor will also have to be named Person. The constructor is also provided, as a parameter, the name of the person object to be created. The parameter is enclosed in parentheses and follows the constructor's name. The parentheses that contain optional parameters are followed by curly brackets. In between these brackets is the source code that the program executes when the constructor is called (e.g., new Person ("Ada")).

Objects are always created using a constructor.

A few things to note: the constructor contains the expression this.age = 0. This expression sets the instance variable age of the newly created object (i.e., "this" object's age) to 0. The second expression this.name = initialName likewise assigns the string passed as a parameter to the instance variable name of the object created.



**Default Constructor**  
If the programmer does not define a constructor for a class, Java automatically creates a default one for it. A default constructor is a constructor that doesn't do anything apart from creating the object. The object's variables remain uninitialized (generally, the value of any object references will be null, meaning that they do not point to anything, and the values of primitives will be 0)

For example, an object can be created from the class below by making the call new Person()
```java
public class Person {
    private String name;
    private int age;
}
```



If a constructor has been defined for a class, no default constructor exists. For the class below, calling ``new Person() // with no arguments`` would cause an error, as Java cannot find a constructor in the class that has no parameters.
```java
public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
}
```


**Class Methods**  
A method is written inside of the class beneath the constructor. The method name is preceded by public void, since the method is intended to be visible to the outside world (public), and it does not return a value (void).
```java
public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}
```

**Objects and the Static Modifier**  
We've used the modifier static in some of the methods that we've written. The static modifier indicates that the method in question does not belong to an object and thus cannot be used to access any variables that belong to objects.

Going forward, our methods will not include the static keyword if they're used to process information about objects created from a given class. If a method receives as parameters all the variables whose values ​​it uses, it can have a static modifier.


To access a class variables within  a  method we use the keyword: ``this``

e.g
```java
public void PrintPerson() {
    System.out.println("Name: " + this.name + "\n" + "Age: " + this.age);
}
```

**Class Method with return values**
```java 
public int returnAge()  {
    return this.age;
}

Person james = new Person("James");
System.out.println("The age  of james " + james.returnedAge());
```



**A string representation of an object and the toString-method**  
The string representation of an object can be defined by a method which returns a "string representation" of the object. The method returning the string representation is always set to: ``toString``.

example: 
```java
public String toString() {
    return "Name of person " + this.name + " and age is " + this.age;  
}

Person person = new Person("James" , 123)
System.out.println(person);
```

The call to the toString method returning the string representation does not have to be written explicitly, as Java adds it automatically. When a programmer writes:
```java
System.out.println(antti);

// Java extends the call at run time to the following form:

System.out.println(antti.toString());
```



## Handling Objects in a List
In previous sections you have learned how to add items/values to a list. E.g a String variable is also an object. We can use a list to store objects as shown:
```java
class Person {
    private String name; 
    private int age;

    public Person(String userName) {
        this.name = userName;
        this.age = 0;
    }

    public String toString() {
        return "Username:  "  + this.userName + "\n" + "Age: " + this.age;
    }
}
```


```java
import java.util.ArrayList;

class MainProgram  {
    public void main(String args[]){
        ArrayList<Person> persons = new ArrayList<>();
        Person john = new Person("John");
        persons.add(john);

        Person matt = new Person("Matt");
        persons.add(matt);

        for (Person personItem : persons) {
            System.out.println(personItem); 
        }

    }
}
```


## Files and Reading Data

**Learning Objectives**  
- You'll review reading keyboard input.
- You know what a file and a filesystem are, and are able to add an empty text file into the filesystem.
- You know how to create a write a program that reads data from a file.




To read a file in java we pass the file path using the ``Path.get()`` to the Scanner constructor. After which it reads the file line by line, therefore we use a ``while() `` loop  until it reaches the end of the line.   
By default the file is read from the root directory of the project folder that contains src directory and other files such as pox.ml file.  
When using Scanner to read the file we  use the try {} catch {} block in which if we have no errors the try block is executed fully and if an error occurs the catch block is executed.

Example:
```

import java.nio.file.Paths;
import java.util.Scanner; 

class ReadFileExample() {
    public void main(String[] args){
        try (Scanner scanner = new Scanner(Paths.get("files.txt"))) {
            while (scanner.hasNextLine()) {
                String  row = scanner.nextLine(); // reads the current line
                System.out.println(row);
            }   
        } catch(Exception e) {
            System.out.println("Error" + e.getMessage())
        }
    }
}
```

- hasNextLine() : check whether the file has a new line
- nextLine() : reads the current line and then moves to the end of the given line . 

Code | Description | 
| --- | --- |
| hasNextLine() → true	| Pointer still at start of file.
| nextLine() → "Hello"	| Reads first line, pointer moves to after "Hello" (before "World").
| hasNextLine() → true	| Checks again – there is "World".
| nextLine() → "World"	| Reads second line, pointer moves to end of file.
| hasNextLine() → false	| No more lines.


Sometimes when you read a file a line within it maybe empty, for further processing or incases you may not want to work with this empty line you can do the following:   
```java
while (true) {
    String row = fileRead.er.nextLine();
    if (row.isEmpty()) { /// 
        break;
    } else {
        // do sth with the data
    }
}

```
# Part 5

## Learning object-oriented programming

**Constructor Overloading**

The technique of having two (or more) constructors in a class is known as constructor overloading. A class can have multiple constructors that must differ in the number and/or type of their parameters. It's not, however, possible to have two constructors with the exact same parameters.


Example:
```java
class Person {
    private String weight;
    private int age;
    private String name;

    public Person(String userName) {
        this.name = userName;
        this.age = 0;
        this.weight = 0;
    }


    public Person(String userName, String userAge) {
        this.name = userName;
        this.age = userAge;
        this.weight = 0;
    }
}
```
From the above we have 2 constructors when creating objects you could either one argument or 2 arguments. 


However in the above we have repitition. To avoid this we could call the second constructor using ``this`` keyword as shown below:
```java
public Person(String userName) {
    this(userName, 0)
}
```
the above calls the second constructor while passing the userName variable to the second constructor together with the value 0 which is used as the userAge.




**method overloading**
In method overloading we could have same methods but with different parameters/arguments.(ensure this)

```java
Class Person {
    private int age;
    private String name;


    public Person(String userName, int userAge) {
        this.age = userAge;
        this.name = userName;
    }

    public growOlder() {
        this.growOlder(1);
    }

    public growOlder(int age) {
        this.age += age;
    }

    public growYearOlder() {
        this.age += 1;
    }
} 
```


## Primitive & Reference Variables


**Objectives**  
- You understand the terms primitive and reference variable.
- You know the types of primitive variables in Java, and also that there can be practically an infinite number of different reference variables.
- You know the differences in behavior between primitive and reference variables when values are assigned to them, or when they're used as method parameters.



Primitive variables: store their values directly
Reference variables: have a pointer which points to an object which contains the values

**Type of Primite variables:**  
- Boolean: true of false
- short int  : -32768 to 32767
- float : a floating point number that uses 32 bits.
- int : 32 bit value that represents a medium sized integer: 2^-31 to 2 ^31 - 1
- long int : 64 bit value that represents a larger integer: 2 ^ 63 to 2 ^ 63 -1
- Bytes: 1 byte = 8 bits  between values -128 to 127
- char : 16 bits representing a single character
- double: flaoting point number that uses 64 bits


Whenever we pass a variable to  a methods which requires an argument, what actually happens is that the value of the variable is given to the method parameter, any modification occur on the copied value and not the original value. 

Other than the mentioned above primitive variables, the rest are reference variables. A programmer can create his/her own variables using Objects(Reference variable)

When it comes to Objects/Reference variables when you pass the value as a method arguments, the method receives a pointer to an object. So any changes to the fields/data of the object are reflected to the original/passed argument. 

**Example on Reference variables**
```java
public class Person {
    private String name;
    private int birthYear;

    public Person(String name) {
        this.name = name;
        this.birthYear = 1970;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String toString() {
        return this.name + " (" + this.birthYear + ")";
    }
}
```
We'll inspect the execution of the program step by step.

```java
public class Example {
    public static void main(String[] args) {
        Person first = new Person("First");

        System.out.println(first);
        youthen(first);
        System.out.println(first);

        Person second = first;
        youthen(second);

        System.out.println(first);
    }

    public static void youthen(Person person) {
        person.setBirthYear(person.getBirthYear() + 1);
    }
}

Sample output

First (1970)
First (1971)
First (1972)
```



## Objects and references


**Learning Objectives**
- You will brush up on using classes and objects.
- You know what a null reference is, and what causes the NullPointerException error.
- You can use an object as an object variable and a method parameter.
- You can create a method that returns an object.
- You can create the method equals, which can be used to check if two objects of the same - have the same contents or state.


Calling a constructor with the command ``new`` causes several things to happen. First, space is reserved in the computer memory for storing object variables. Then default or initial values are set to object variables (e.g. an int type variable receives an initial value of 0). Lastly, the source code in the constructor is executed.
A constructor call returns a reference to an object. A reference is information about the location of object data.



**null value of a reference variable**  
null means nothing and in this case, it's possible to assign the kewyord null to any refernce value. When an object reference is not being used it is cleaned by the garbage collector in java.
```java
Person ball = joan;
ball = null;

ball.growOlder(); // this will result in an NullException error
```

**Object equality and lists**

![object_equality_list](object_&_list_equals.png)


in the above image we have : 
1. Bird method with no custom equals method
In this scenario changing the reference value with ``red = new Bird("red");`` creates a new reference address which when compared in the last part with ``if (birds.contain(red)) {}`` red points to a new reference address compared to the previous one added to birds 
2. Bird method with custom equals method that checks : 
    - this ==  compared
    -  compared instanceof ClassName
    -  this.property == / equals() comparedItem.property whereby comparedItem is typecast of the compared object

in this since we are comparing all of the above the last part: ``if (birds.contain(red) {})`` this condition will return true as both the name property of the 2 instances are the same.


**Object as a method's return value**  
A method can also return an object of any type. 
In this case we will be using the ``clone()`` method which returns the current instance/object and assigns it to a new variable as a new Object. The state of the values at which the clone method is called for the clone object will be the same.

*In this example we present a simple counter that has the method clone. The method can be used to create a clone of the counter; i.e. a new counter object that has the same value at the time of its creation as the counter that is being cloned.*

```java
public class Counter{
    private int counter;

    // constructor
    public Counter() {
        this(0); // we call this()) with the argument 0 to call the constructor which takes a single argument : this(0,0) : this takes 2 arguements meaning total of 3 constructors
    }

    public Counter(0) {
        this.counter  = 0;
    }

    public void increase()  {
        this.counter++;
    }

    public void decrease() {
        this.counter--;
    }

    public Counter clone() {
        Counter newCloned = new Counter(this.value);
        return newCloned;
    }
}

```

**Final**
The word final used in the definition of object variables. The values of these object variables cannot be modified after they have been set in the constructor. 



# Part 6
The sixth part of the course material handles objects consisting of objects, and we'll take a look at separating the text user interface and the program logic.


```java
class PlayList()  {
    private ArrayList<String> songs;


    pulic PlayList() {
        this.songs = new ArrayList<>(); // create songs variable of type ArrayList
    }

    public void adddSong(String songName) {
        this.song.add(songName);
    }

    public void removeSong(String songName) {
        if (this.song.contains(songName)) {
            this.song.remove(sonName);
        } esle {
            System.out.println("No song");
        }
    }

    public String toString() {
        for (String songItem : this.song) {
            System.out.println("Song name" + songItem); // this can be better using a class Song
        }
    }
}
```


## Separating the user interface from program logic

**Programming tips**  
In the larger example above, we were following the advice given here.
    Proceed with small steps
        Try to separate the program into several sub-problems and work on only one sub-problem at a time
        Always test that the program code is advancing in the right direction, in other words: test that the solution to the sub-problem is correct
        Recognize the conditions that require the program to work differently. In the example above, we needed a different functionality to test whether a word had been already entered before.
    Write as "clean" code as possible
        Indent your code
        Use descriptive method and variable names
        Don't make your methods too long, not even the main method
        Do only one thing inside one method
        Remove all copy-paste code
        Replace the "bad" and unclean parts of your code with clean code



# Introduction To Testing

**Learning Objectives**
    Can tell about some issues caused by software bugs.
    You know what a stack trace is, the steps taken in troubleshooting, and can give textual test inputs to a Scanner.
    You know what unit testing is all about and you can write unit tests.
    You know about test-driven software development.

## Identifying Errors
**Stack Trace****
When an error occurs in a program, the program typically prints something called a stack trace, i.e., the list of method calls that resulted in the error. For example, a stack trace might look like this:
Sample output
```
  Exception in thread "main" ...
      at Program.main(Program.java:15)
```

The type of error is stated at the beginning of the list, and the following line tells us where the error occurred. The line "at Program.main(Program.java:15)" says that the error occurred at line number 15 in the Program.java file.

Sample output
```
  at Program.main(Program.java:15)
```



### Checklist for Troubleshooting
If your code doesn't work and you don't know where the error is, these steps will help you get started.
    - Indent your code properly and find out if there are any missing parentheses.
    - Verify that the variables used are correctly named.
    - Test the program flow with different inputs and find out the sort of input that causes the program to not work as desired. - If you received an error in the tests, the tests may also indicate the input used.
    - Add print commands to the program in which you print out the values of the variables used at various stages of the program's execution.
    - Verify that all variables you are using are initialized. If they aren't, a NullPointerException error will occur.
    - If your program causes an exception, you should definitely pay attention to the stack trace associated with the exception, which is the list of method calls that resulted in the situation that caused the exception.
    - Learn how to use the debugger. The earlier video will get you started.


### Passing Test Input to Scanner
One can pass strings to a Scanner object , in which this strings are the input that the user might enter. This procedure is one way of automating testing. 

Example:
```java
import java.util.ArrayList;

String input = "one\n" + "two\n" + "three\n" + "four\n" + "five\n" + "one\n" + "six\n";

Scanner scanner = new Scanner(input);
ArrayList stringArray = new ArrayList<>();

while (true) {
    System.out.println("Enter string");
    String userInput = scanner.nextLine();

    if (stringArray.contains(userInput)) {
        break;
    }
    stringArray.add(userInput);
}
```


The input variable simulates how user input will be given to the Scanner object. After performing automatic testing on this, later you could change the input to System.in to get input from the system for manual testing. 




# Part 7 


## Different types of programming paradigm


- Functional programming
- Object Oriented Programming



## Algorithms
Algorithms, precise instructions on how to to accomplish a specific task, are at the core of computer science. In the context of programming, algorithms are typically defined using source code.

The concept of efficiency is often associated with algorithms. A programs efficiency, i.e, the computation of required information fast enough, is an integral part of a programs usability. If it took two days for an algorithm designed for forecasting tomorrows weather run, the results wouldn't be very useful! Similarly, a user viewing a TVs program guide won't get any use out of it, if the tv-shows info only loads after the show already ended.

In a more general sense, retrieving and displaying information quickly is an integral part of any applications function. Next let's explore algorithms associated with retrieving and sorting information. While the following examples utilize arrays, the algorithms shown will also work with other data-structures meant for storing information, such as lists.


### Static or not
Methods in Java can be divided into two groups, based on whether they have the static modifier or not. Methods without the static modifier are instance methods. Methods with the static modifier are class methods

Instance methods are methods that are associated with an object, can process the objects variables and can call the object's other methods. Instance methods specifically CAN use the this modifier, which refers to the variables associated with the specific object, that is calling the instance method. Class methods can't use the this modifier, meaning that they can only access the variables they are given as parameters or that they create themselves.

In reality class methods can also access class variable, among other things. However, these things are outside the scope of this course.



**Built in sorting algorithms**


1. Array
In arrays which have a predefined length and no remove or add methods :
```java
import java.util.Arrays;

int[] numbers = {8, 3, 7, 9, 1, 2, 4};
Arrays.sort(numbers)
```


2. List and ArrayList
ArrayList is an extension of List class and both support add and remove methods

```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(8);
numbers.add(3);
numbers.add(7);
System.out.println(numbers);
Collections.sort(numbers);
System.out.println(numbers);
```



Java's built-in sorting algorithms work with value type variables and some of Java's built-in reference type variables, like String. In order for our own classes to be sorted, we need to provide Java with some tips on how to do that, because the classes themselves don't contain information on how objects created from them should be ordered. We'll get back to ordering objects created from classes we made ourselves in the advanced course in programming.


**Linear Search**
In linear search, when we have an array and some value we need to search in the given array, using linear search will involve iteration over each value in the array, comparing it with the searched value and if found it is returned if not found it returns -1. 
So in the case, we have 10 million values this and multiple comparison we need to check each of the values. This can be less efficient.


**Binary Search**  
using Binary search, the array has to be sorted, after which we split the array into a half, and then check if the searched value is; 

- smaller than middle value: we search the left of the middle value. (in the right we also split the array by using the middle value, check if the value is smaller and reapply the same concept)
- greater than middle value: we search the right of the middle value. (in the left we also split the array by using the middle value, check if the value is smaller and reapply the same concept)



index
| 0 | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 
value
| -22 | -9  | -3  | 0  | 1  | 5  | 7  | 9  | 11  | 16  | 22  | 31  | 44  | 45  | 62  | 71 |


Search value 44:

**Idea of binary search**  
● Data is searched in an ordered array or list.
● Search begins in the middle. 
● The the value of the examined middle point is not the value that is searched 
for, we exclude half of the previous search are and move to examine the 
middle point of the remaining area.
● If the examined middle value is the value that is searched for, we return the 
index of that middle point.
● If the search area does not exist anymore (every index has been excluded 
from the list of possinilities), the value of -1 is returned. It indicates that the 
value in question cannot be found.


```
Question let's say our book array is:
```pseudocode
books= [Book(0, "Art of War"), Book(1, "The Bible"), Book(2, "Devil May Cry), Book(3, "Shingeki no Kyojin"), Book(4, "Avengers")]

number of books input is 5
searchId = 4
1rst iteration: 
begin = 0 end = books.size() - 1;   
middle  = (begin + end )/2 == 0 + 4 = 4 /2  = 2
if (books.get(2).getId() == searchId ) false
else if(book.get(2).getId() < searchId) true ; begin = middle + 1;
else if (searchId < book.get(2).getId()) false

2nd iteration:
begin = 2 + 1 = 3; end = 4;
middle  = (begin + end )/2 == 3 + 4 =  7/2  = 3
if (books.get(3).getId() == searchId ) false
else if(book.get(3).getId() < searchId) true ; begin = middle + 1;
else if (searchId < book.get(2).getId()) false

while begin < end
begin = 3 + 1 = 4
end = 4  
4 < 4 false
```

# Part08
## HashMaps
A hashmap is a data structure that uses key value pair to store data.

Syntax:
```java
HashMap<Integer, String> myFruits = new HashMap<>();
myFruits.put("Apple", 3);
myFruits.put("Melon", 3);
myFruits.put("Orange", 3);
``` 


If an existing key already exist on a HashMap(), the new value is assigned to that key.  
```java
myFruits.put("Orange", 3);
myFruits.put("Orange", 3);
```

**Using reference type variable as a value  for hashmap:**
```java
import java.util.HashMap;

Class Book {
    private String bookTitle;
    private int publishYear;

    // default constructor
    public Book(String bookName, int year) {
        this.bookTitle = bookName;
        this.puslishYear = year;   
    }

    public void getBookTitle() {
        return this.bookTitle;
    }
}

Book prideAndPrejuduice = new Book("Pride and Prejuduice", 2020);;

HashMap<String, Book> library = new HashMap<>();
library.put(prideAndPrejuduice.getBookTitle(), prideAndPrejuduice);
```

**Accessing keys of a hashmap**  
We can use the ``keySet()`` method provided HashMap class that returns a set of the keys.

```java
for (String key: hashMap.keySet()) {
    System.out.println(key);
}
```

A hashmap always expect that only reference type variables are added to it.
e.g 
```java
HashMap<String, Integer> myHash = new HashMap<>();
```

Java converts primitive variables to reference-types automatically as they are added to either a HashMap or an ArrayList. This automatic conversion to a reference-type variable is termed auto-boxing in Java, i.e. putting something in a box automatically. The automatic conversion is also possible in the other direction.

```java
int key = 2;
HashMap<Integer, Integer> hashmap = new HashMap<>();
hashmap.put(key, 10);
int value = hashmap.get(key);
System.out.println(value);
```

The getOrDefault method of the HashMap searches for the key passed to it as a parameter from the HashMap. If the key is not found, it returns the value of the second parameter passed to it. The one-liner shown above is equivalent in its function to the following.
```java
public class IOU {
    private HashMap<String, Double> iou;
    

    // constructor
    public IOU() {
        this.iou = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.iou.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.iou.getOrDefault(toWhom, 0.0);
    }
}
```


- equals() method
Why we override it when comparing objects(classes) in ArrayList
To avoid 



- hashCode() method
Why we override it when comparing values in HashMap



**Adding multiple values to the value part of HashMap**  
achieved using ArrayList




# Part09

**Objectives**   
1. Class Inheritance
2. Interfaces
3. Object polymorphism
4. Summary



## Class Inheritance

**Objectives**  
You know that in the Java programming language every class inherits the Object class, and you understand why every object has methods toString, equals, and hashCode.
You are familiar with the concepts of inheritance, superclass, and subclass.
You can create classes that inherit some of their properties from another class.
You can call a constructor or method that is defined in a superclass.
You know how an object's executed method is determined, and you are familiar with the concept of polymorphism.
You can assess when to use inheritance, and you can come up with an example that is ill-suited for inheritance.


**Inheritance**
Each class can directly extend only one class. However, a class indirectly inherits all the properties of the classes it extends. So the ArrayList class derives from the class AbstractList, and indirectly derives from the classes AbstractCollection and Object. So ArrayList has at its disposal all the variables and methods of the classes AbstractList, AbstractCollection, and Object.

Example:
```java
public class Engine extends Part {
        private String engineType;


        // default constructor
        public Engine (String engineType, String identifier, String manufacturer, String description) {
                super(identifier, manufacturer, description);// this calls Part() custom constructor
                this.engineType = engineType;
        }


        public String getEngineType() {
                return this.engineType;
        }

}
class Main {

        public static void main(String[] args) {
                Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1L 86-91");
                System.out.println(engine.getEngineType());
                System.out.println(engine.getManufacturer());

        }
}
public class Part {

        private String manufacture;
        private String description;
        private String identifier;

        // Constructor
        public Part(String identifier, String manufacturer, String description) {
                this.manufacture = manufacturer;
                this.description = description;
                this.identifier = identifier;
        }


        public String getIdentifier() {
                return this.identifier;
        }

        public String getManufacturer() {
                return this.manufacture;
        }

        public String getDescription() {
                return this.description;
        }
}

```


One must always call the superclass constructor in the subclass constructor
IN the example below we have superclass with 2 distinct constructors(one with parameter, no parameters). 
Previoulsy if we had multiple constructors , we can call another constructor using ``this`` keyword. 



An object type determined what methods can be called. In the example below Student inherits from Person and methods toString is only available from the Perosn superclass.
```java
Person ollie = new Student("Ollie", "Jupiter Address 102");
ollie.study(); // throw an error as ollie is of type Person with Person methods oly
System.out.println(ollie); // calls toString() for Student : object type
```


The variable type determines which methods you are allowed to call (visibility/access), but the object type determines how those methods behave.

Regardless of the type of the variable, the method that is executed is always chosen based on the actual type of the object. Objects are polymorphic, which means that they can be used via many different variable types. The executed method always relates to the actual type of the object. This phenomenon is called polymorphism.

**When is inheritance worth using?**

Inheritance is a tool for building and specializing hierarchies of concepts; a subclass is always a special case of the superclass. If the class to be created is a special case of an existing class, this new class could be created by extending the existing class. For example, in the previously discussed car part scenario an engine is a part, but an engine has extra functionality that not all parts have.

When inheriting, the subclass receives the functionality of the superclass. If the subclass doesn't need or use some of the inherited functionality, inheritance is not justifiable. Classes that inherit will inherit all the methods and interfaces from the superclass, so the subclass can be used in place of the superclass wherever the superclass is used. It's a good idea to keep the inheritance hierarchy shallow, since maintaining and further developing the hierarchy becomes more difficult as it grows larger. Generally speaking, if your inheritance hierarchy is more than 2 or 3 levels deep, the structure of the program could probably be improved.

Inheritance is not useful in every scenario. For instance, extending the class Car with the class Part (or Engine) would be incorrect. A car includes an engine and parts, but an engine or a part is not a car. More generally, if an object owns or is composed of other objects, inheritance should not be used.

**Access Modifiers**  
If a method or variable has the access modifier ``private``, it is visible only to the internal methods of that class. Subclasses will not see it, and a subclass has no direct means to access it. So, from the Engine class there is no way to directly access the variables identifier, manufacturer, and description, which are defined in the superclass Part. The programmer cannot access the variables of the superclass that have been defined with the access modifier private.

A subclass sees everything that is defined with the ``public`` modifier in the superclass. If we want to define some variables or methods that are visible to the subclasses but invisible to everything else, we can use the access modifier ``protected`` to achieve this.


**hashCode**  

**Abstract Classes**
differences between inheriting from a concrete (normal) class and an abstract class are:


In an abstract class, at any time we define a method: ``accessModifier abstract returnType functionName`` e.g: ``public abstract void execute `` it states that any subclass must have the execute method, however the abstract class itself does not know it's functionalities. 

| Feature	| Concrete (Normal) | Class	Abstract Class |
| ---- | ---- | ---- |
| Can you create an object with new?   |	✅ Yes, e.g., new Operation("name")  |  ❌ No. You cannot instantiate an abstract class. |
| Can it have normal methods?	|  Yes | ✅ Yes (like getName()). |
| Can it have abstract methods?	| ❌ No |	✅ Yes (like execute()). |
| What happens if a subclass does NOT override an abstract method?	| N/A (no abstract methods) |	❌ Compilation error. The subclass  must provide a body for all inherited abstract methods (unless the subclass is also abstract).

Example of Abstraction:


UserInterface.java
```java
import java.util.Scanner;
import java.util.ArrayList;
public class UserInterface {

    private Scanner scanner;
    private ArrayList<Operation> operations;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.operations = new ArrayList<>();
    }

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public void start() {
        while (true) {
            printOperations();
            System.out.println("Choice: ");

            String choice = this.scanner.nextLine();
            if (choice.equals("0")) {
                break;
            }

            executeOperation(choice);
            System.out.println();
        }
    }

    private void printOperations() {
        System.out.println("\t0: Stop");
        int i = 0;
        while (i < this.operations.size()) {
            String operationName = this.operations.get(i).getName();
            System.out.println("\t" + (i + 1) + ": " + operationName);
            i = i + 1;
        }
    }

    private void executeOperation(String choice) {
        int operation = Integer.valueOf(choice);

        Operation chosen = this.operations.get(operation - 1);
        chosen.execute(scanner);
    }
}
```

Operation.java
```java
public abstract class Operation {

    private String name;

    public Operation(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void execute(Scanner scanner);
}
  
```

PlusOperation.java
```java
import java.util.Scanner;
public class PlusOperation extends Operation {

    public PlusOperation() {
        super("PlusOperation");
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.print("First number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second));
    }

}

```

## Intefaces
interfaces are used to define behavior that's required from a class, i.e., its methods. They're defined the same way that regular Java classes are, but ``public interface InterfaceName {}`` is used instead of ``public class ... `` at the beginning of the class. Interfaces define behavior through method names and their return values. However, they don't always include the actual implementations of the methods. A visibility attribute on interfaces is not marked explicitly as they're always public.

```java
public interface Readable {
    String read();
}
```
The Readable interface declares a ``read()`` method, which returns a String-type object. ``Readable`` defines certain behavior: for example, a text message or an email may be readable.

The classes that implement the interface decide how the methods defined in the interface are implemented. A class implements the interface by adding the keyword ``implements`` after the class name followed by the name of the interface being implemented. 

```java
public class TextMessage implements Readable {
    private String sender;
    private String content;

    // Constuctor
    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return this.sender;
    }

    public String read() {
        return this.content;
    }
}
```

Inteferace des not decide how the methods of the Implmeneting class run/execute/structure, it only checks the behavior of the method

In the example below we have:
```java
publc interface class 
```


```java
public class EBook() {

}
```

**Interface as a Variable Type**
When declaring a variable, the type of the Variable is stated. We have covered 2 main types of variable namely:
- primitive type variables
- reference type variables

When we implement an interface to a class, we can assign the interface as the type to the instance/object of that class.

**My understanding**: At any time we implement an interface to a class, the methods belonging to that interface must be run/included in the class methods, otherwise u get an error.  
e.g
```java
import java.util.ArrayList;

public interface Readable {
    String read();
}


public class Ebook implements Readable {
    private String bookTitle; 
    private ArrayList<String> pages;

    public Ebook(String bookName) {
        this.bookTitle = bookName;
        this.pages = new ArrayList<>();
    }

    public String read(){
        for (String pageItem: this.pages) {
            return pageItem;
        }
    }
    public void addPages(ArrayList pages) {
        for (String pageItem: pages) {
            this.pages.add(pageItem);
        }
    }
    public int bookPages() {
        return this.pages.size();
    }
}

Readable myBook = new Ebook("Art of War");

ArrayList<String> allPages = new ArrayList<>();

allPages.add("Weapons are of illomen, only to be used as a last resort, Du Mu");
allPages.add("One must know himself, and the enemy to win a battle, Du Mu");
myBook.addPages(allPages);

for (int i = 0 ; i < myBook.bookPages(); i++) {
    System.out.println(myBook.read());
}

```


Note that although the Ebook class that inherits the Readable interface class is always of the interface's type, not all classes that implement the Readable interface are of type Ebook. You can assign an object created from the Ebook class to a Readable-type variable, but it does not work the other way without a separate type conversion.
```java
Readable readable = new TextMessage("ope", "TextMessage is Readable!"); // works
TextMessage message = readable; // doesn't work

TextMessage castMessage = (TextMessage) readable; // works if, and only if, readable is of text message type
```

Type conversion succeeds if, and only if, the variable is of the type that it's being converted to. Type conversion is not considered good practice, and one of the few situation where it's use is appropriate is in the implementation of the equals method.



**interface as return type**


**Built in interfaces**
- List
- Map
- Set 
- Collection

**List Interface**  

The List interface defines the basic functionality related to lists. Because the ArrayList class implements the List interface, one can also use it through the List interface.
```java
List<String> strings = new ArrayList<>();
strings.add("string objects inside an arraylist object!");
```

As we can see fom the Java API of List, there are many classes that implement the List interface. One list that is familiar to computer scientists is a linked list. A linked list can be used through the List interface exactly the same way as an object created from ArrayList.
```java
List<String> strings = new LinkedList<>();
strings.add("string objects inside a linkedlist object!");
```

From the perspective of the user, both implementations of the List interface work the same way. The interface abstracts their inner functionality. The internal structures of ArrayList and LinkedList differ quite a bit. ArrayList saves objects to an array where fetching an object with a specific index is very fast. On the other hand LinkedList constructs a list where each element contains a reference to the next element in the list. When one searches for an object by index in a linked list, one has to go though the list from the beginning until the index.

One can see noticeable performance differences between list implementations if the lists are big enough. The strength of a linked list is that adding to it is always fast. ArrayList, on the other hand, is backed by an array, which needs to be resized each time it gets full. Resizing the array requires creating a new array and copying the values from the old array to the new one. On the other hand, searching objects by index is much faster in an array list compared to a linked list.

For the problems that you encounter during this course you should almost always choose ArrayList. However, "interface programming" is beneficial: implement your programs so that you'll use the data structures through the interfaces.


**The Map Interface**  
The Map interface defines the basic behavior associated with hash tables. Because the HashMap class implements the Map interface, it can also be accessed through the Map interface.
```java
Map<String, String> maps = new HashMap<>();
maps.put("ganbatte", "good luck");
maps.put("hai", "yes");
```
The keys to the hash table are obtained using the keySet method.
```java
Map<String, String> maps = new HashMap<>();
maps.put("ganbatte", "good luck");
maps.put("hai", "yes");

for (String key : maps.keySet()) {
    System.out.println(key + ": " + maps.get(key));
}

// Sample output

// ganbatte: good luck
// hai: yes
```
The keySet method returns a set of elements that implement the Set interface. You can use a for-each statement to go through a set that implements the Set interface. The hash values can be obtained from the hash table using the values method. The values method returns a set of elements that implement the Collection interface. Let's take a quick look at the Set and Collection interfaces.



**The Set Interface**  

The Set interface describes functionality related to sets. In Java, sets always contain either 0 or 1 amounts of any given object. As an example, the set interface is implemented by HashSet. Here's how to go through the elements of a set.

```java
Set<String> set = new HashSet<>();
set.add("one");
set.add("one");
set.add("two");

for (String element: set) {
    System.out.println(element);
}


// Sample output
// one
// two
```

Note that HashSet in no way assumes the order of a set of elements. If objects created from custom classes are added to the HashSet object, they must have both the equals and hashCode methods defined.


**The Collection Interface**  
The Collection interface describes functionality related to collections. Among other things, lists and sets are categorized as collections in Java — both the List and Set interfaces implement the Collection interface. The Collection interface provides, for instance, methods for checking the existence of an item (the method contains) and determining the size of a collection (the method size).

The Collection interface also determines how the collection is iterated over. Any class that implements the Collection interface, either directly or indirectly, inherits the functionality required for a for-each loop.

Let's create a hash table and iterate over its keys and values.
```java
Map<String, String> translations = new HashMap<>();
translations.put("ganbatte", "good luck");
translations.put("hai", "yes");

Set<String> keys = translations.keySet();
Collection<String> keyCollection = keys;

System.out.println("Keys:");
for (String key: keyCollection) {
    System.out.println(key);
}

System.out.println();
System.out.println("Values:");
Collection<String> values = translations.values();

for (String value: values) {
    System.out.println(value);
}

// Sample output
// Keys:
// ganbatte
// hai
// Values:
// yes
// good luck
```

In the next exercise, we build functionality related to e-commerce and practice using classes through their interfaces.



## Object Polymorphism

```java
String text = "text";
Object textString = "another string";

String text = "text";
Object textString = text;
```
In the above we have String object being assigned to Object type.  Any child class that inherits parent Class , it's instance can be assigned to the Parent class.


```java
Object textString = "another string";
String text = textString; // WON'T WORK!
```

In addition to each variable's original type, each variable can also be represented by the types of interfaces it implements and classes that it inherits. The String class inherits the Object class and, as such, String objects are always of type Object. The Object class does not inherit a String class, so Object-type variables are not automatically of type String.

In Java, each class can inherit one class at most. On the other hand, the inherited class may have inherited another class. As such, a class may indirectly inherit more than a single class.



This also applies to interfaces that a class implements. In the example below we look into the interfaces that a class implements.

Let's continue to look at the API description of the String class. The inheritance hierarchy in the description is followed by a list of interfaces implemented by the class.

All Implemented Interfaces:
Serializable, CharSequence, Comparable<String>

The String class implements the Serializable, CharSequence, and Comparable <String> interfaces. An interface is also a type. According to the class' API description, the following interfaces can be set as the type of a String object.

```java
Serializable serializableString = "string";
CharSequence charSequenceString = "string";
Comparable<String> comparableString = "string";
```



# Part 10

## Streams
Stream are formed from any Class / Data type that implements the Collection interface using the stream() methods. Example of such Data Structures include: List, ArrayList, Set, Arrays


Example:  
```java
// counting the number of values divisible by three
long numbersDivisibleByThree = inputs.stream()
    .mapToInt(s -> Integer.valueOf(s))
    .filter(number -> number % 3 == 0)
    .count();

// working out the average
double average = inputs.stream()
    .mapToInt(s -> Integer.valueOf(s))
    .average()
    .getAsDouble();



// counting the number of values divisible by three
long numbersDivisibleByThree = inputs.stream()
    .mapToInt(s -> Integer.valueOf(s))
    .filter(number -> number % 3 == 0)
    .count();
```

*A stream can be formed from any object that implements the Collection interface (e.g., ArrayList, HashSet, HashMap, ...) with the stream() method. The string values ​​are then converted ("mapped") to integer form using the stream's mapToInt(value -> conversion) method. The conversion is implemented by the valueOf method of the Integer class, which we've used in the past. We then use the filter (value -> filter condition) method to filter out only those numbers that are divisible by three for further processing. Finally, we call the stream's count() method, which counts the number of elements in the stream and returns it as a long type variable.*


A brief summary of the stream methods we've encountered so far.
| Purpose and method 	| Assumptions |
| ---- | ---- |
| Stream formation: stream()  |  The method is called on collection that implements the Collection interface, such as an ArrayList Object. Something is done on the created stream.|
| Converting a stream into an integer stream: mapToInt(value -> another)  |	The stream transforms into one containing integers. A stream containing strings can be converted using, for instance, the valueOf method of the Integer class. Something is done with the stream containing integers. |
| Filtering values: filter(value -> filter condition)  |  The elements that do not satisfy the filter condition are removed from the string. On the right side of the arrow is a statement that returns a boolean. If the boolean is true, the element is accepted into the stream. If the boolean evaluates to false, the value is not accepted into the stream. Something is done with the filtered values. |
| Calculating the average: average()  |  Returns a OptionalDouble-type object that has a method getAsDouble() that returns a value of type double. Calling the method average() works on streams that contain integers - they can be created with the mapToInt method. |
| Counting the number of elements in a stream: count() 	|  Returns the number of elements in a stream as a long-type value.  |



## Lambda Expressions
a lambda expression, is shorthand provided by Java for anonymous methods that do not have an "owner", i.e., they are not part of a class or an interface.

Example of a lambda expression:
```
value -> value % 2 == 0
```

The function contains both the parameter definition and the function body. The same function can be written in several different ways. See below.
```java
// original
*stream*.filter(value -> value > 5).*furtherAction*

// is the same as
*stream*.filter((Integer value) -> {
    if (value > 5) {
        return true;
    }

    return false;
}).*furtherAction*

```
The same can be written explicitly so that a static method is defined in the program, which gets used within the function passed to the stream as a parameter.
```java
public class Screeners {
    public static boolean greaterThanFive(int value) {
        return value > 5;
    }
}

// original
*stream*.filter(value -> value > 5).*furtherAction*

// is the same as
*stream*.filter(value -> Screeners.greaterThanFive(value)).*furtherAction*
```
The function can also be passed directly as a parameter. The syntax found below ``Screeners::greaterThanFive`` is saying: "use the static greaterThanFive method that's in the Screeners class".

// is the same as

``*stream*.filter(Screeners::greaterThanFive).*furtherAction*``
Lambda expression cannot change local instance variables, however they can read them.

There are 2 types of Expressions functions:
- Intermediate functions filter()
- Terminal functions e.g average()


![handling_images](images/handling_collections_as_streams.png)




A new ArrayList list is created to which values ​​are added. This is can be done in a stream() using  ``.collect(Collectors.toCollection(ArrayList::new));``


## Handling Collection as Streams

Let's take a look at four terminal operations: the count method for counting the number of values on a list, the forEach method for going a through list values, the collect method for gathering the list values ​​into a data structure, and the reduce method for combining the list items.


**Count Method**   s
The count method informs us of the number of values in the stream as a long-type variable.
```java
List<Integer> values = new ArrayList<>();
values.add(3);
values.add(2);
values.add(17);
values.add(6);
values.add(8);

System.out.println("Values: " + values.stream().count());

// Sample output

// Values: 5

```

**ForEach Method**  

The forEach method defines what is done to each list value and terminates the stream processing. In the example below, we first create a list of numbers, after which we only print the numbers that are divisible by two.
```java
List<Integer> values = new ArrayList<>();
values.add(3);
values.add(2);
values.add(17);
values.add(6);
values.add(8);

values.stream()
    .filter(value -> value % 2 == 0)
    .forEach(value -> System.out.println(value));
```
You can use the collect method to collect stream values into another collection. The example below creates a new list containing only positive values. The collect method is given as a parameter to the Collectors object to which the stream values ​​are collected - for example, calling Collectors.toCollection(ArrayList::new) creates a new ArrayList object that holds the collected values.
```java
List<Integer> values = new ArrayList<>();
values.add(3);
values.add(2);
values.add(-17);
values.add(-6);
values.add(8);

ArrayList<Integer> positives = values.stream()
    .filter(value -> value > 0)
    .collect(Collectors.toCollection(ArrayList::new));

positives.stream()
    .forEach(value -> System.out.println(value));

// Sample output

// 3
// 2
// 
```



**Reduce Method**  
The reduce method is useful when you want to combine stream elements to some other value. 
```java
ArrayList<Integer> values = new ArrayList<>();
values.add(7);
values.add(3);
values.add(2);
values.add(1);

int sum = values.stream()
    .reduce(0, (previousSum, value) -> previousSum + value);
System.out.println(sum);
```

My understanding: the previousSum is zero and for the first value it gets added to the sum and sum is updated by this value and the process is repeated for each value. 


```java
ArrayList<String> words = new ArrayList<>();
words.add("First");
words.add("Second");
words.add("Third");
words.add("Fourth");

String combined = words.stream()
    .reduce("", (previousString, word) -> previousString + word + "\n");
System.out.println(combined);
```



**Intermediate Methods**
Intermediate stream operations are methods that return a stream. Since the value returned is a stream, we can call intermediate operations sequentially. 

- distinct-method, that returns a stream that only contains unique values.
- sorted-method, returns the list in sorted manner



## Files and Streams
Streams are also very handy in handling files. The file is read in stream form using Java's ready-made Files class. The lines method in the files class allows you to create an input stream from a file, allowing you to process the rows one by one. The lines method gets a path as its parameter, which is created using the get method in the Paths class. The get method is provided a string describing the file path.

```java
List<String> rows = new ArrayList<>();

try {
    Files.lines(Paths.get("file.txt")).forEach(row -> rows.add(row));
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}

// do something with the read lines
```