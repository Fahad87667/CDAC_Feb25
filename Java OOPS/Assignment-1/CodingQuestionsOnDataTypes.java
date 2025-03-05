/* Coding Questions on Data Types: 
1. Write a Java program to declare and initialize all eight primitive data types and print 
their values. 
2. Write a Java program that takes two integers as input and performs all arithmetic 
operations on them. 
3. Implement a Java program to demonstrate implicit and explicit type casting. 
4. Create a Java program that converts a given integer to a double and vice versa using 
wrapper classes. 
5. Write a Java program to swap two numbers using a temporary variable and without 
using a temporary variable. 
6. Develop a program that takes user input for a character and prints whether it is a 
vowel or consonant. 
7. Create a Java program to check whether a given number is even or odd using 
command-line arguments.
*/

import java.util.Scanner;

class Ques1 {
    public static void main(String args[]) {
		byte a = 10;
        short b = 200;
        int c = 30000;
        long d = 4000000000L;
        float e = 5.5f;
        double f = 10.12345;
        char g = 'A';
        boolean h = true;
        
        System.out.println("Byte: " + a);
        System.out.println("Short: " + b);
        System.out.println("Int: " + c);
        System.out.println("Long: " + d);
        System.out.println("Float: " + e);
        System.out.println("Double: " + f);
        System.out.println("Char: " + g);
        System.out.println("Boolean: " + h);
    }
}

class Ques2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
        System.out.println("Modulus: " + (x % y));
        sc.close();
    }
}

class Ques3 {
    public static void main(String args[]) {
        int num = 100;
        double implicit = num; // Implicit casting
        System.out.println("Implicit casting (int to double): " + implicit);
        
        double decimal = 99.99;
        int explicit = (int) decimal; // Explicit casting
        System.out.println("Explicit casting (double to int): " + explicit);
    }
}

class Ques4 {
    public static void main(String args[]) {
        Integer intObj = 42;
        Double doubleObj = intObj.doubleValue(); // Integer to Double
        System.out.println("Integer to Double: " + doubleObj);
        
        Double dObj = 55.55;
        Integer iObj = dObj.intValue(); // Double to Integer
        System.out.println("Double to Integer: " + iObj);
    }
}

class Ques5 {
    public static void main(String args[]) {
        int a = 5, b = 10;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap (using temp): a = " + a + ", b = " + b);
        
        a = 5; b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap (without temp): a = " + a + ", b = " + b);
    }
}

class Ques6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
        sc.close();
    }
}

class Ques7 {
    public static void main(String args[]) {
        if (args.length > 0) {
            int num = Integer.parseInt(args[0]);
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        } else {
            System.out.println("Please provide a number as a command-line argument.");
        }
    }
}
