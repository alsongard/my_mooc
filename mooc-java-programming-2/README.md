# ☕ Java Programming II

Solutions for the updated module on **Java Programming II** course (part of the MOOC.fi curriculum).  
Each exercise is organized by part and chapter.

### Getting Started

To run any solution locally:

1. Make sure you have [Java JDK](https://adoptium.net/) installed (version 11 or later).
2. Clone this repository:  

   ```bash
   git clone https://github.com/alsongard/my-mooc.git
   cd mooc-java-programming-2
   ```
   
3. Navigate to the desired exercise folder and compile:  
   ```bash
   javac ExerciseName.java
   java ExerciseName
   ```


### Structure

```

mooc-java-programming-2/
├── part08/
│   ├── Part08_01/
│   ├── Part08_02/
│   └── ...
├── part10/
├── part11/
└── ...
```


### Progress

> ✅ Part 08 – Recap    
This is Recap of what you previously learned on mooc-java-programming-1 of the course. It includes
-  primitive and reference datatypes, ArrayList, Arrays, Classes and Objects.  
- ``Equals()``  and ``HashCode()`` methods
- Introduction to ``HashMap`` data structure and it methods: ``get()``, ``keySet()``, ``values()``, ``put()``, ``remove()`` , ``return values``, setting ArrayList as values, setting Objects as keys,  
> ✅ Part 09 - Inheritance  
This section introduces the student to inheritance between classes
- Using ``extends`` keyword for inheritance, ``super()`` method declaration for subclass classes, Parent class
- Polymorphism
- When and when not to use inheritance
- Abstract classes and abstract methods


> Part 10 - Streams, 
- Stream methods , intermediate methods e.g map(), and terminal methods
- Comparator class and its  methods ->  ``comparingThen()`` and ``compare()``
- StringBuilder class and  it's methods -> ``append()`` and  ``toString()``
- Classes and ArrayList
- String , String split() methods
- forEach method

> Part 11 - FileWriter, PrintWriter, OutputStreamWriter and Writer class
- Using FileWriter, PrintWriter, OutputStreamWriter and Writer for writing data to files
- Understanding the inheritance / class relationship between the classes


> Part 12 - Generic Classes, Type Parameters
-  Reintroduction to Arrays data structure: ``int[] myNumArray =  new int[10];``, Using indexing to add  data to array data structure ``myNumArray[0] = 2``. 
-  Type Parameters ``class Student <T>``, Generic List Class ``class List<T>``, Generic Pair class ``class Pair<K,V>``, Generic HashMap class ``class HashMap<K,V>`` 
-  Random Java Built Library: Use the random class to generate random int and double numbers. ``Random random = new Random(); random.nextInt(61) - 30;``
-  Multidimention Arrays: ``int[][] twoDimensionArray = new int[2][2]``, Siamese Method for creating square matrix, Data Structuers 


> Part 13: Graphic User Interface
