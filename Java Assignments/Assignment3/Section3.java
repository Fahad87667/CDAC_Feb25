// SECTION 3: Lamborghini Exercise: 
// 1. Write a program to calculate the sum of the first 50 natural numbers. 

class Question1{
public static void main(String[] args){
	int sum=0;
	for(int i = 1;i<51;i++){		
		sum += i;
	}
	System.out.println(sum);
}}

//-----------------------------------------------------------------------------------------

// 2.Write a program to compute the factorial of the number 10. 

class Question2{
	public static void main(String[] args){
		int num = 10;
		int factorial=1;
		for(int i=1;i<=num;i++){
			factorial*=i;
		}
		System.out.println(factorial);
}}

//-----------------------------------------------------------------------------------------

// 3. Write a program to print all multiples of 7 between 1 and 100. 

class Question3{
public static void main(String[] args){
	for(int i=1;i<=100;i++){
		if(i%7==0){
			System.out.println(i);	
		}
}}}

//-----------------------------------------------------------------------------------------

/* 4. Write a program to reverse the digits of the number 1234. The output should be 4321.*/

class Question4{
public static void main(String[] args){
	int num = 1234;
	int rev = 0;
	int lastdigit = 0;
	while(num>0){
		lastdigit = num%10;
		rev = (rev*10) + lastdigit;
		num /= 10;
	}
	System.out.println(rev);
}}
//-----------------------------------------------------------------------------------------

// 5. Write a program to print the Fibonacci sequence up to the number 21. 

class Question5 {
    public static void main(String[] args) {
        int num1 = 0;
	int num2 = 1;
        System.out.print(num1 + " " + num2);
        
        int next = num1 + num2;
        while (next <= 21) {
            System.out.print(" " + next);
            num1 = num2;
            num2 = next;
            next = num1 + num2;
        }
}}


//-----------------------------------------------------------------------------------------

// 6. Write a program to find and print the first 5 prime numbers. 

class Question6{
public static void main(String[] args){
	int count = 0;
	int num = 2;    // Starting number to check for primality

	while(count<5){
		boolean prime = true;
		
		for(int i=2;i<num;i++){
			if(num%i==0){
				prime = false;
				break;
			}}
		if(prime){
			System.out.println(num);
			count++;
			}
		num++;
	}
}}

//-----------------------------------------------------------------------------------------

/* 7. Write a program to calculate the sum of the digits of the number 9876.
 The output should be 30 (9 + 8 + 7 + 6). 
*/
class Question7{
public static void main(String[] args){
	int num = 9876;
	int sum = 0;
	while(num>0){
		sum += num%10;
		num /= 10;
		}
	System.out.println(sum);
}
}

//-----------------------------------------------------------------------------------------

// 8. Write a program to count down from 10 to 0, printing each number. 

class Question8{
public static void main(String[] args){
	for(int i=10;i>=0;i--){
		System.out.println(i);
}

}}

//-----------------------------------------------------------------------------------------

// 9. Write a program to find and print the largest digit in the number 4825. 

class Question9{
	public static void main(String[] args){
		int num = 4825;
        	int largestdigit = 0;
		while(num>0){
			int lastdigit = num%10;
			if(lastdigit>largestdigit){largestdigit = lastdigit;}
			num/=10;
		}
		System.out.println(largestdigit);
}}
//-----------------------------------------------------------------------------------------

// 10. Write a program to print all even numbers between 1 and 50. 

class Question10{
	public static void main(String[] args){
		for(int i=1;i<=50;i++){
			if(i%2==0){System.out.println(i);}
			}

}}

//-----------------------------------------------------------------------------------------

// 11. Write a Java program to demonstrate the use of both pre-increment and 
// post-decrement operators in a single expression 

class Question11 {
    public static void main(String[] args) {
        int a = 5;
	int b = 10;
        int result = ++a - b--;
        
        System.out.println("Result: " + result);
        System.out.println("Updated a: " + a);
        System.out.println("Updated b: " + b);
    }
}

//-----------------------------------------------------------------------------------------

/* 12. Write a program to draw the following pattern: 
***** 
***** 
***** 
***** 
*****
*/

