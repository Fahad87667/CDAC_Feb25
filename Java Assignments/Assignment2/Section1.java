// Section 1: Error-Driven Learning in Java 
//-----------------------------------------------------------------------------------------

/* Snippet 1:  
public class Section1 { 
    public void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 

//  What error do you get when running this code?

error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error
-- IF CLASS IS DECLARED PUBLIC, IT'S NAME MUST MATCH WITH THE FILENAME...
-------------------------------------------------------------------------------------------


// Snippet 2:  
public class Section1 { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 
//  What happens when you compile and run this code? 
// --- Compiled Successfully but thrown Error: Section1 method not found in class Section12,"Public" //     is missing in main method. 

-------------------------------------------------------------------------------------------
// Snippet 3:  
public class Section1 { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
        return 0; 
    }  
}

//  What error do you encounter? Why is void used in the main method? 
 --- Compiled successfully but thrown Error: Section1 method not found in class Section13, please define the main method as:
   public static void main(String[] args)
-- Void - indicates that the method does not return any value, because main method only runs the program but doesn't return any value that's why we use void.
-------------------------------------------------------------------------------------------

// Snippet 4:  
public class Section1 { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 
 What happens when you compile and run this code? Why is String[] args needed? 
--- Compiled Successfully but thrown runtime Error: Section1 method not found in class Section14, please define the main method as:
   public static void main(String[] args)
--- Strings[] args needed because it accepts comman-line arguments
--- Strings[] is the array of strings
--- args is the name of array {can be changed}
-------------------------------------------------------------------------------------------

// Snippet 5:  
public class Section1 { 
    public static void main(String[] args) { 
        System.out.println("Main method with String[] args"); 
    } 
    public static void main(int[] args) { 
        System.out.println("Overloaded main method with int[] args"); 
    } 
} 
//  Can you have multiple main methods? What do you observe? 
-- No we can't have multiple main methods in a same class, I observed it only print the main method with String[] args.
-------------------------------------------------------------------------------------------

 
// Snippet 6:  
public class Section1 { 
    public static void main(String[] args) { 
	int y = 2;
        int x = y + 10; 
        System.out.println(x); 
    } 
} 

 What error occurs? Why must variables be declared? 
--- Error -- Assignment3.java:74: error: cannot find symbol
        int x = y + 10;
                ^
  symbol:   variable y
---- Variables must be explicitly declared and inititalized in java to allocate memory, prevent error or improve code readability.
-------------------------------------------------------------------------------------------


// Snippet 7:  
public class Section1 { 
    public static void main(String[] args) { 
        String x = "Hello"; 
        System.out.println(x); 
    } 
} 

 What compilation error do you see? Why does Java enforce type safety?
--- Error: incompatible types: String cannot be converted to int
        int x = "Hello";
---  Because java Ensures data integrity and avoid any data loss, and it is strongly typed 	language.
-------------------------------------------------------------------------------------------


//Snippet 8:  
public class Section1 { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!");
    } 
} 

 What syntax errors are present? How do they affect compilation? 
---Error: ')' or ',' expected
        System.out.println("Hello, World!"
--- Its a Syntax error or we can say incomplete SOP line execution
                                          ^
-------------------------------------------------------------------------------------------

//Snippet 9:  
public class Section1 { 
    public static void main(String[] args) { 
        int clss = 10; 
        System.out.println(clss); 
    } 
} 

 What error occurs? Why can't reserved keywords be used as identifiers?
--- Assignment3.java:122: error: not a statement
        int class = 10;
        ^
Assignment3.java:122: error: ';' expected
        int class = 10;
           ^
Assignment3.java:122: error: <identifier> expected
        int class = 10;
                 ^
Assignment3.java:123: error: illegal start of expression
        System.out.println(class);
                           ^
Assignment3.java:123: error: <identifier> expected
        System.out.println(class);
--- Reserved Keywords cannot be used as a variable because they have predefined meaning in 	java.
-------------------------------------------------------------------------------------------


// Snippet 10:  
public class Section1 { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
}

 What happens when you compile and run this code? Is method overloading allowed? 
--- Assignment3.java:154: error: non-static method display() cannot be referenced from a static context
        display();
        ^
Assignment3.java:155: error: non-static method display(int) cannot be referenced from a static context
        display(5);
--- Yes, Method overloading is allowed in java.
-------------------------------------------------------------------------------------------

// Snippet 11:  
public class Section1 { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[2]); 
    } 
} 
//  What runtime exception do you encounter? Why does it occur?
// --- Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
// --- Because the size of an array is 3 but we are trying to access the 6th element (index 5).
-------------------------------------------------------------------------------------------


// Snippet 12:  
public class Section1 { 
    public static void main(String[] args) { 
        while (true) { 
            System.out.println("Infinite Loop"); 
        } 
    } 
} 
//  What happens when you run this code? How can you avoid infinite loops? 
// --- It'll get stuck in an infinite loop because the condition `true` never changes.
// --- To avoid this, we should include a termination condition inside the loop.
-------------------------------------------------------------------------------------------


// Snippet 13:  
public class Section1 { 
    public static void main(String[] args) { 
        String str = "null"; 
        System.out.println(str.length()); 
    } 
} 

//  What exception is thrown? Why does it occur? 
// --- Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
// --- This occurs because `str` is null, and calling `.length()` on a null reference leads to an error.
-------------------------------------------------------------------------------------------


// Snippet 14:  
public class Section1 { 
    public static void main(String[] args) { 
        String num = "Hello"; 
        System.out.println(num); 
    } 
} 

//  What compilation error occurs? Why does Java enforce data type constraints? 
// --- Compilation error: incompatible types: String cannot be converted to double
// --- Java enforces strict data types to prevent unintended operations and runtime errors.
-------------------------------------------------------------------------------------------

// Snippet 15:  
public class Section1 { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        diuble result = num1 + num2; 
        System.out.println(result); 
    } 
} 

//  What error occurs when compiling this code? How should you handle different data types in operations?
// --- Compilation error: incompatible types: possible lossy conversion from double to int
// --- The sum of `int` and `double` results in a `double`, which cannot be assigned to an // `int` without explicit casting.

-------------------------------------------------------------------------------------------

// Snippet 16:  
public class Section1 { 
    public static void main(String[] args) { 
        int x = 5; 
        int y = 10; 
        System.out.println(x / y); 
    } 
} 

//  What happens when you run this code? How can division by zero be handled?
// --- Exception in thread "main" java.lang.ArithmeticException: / by zero
// --- Because integer division by zero is undefined in Java.
-------------------------------------------------------------------------------------------

// Snippet 17:  
public class Section1 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = math.pow(a,b); // a**b is not allowed
        System.out.println(result); 
    } 
} 
//  What compilation error occurs? Why is the ** operator not valid in Java? 
-- Section1.java:256: error: illegal start of expression
        int result = a ** b;
-- Because java does not have any exponentiation operator like in python, 
-- instead javaprovides math.pow(base, exponent).
-------------------------------------------------------------------------------------------

// Snippet 18:  
public class Section1 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a + b * 2; 
        System.out.println(result); 
    } 
} 
//  What is the output of this code? How does operator precedence affect the result? 
// 20. It doesn't affect the result because java follows the BODMAS rule.

-------------------------------------------------------------------------------------------

// Snippet 19:  
public class Section1 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 10; 
        int result = a / b; 
        System.out.println(result); 
    } 
} 
//  What runtime exception is thrown? Why does division by zero cause an issue in Java?
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//       at Section1.main(Section1.java:285)
// denominator should not be a Zero in division, because division is undefined.

-------------------------------------------------------------------------------------------

// Snippet 20:  
public class Section1 { 
    public static void main(String[] args) { 
        System.out.println("Hello, World");
    } 
} 
 What syntax error occurs? How does the missing semicolon affect compilation? 
// ";" semicolon is missing syntax error, without itc compiler doesn't know where 
// the statement ends, it's also called termination token . 
-------------------------------------------------------------------------------------------

// Snippet 21:  
public class Section1 { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    // Missing closing brace here 
} }
//  What does the compiler say about mismatched braces?
// Section1.java:313: error: reached end of file while parsing
// }
//  ^
// 1 error

-------------------------------------------------------------------------------------------

// Snippet 22:  
public class Section1 { 
    public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
} 
//  What syntax error occurs? Can a method be declared inside another method? 
Section1.java:325: error: illegal start of expression
        static void displayMessage() {
        ^
Section1.java:329: error: class, interface, enum, or record expected
}
// No, Methods must be defined at the class level, not within other methods.

-------------------------------------------------------------------------------------------

// Snippet 23:  
public class Section1 { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
		break;
            case 2: 
                System.out.println("Value is 2"); 
		break;
            case 3: 
                System.out.println("Value is 3"); 
		break;
            default: 
                System.out.println("Default case"); 
        } 
    } 
} 
//  Error to Investigate: Why does the default case print after "Value is 2"? 
// How can you prevent the program from executing the default case? 
//  Because we need to break the case after getting the desired output 
// by writing break statement as "break;" after every case.

-------------------------------------------------------------------------------------------

// Snippet 24:  
public class Section1 { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
		break;
            case 2: 
                System.out.println("Level 2");
		break; 
            case 3: 
                System.out.println("Level 3"); 
		break;
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
} 
//  Error to Investigate: When level is 1, why does it print "Level 1",
// "Level 2", "Level 3", and 
// "Unknown level"? What is the role of the break statement in this situation? 
// -- Break statement breaks the case after matching the desired switch value, 
// so that, the program prints only the needed output.

-------------------------------------------------------------------------------------------

// Snippet 25:  
public class Section1 { 
    public static void main(String[] args) { 
        float score = 85.0; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
} 
//  Error to Investigate: Why does this code not compile?
// What does the error tell you about the types allowed in switch expressions?
// How can you modify the code to make it work? 
-- Section1.java:391: error: primitive patterns are a preview feature and are disabled by default.
        switch(score) {
              ^
  (use --enable-preview to enable primitive patterns)
Section1.java:392: error: constant label of type int is not compatible with switch selector type double
            case 100:
                 ^
Section1.java:395: error: constant label of type int is not compatible with switch selector type double
            case 85:
--- To fix this issue we can change the data type from double to int.
-------------------------------------------------------------------------------------------

// Snippet 26:  
public class Section1 { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
                break; 
            case 6: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} 
//  Error to Investigate: Why does the compiler complain about duplicate case labels? 
// What happens when you have two identical case labels in the same switch block? 
//-- Section1.java:426: error: duplicate case label
//  Switch cases must be unique.

-------------------------------------------------------------------------------------------
*/
