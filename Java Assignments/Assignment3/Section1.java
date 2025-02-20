// SECTION 1: Error-Driven Learning Assignment: Loop Errors 

// Snippet 1:  
class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i++) { 
            System.out.println(i); 
        } 
    } 
} 

// Error to investigate: Why does this loop run infinitely? 
// -- Because value of i is 0 which is already less than 10 and 
// -- its keep decrementing by 1 which will go infinitely
// ----
// How should the loop control variable be adjusted? 
//-- we can start the i value from 10 to i > 0 then keep dcrementing it or
//-- we can start start incrementing the i value rather than decrementing it.

//-----------------------------------------------------------------------------------------

// Snippet 2:  
class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count>0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} 
// Error to investigate: Why does the loop not execute as expected?
// What is the issue with the condition in the `while` loop?
//-- Because condition should be count>0. 
//-- While Count = 0 it'll execute only once whenever the count value is 0.

//-----------------------------------------------------------------------------------------

// Snippet 3:  
class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num < 0); 
    } 
} 
// Error to investigate: Why does the loop only execute once? 
// What is wrong with the loop condition in the `do while` loop? 
// --- Loop will not execute once but infinitely 
// --- because it'll kepp incrementing as the condition (num>0) always be true.
// --- But if we change the condition to (num<0) then it'll execute only once.

//-----------------------------------------------------------------------------------------

// Snippet 4:  
class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
        for (int i = 1; i < 10; i++) { 
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
} 
// Error to investigate: What is the issue with the loop boundaries? 
// How should the loop be adjusted to meet the expected output? 
// --- We only need to change the range (i<=10) to (i<10).
// --- Then we can get the desired output.

//-----------------------------------------------------------------------------------------

// Snippet 5:  
class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i--) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does this loop not print numbers in the expected order?
// What is the problem with the initialization and update statements in the `for` loop? 
// --- The problem is its (i++) incrementing but not (i--) decrementing.
// --- It should be (int i=10;i>=0;i--).

//-----------------------------------------------------------------------------------------

// Snippet 6:  
class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++){
            System.out.println(i); 
		}
            System.out.println("Done");
    } 
} 
// Error to investigate: Why does "Done" print only once, outside the loop?
// How should the loop body be enclosed to include all statements within the loop? 
// --- Because Loop is not well structured and "Done" Statement is written outside the loop // --- that's why after completing all the iteration it gets print for once at last.

//-----------------------------------------------------------------------------------------

// Snippet 7:  
class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
} 
// Error to investigate: Why does this code produce a compilation error? 
// What needs to be done to initialize the loop variable properly? 
// ---  Because in Java we cannot initialize an empty variable , we nnd to assign
// --- some value to it. Here in code snippet we initialized count without any value.
// --- To initialize the loop variable properly we can assign some value less than 10 .

//-----------------------------------------------------------------------------------------

// Snippet 8:  
class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num <= 5); 
    } 
} 
// Error to investigate: Why does this loop print unexpected numbers?
// What adjustments are needed to print the numbers from 1 to 5?
// --- It should be incrementing not decrementing, and while condition should be (num<=5).

//-----------------------------------------------------------------------------------------

// Snippet 9:  
class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i += 2) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does the loop print unexpected results or run infinitely?
// How should the loop update expression be corrected? 
// --- No, Its working fine its incrementing by 2 there is no infinite result.
// --- Output is 0 2 4

//-----------------------------------------------------------------------------------------

// Snippet 10:  
class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num > 0) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} 
// Error to investigate: Why does the loop execute indefinitely?
// What is wrong with the loop condition?
// --- While loop condition is wrong it should be (num>0) not (num = 10). 

//-----------------------------------------------------------------------------------------

// Snippet 11:  
class IncorrectLoopUpdate { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i += 2; // Error: This may cause unexpected results in output 
        } 
    } 
} 
// Error to investigate: What will be the output of this loop? 
// How should the loop variable be updated to achieve the desired result? 
// -- OUTPUT :- 0 2 4

//-----------------------------------------------------------------------------------------



























