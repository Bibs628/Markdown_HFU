## 

Every Java file ends in .java, and it should contain a class inside with the same name.

If you want your Java file to do something, then you should place a _main_ method inside that class.

The braces { } indicate the scope of the structure involved, like a class or the _main_ method.

Place the lines you want your code to execute inside the main method.

The file you are seeing shows you the appropriate syntax of a simple Java program.

---

## Print

Inside the main method you can place two types of print statements.

|Command|Effect|
|---|---|
|System.out.print()|Prints a message in the console.|
|System.out.println()|Prints a message in the console, then ends the line.|
|||

After every command, like those, you must place a semicolon ; at the end of the line.

You can use the shortcut _sout_ to type quickly the println command.

To duplicate a line, you can use the shortcut Strg+D.

There are many ways of running a Java code:

- You can click on the green triangle at the left of the class or the _main_ method.
- You can right-click on the .java file and click on **Run**.
- You can click on the _Run_ tab on the toolbar, and select **Run**.
- You can use the shortcut Umschalt+F10.

---

## Storing Data

It is possible to save information inside a Java program. To do so, you must first tell Java which type of data it contains. The most used data types are

- _int_ to store integers, that is, numbers without decimal digits.
- _double_ to store numbers with decimal digits.
- _boolean_ to store true/false values.
- _String_ to save literal messages.

The syntax to declare a variable is

<data type> <variable name>;

After being declared, to set the variable's value, type

<variable name> = <variable value>;

You can initialize and declare a variable at the same time:

<data type> <variable name> = <variable value>;

This code contains examples of this.

```
public class StoringValues  
{  
   public static void main(String[] args)  
   {  
      int hoursInADay = 24;  
      double pi = 3.1416;  
      boolean isTheSkyBlue;  
      String languageName;  
  
      isTheSkyBlue = true;  
      languageName = "Java";  
  
      System.out.println("Hours in a day: " + hoursInADay);  
      System.out.println("Pi is close to " + pi);  
      System.out.println("Is the sky blue?: " + isTheSkyBlue);  
      System.out.print("The programming language we're learning is " + languageName);  
   }  

```

---

## Integer Division and Type Casting

Be careful whenever using the division operator (/): the division of two integers will result in another integer. Java will ignore the decimal digits after doing the calculation.

There are two ways of dealing with this limitation:

1. Declare the numerical variable involved as an _int_ type.
2. Cast one of the integers to a double type, as shown here.


´´´
public class IntegerDivisionAndTypeCasting  
{  
   public static void main(String[] args)  
   {  
      int people = 4, dumplings = 14;  
      double price = 150;  
  
      System.out.println("We ordered " + dumplings + " dumplings; costing $" + price + ".");  
      System.out.println("Each one of us has to pay $" + price/people + ".");  
      System.out.println("And each one of us gets to eat " + dumplings/people + " dumplings.");  
  
      System.out.println("...my bad, I was doing integer division.");  
      //In the next line, (double) tells Java to treat dumplings as a double type.  
      System.out.println("Each one of us gets to eat " + (double) dumplings/people + " dumplings.");  
   }  
}
´´´
---

