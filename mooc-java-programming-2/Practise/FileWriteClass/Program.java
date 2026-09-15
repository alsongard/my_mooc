import java.io.FileWriter;


class Program {
    public static void main(String args[]) {
        try (FileWriter myFile = new FileWriter("./data/file.txt", true)) {
            myFile.write("We are learning Java");
        } catch(Exception e) {
            System.out.println("An error occured while accesing file: file.txt");
            System.out.println(e.getMessage());
        }
    }
}

/*
So while FileWriter class, the program above shows what i understood based on the Class.
Per the docs, it inherits from the Class java.io.OutputStreamWriter

In the code, above I use a try catch block which performs the following:
- Error handling of OS resources: by accessing the file withing the try paranthesis, if an error occurs, e.g file is a directory, the error is thrown to the catch block where it can be processed.
- Using the try catch block ensures that the resources used which accessing the file are closed by automatically after performing operations.
- When using try for accessing the resources, the Class (FileWriter) or any class must implement the method closable() or AutoCloseable() ,otherwise you get an error. 

FileWriter
To use FileWrite we create an instance/object, in which the constructor method of FileWriter takes the filename and other arguments such as:
- Charset cs: Used to specify the type of encoding
- true: appending is enabled. Writing data to the file is appended
- write() method: the write method is used to write either: a single character data type, an array of characters or a string
- getEncoding(): this method is used to return the character encoding used by the FileWriter as a string.
- close(): this method is used to close/release resources used by the system while writing files
Catch Block:
The catch block is used to handle the errors


- What is a charset:
The charset is a character encoding scheme that  java uses when writting files. It is used to specify the character encoding when writing data(strings) into bytes for a file. e.g UTF-8, UTF-16 

- To set the  Charset used when writting to a file we:
```java
import java.nio.charset.StandardCharsets;
new FileWriter("./data/files.txt", StandardCharsets.UTF_8, false)
```
*/