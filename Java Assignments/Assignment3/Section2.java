// SECTION 2: GUESS THE OUTPUT

// Snippet 1:  
class NestedLoopOutput { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 3; i++) { 
            for (int j = 1; j <= 2; j++) { 
                System.out.print(i + " " + j + " "); 
            } 
            System.out.println(); 
 
        } 
    } 
} 

// Guess the output of this nested loop.

/* Dry Run 

	i	j	Output
Iteration 1:
	1	1	
		2	1 1 1 2
Iteration 2:
	2	1	
		2	2 1 2 2
Iteration 3:
	3	1	
		2	3 1 3 2
	
*/
//-----------------------------------------------------------------------------------------

// Snippet 2:  
class DecrementingLoop { 
    public static void main(String[] args) { 
        int total = 0; 
        for (int i = 5; i > 0; i--) { 
            total += i; 
            if (i == 3) continue; 
            total -= 1; 
        } 
        System.out.println(total); 
    } 
} 
// Guess the output of this loop.

/* 
Dry Run

Iteration 1:	i	total+=i	total-=1
		5	0+5 = 5		5-1 = 4
Iteration 2:
		4	4+4 = 8		8-1 = 7
Iteration 3:
		3	7+3 =		(i ==3 , skip total -= 1)continue
		10
Iteration 4:
		2	10+2 = 12	12-1 = 11
Iteration 5:
		1	11+1 = 12	12-1 = 11

OUTPUT => 11

*/
//-----------------------------------------------------------------------------------------

// Snippet 3:  
class WhileLoopBreak { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 5) { 
            System.out.print(count + " "); 
            count++; 
            if (count == 3) break; 
        } 
        System.out.println(count); 
    } 
} 
// Guess the output of this while loop. 

/* Dry Run
		
		count 
Iteration 1:	0
Iteration 2:	1
Iteration 3:	2
Iteration 4:	3	break
Iteration 5:	-

Count => 0 1 2 3 


*/
//-----------------------------------------------------------------------------------------

// Snippet 4:  
class DoWhileLoop { 
    public static void main(String[] args) { 
        int i = 1; 
        do { 
            System.out.print(i + " "); 
            i++; 
        } while (i < 5); 
        System.out.println(i); 
    } 
} 
// Guess the output of this do-while loop. 

/* Dry Run 
		i++	Checking(i<5)
Iteration 1:	1 		1
Iteration 2:	2 		2	
Iteration 3:	3 		3
Iteration 4:	4 		4
Iteration 5:	5		False
			printing the final i value = 5

Output=> 1 2 3 4 5

*/

//-----------------------------------------------------------------------------------------

// Snippet 5:  
class ConditionalLoopOutput { 
    public static void main(String[] args) { 
        int num = 1; 
        for (int i = 1; i <= 4; i++) { 
            if (i % 2 == 0) { 
                num += i; 
            } else { 
                num -= i; 
            } 
        } 
        System.out.println(num); 
    } 
} 
// Guess the output of this loop. 

/* Dry Run	(i%2==0)
		if (num+i)	else (num-i)	num
Iteration 1:	-----		1-1 = 0		0
Iteration 2:	0+2 = 2		-----		0+2=2
Iteration 3:	-----		2-3=0		-1
Iteration 4:	-1+4= 3		-----		3

Output => 3
*/
//-----------------------------------------------------------------------------------------

// Snippet 6:  
class IncrementDecrement { 
    public static void main(String[] args) { 
        int x = 5; 
        int y = ++x - x-- + --x + x++; 
        System.out.println(y); 
    } 
} 
// Guess the output of this code snippet. 

/*Dry Run 

x = 5
y = 6 - 6 + 5 + 3 = 8

*/
//-----------------------------------------------------------------------------------------

// Snippet 7:  
class NestedIncrement { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = ++a * b-- - --a + b++; 
        System.out.println(result); 
	System.out.println(a);
	System.out.println(b);
    } 
} 
// Guess the output of this code snippet. 

// Output = 49

// Dry Run

/*

a = 10
b = 5
result = 11 * 5 - 10 + 4 = 49
a = 10
b = 5

*/

//-----------------------------------------------------------------------------------------

// Snippet 8:  
class LoopIncrement { 
    public static void main(String[] args) { 
        int count = 0; 
        for (int i = 0; i < 4; i++) { 
            count += i++ - ++i; 
        } 
        System.out.println(count); 
    } 
} 
// Guess the output of this code snippet. 


// Dry Run
/*
		i		count
Iteration 0:	0 - 1 = -1	0+(-1) = -1
Iteration 1:	1 - 2 = -1	-1-1 = -2
Iteration 2:	2 - 3 = -1	-2-1 = -3
Iteration 3:	3 - 4 = -1	-3-1 = -4

	Output = -4.

*/

//-----------------------------------------------------------------------------------------











































