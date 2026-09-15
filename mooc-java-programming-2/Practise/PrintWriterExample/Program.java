import java.io.PrintWriter;

public class Program {
    public static  void main(String args[]) {
        // System.out.println("Hello to the World");

        /*
            Java PrintWriter class gives Prints formatted representations of objects to a text-output stream.
            the term prints formatted representations of objects to a text output stream: means converting any java value into 
            human  read-able text form.
        */
        PrintWriter out = new PrintWriter(System.out);

        System.out.println(42);

        System.out.printf("Sum: %d", 5+3);


        /*
            Internally, PrintWriter calls String.valueOf(value) on whatever you pass, then writes the resulting characters. It also offers
            printf/format, which apply format specifiers (%d, %s, %.2f, etc.) — that's where "formatted" strongly applies.
        */

        /* 
            A text-output stream is a stream that carries characters, not bytes. It's designed for writing text 
            (Strings, chars, formatted text) and handles the character→byte encoding for you. 
        */

        /* 
            Bytes are for binary data (images, audio, compiled .class files, etc.).
            Characters are for text. A char like 'é' or '日' can require multiple bytes depending on encoding (UTF-8, UTF-16, etc.).
            Text streams handle that encoding automatically.

            PrintWriter is a text-output stream because it extends Writer, not OutputStream. That's also why the doc says it
            "does not contain methods for writing raw bytes" — that's intentional. Bytes are the job of byte streams like OutputStream.
        */

        /*
            3. What does "automatic flushing" mean?
            Flushing means forcing any buffered data to be pushed out to the underlying destination immediately.
            Many writers buffer data in memory for efficiency. Instead of writing 1 character at a time to the disk (which is slow), 
            they accumulate characters in a small buffer and write them in chunks.
            Flushing empties that buffer to the destination (file, console, socket, etc.).
            Without flushing, data may sit in the buffer until: the buffer fills up, close() is called, or the program exits.
            Automatic flushing in PrintWriter means: "If you construct the PrintWriter with autoFlush = true, then after every call to 
            println, printf, or format, flush the buffer immediately."
        */
    }   
}