class Question12{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}	
}}

//-----------------------------------------------------------------------------------------

/* 13. Write a program to print the following pattern: 
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2 
1 
*/

class Question13{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);
				if(j<i){System.out.print("*");}
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(i);
				if(j<i){System.out.print("*");}
			}
			System.out.println();
		}	
}}

//-----------------------------------------------------------------------------------------

/* 14. Write a program to print the following pattern: 
 * 
 ** 
 *** 
 ***** 
 ******* 
 *********
*/

class Question14{
	public static void main(String[] args){
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){System.out.print("*");}
		System.out.println();
		}
}}

//-----------------------------------------------------------------------------------------

/* 15. Write a program to print the following pattern: 
    * 
   ** 
  *** 
 **** 
*****
*/

class Question15{
	public static void main(String[] args){
		int num = 6;
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num-i;j++){ 
				//Printing spaces
				System.out.print(" ");
				}
			for(int k=1;k<=i;k++){
				// printing stars
				System.out.print("*");
				}
		System.out.println();
		}
}}

//-----------------------------------------------------------------------------------------

/* 16. Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
********* 
*/

class Question16{
	public static void main(String[] args){
		int num = 5;
		for(int i=0;i<=num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
		System.out.println();
		}
		
}}

//-----------------------------------------------------------------------------------------

/* 17. Write a program to print the following pattern: 
***** 
 **** 
  *** 
   ** 
    * 

*/
class Question17{
	public static void main(String[] args){
		int num = 5;
		for(int i=num;i>=1;i--){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
		System.out.println();
		}
		
}}

//-----------------------------------------------------------------------------------------
/* 18. Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
  ***** 
   *** 
    * 

*/
class Question18{
	public static void main(String[] args){
		int num = 5;
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
		System.out.println();
		}

		for(int i=num-1;i>=1;i--){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
		System.out.println();
		}
}}	

//-----------------------------------------------------------------------------------------

/*19. Write a program to print the following pattern: 
1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5
*/

class Question19{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);
				if(j<i){System.out.print("*");}
			}
			System.out.println();
		}	
}}

//-----------------------------------------------------------------------------------------

/* 20. Write a program to print the following pattern: 
5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1
*/

class Question20 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
                if (j > i) { // Corrected condition for '*'
                    System.out.print("*");
                }
            }
            System.out.println();
        }   
    }
}
//-----------------------------------------------------------------------------------------

/* 21. Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9 
*/

class Question21{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=(2 * i - 1);j+=2){
				System.out.print(j);
				if(j<(2 * i - 1)){System.out.print("*");}
			}
			System.out.println();
		}	
}}

//-----------------------------------------------------------------------------------------

/* 22. Write a program to print the following pattern: 
********* 
 ******* 
  ***** 
   *** 
    * 
   *** 
  ***** 
 ******* 
********* 
*/

class Question22{
	public static void main(String[] args){
		int num = 5;
		for(int i=num-1;i>1;i--){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
		System.out.println();
		}
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
		System.out.println();
		}


}}	


//-----------------------------------------------------------------------------------------

/* 23. Write a program to print the following pattern: 
11111 
22222 
33333 
44444 
55555
*/

class Question23{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(i);
			}
			System.out.println();
		}	
}}

//-----------------------------------------------------------------------------------------

/* 24. Write a program to print the following pattern:
1 
22 
333 
4444 
55555 
*/

class Question24{
	public static void main(String[] args){
		for(int i=1;i<=5;i+=1){
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}	
}}
 //-----------------------------------------------------------------------------------------

/* 25. Write a program to print the following pattern: 
1
12
123
1234
12345
*/

class Question25{
	public static void main(String[] args){
		for(int i=1;i<=5;i+=1){
			for(int j=1;j<=i;j+=1){
				System.out.print(j);
			}
			System.out.println();
		}	
}}

//-----------------------------------------------------------------------------------------

/* 26. Write a program to print the following pattern:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/
class Question26{
	public static void main(String[] args){
		int num = 1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}	
}}

//-----------------------------------------------------------------------------------------








