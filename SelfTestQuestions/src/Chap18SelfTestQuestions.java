/*

Chapter 18 Self Test Questions

1. Explain the principles of input and output and identify different input and output
devices.

Input means data being transferred into the primary memory of the computer via the input stream.  The standard and most common form of input is the keyboard.  The mouse also provides input of a different kind
and it's input is often used with event handlers to programme happens with mouse clicks and mouse drags etc.  Other forms of input could be from secondary storage such as a hard drive,
a wand or a scanner.

Output refers to the data being output from the primary memory of the computer.  The data is first stored in primary memory before being transferred out via the output stream to an output device.
The standard output device is a computer monitor but other output devices could be speakers via a digital to analog converter that send the analog signal out via a jack or a printer.

2. What is meant by the term input/output stream?

An input/output stream is the channel that data flows down between the primary memory and the various input and output devices.

3. Distinguish between text, binary and object encoding of data.

Text Encoding
This is data that is encoded using a system such as ASCII or Unicode.  In ASCII, each character is assigned to a number.  Therefore a number is stored in binary form and then decoded to represent a
specific character on screen.  These files can be easily read by a text editor. For example if the number 867 is stored as text, this would be encoded as 8 (1000), 6 (0110), 7 (0111) - 1000 0110 0111.
Each character is therefore decoded separately to be represented on screen.  It would not be possible for a computer to do calculations with this number without some kind of conversion happening first

Binary Encoding
This is data that is encoded using binary numbers.  Numbers are represented in full binary and are interpreted/decoded differently depending on the application that is using them.  To some
applications, the file will not make any sense at all.  For example the number 867 would be encoded as 0000001101100011 in 16 bit binary.   These kinds of numbers can be used by a computer to 
undertake mathematical calculations without any conversions.  

Object Encoding
Object encoding is an encoding specific to java that enables an entire object to be input or output at once.  This greatly simplifies the saving process when working with secondary memory.

4. Explain why we have used the try-with-resources construct throughout this chapter to create and open files.
When the try-with-resources clause is used, the file that is opened in the clause is always closed no matter what. Crucially, if anything with the try block throws and exception at the same time
as an IO Exception being thrown, the IO Exception is suppressed which then allows the other exception to be seen and acknowledged.

5. The TextFileTester of Sect. 18.5 is to be adapted so that the user is simply
asked to enter a number of cars, which, when that process is finished, saves
those cars to a text file. The program then terminates. The file does not have to
be read from within the program, but should be able to be read by a text editor
such as Windows™ Notepad. The format should be as follows:

6. What is the difference between serial access files and random access files?

Serial access files
A serial access file is a file that is read from the start in order of the data as it is written in the file.  This has a runtime of O(n)

Random Access Files
A random access file is a file that is able to be accessed at any point within the data of the file without first running through the entire file.  This has a runtime of O(1)

7. Explain the purpose of the Serializable interface.
The serializable interface enables the class that implements it to send and receive entire objects instead of text or binary.  This simplifies the read/write process for the programmer.
It acts as a marker that lets people know that the objects in that class can be read and written as whole objects.

8. Calculate the number of bytes required to store an object of a class, the attributes
of which are declared as follows:

private int x;
private char c;
private String s;

You can assume that the String attribute will always consists of exactly 20
characters.

int - 4 bytes
char - 2 bytes
string 20 characters - 20 bytes for the characters and 2 bytes to store the length - 22 bytes

4 + 2 + 20 = 26 bytes in total


1. Run the TextFileTester from Sect. 18.5 then adapt it so that it handles
binary files, as described in Sect. 18.6.






*/