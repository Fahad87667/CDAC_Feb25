// Snippet 1:  
class Main { 
    public void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 

//  What error do you get when running this code?

/*
error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error
-- IF CLASS IS DECLARED PUBLIC, IT'S NAME MUST MATCH WITH THE FILENAME...

*/

// Snippet 2:  
class Main2 { 
    static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 
//  What happens when you compile and run this code? 
// --- Compiled Successfully but thrown Error: Main method not found in class Main2,"Public" //     is missing in main method. 

// Snippet 3:  
class Main3 { 
    public static int main(String[] args) { 
        System.out.println("Hello, World!"); 
        return 0; 
    }  
}

/*  What error do you encounter? Why is void used in the main method? 
 --- Compiled successfully but thrown Error: Main method not found in class Main3, please define the main method as:
   public static void main(String[] args)
-- Void - indicates that the method does not return any value, because main method only runs the program but doesn't return any value that's why we use void.
*/

// Snippet 4:  
class Main4 { 
    public static void main() { 
        System.out.println("Hello, World!"); 
    } 
} 
/*
 What happens when you compile and run this code? Why is String[] args needed? 
--- Compiled Successfully but thrown runtime Error: Main method not found in class Main4, please define the main method as:
   public static void main(String[] args)
--- Strings[] args needed because it accepts comman-line arguments
--- Strings[] is the array of strings
--- args is the name of array {can be changed}

*/
