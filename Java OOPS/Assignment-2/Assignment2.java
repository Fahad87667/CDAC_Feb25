/*
		1. Arithmetic & Assignment Operators 
Q1:  Write a program to swap two numbers  without using a third variable  and without 
using arithmetic operators like  +  or  -  . 
Hint  : Use bitwise XOR  ^  operator.
*/
import java.util.*;

class Ques1{
    public static void main(String[] args) {
	int a = 5;
	int b = 9;
	
	System.out.println("Before swap: a= "+a+",b = "+b);
	
	a = a^b;
	b = a^b;
	a = a^b;
	
	System.out.println("Before swap: a= "+a+",b = "+b);

	}
}

/*
Q2:  Write a program to check whether a given number is  even or odd  using only  bitwise 
operators  . 
Hint  : Use  n & 1  to check.
*/
class Ques2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String result = ((a&1)==0)?"It is an Even number":"It is an odd number";
		System.out.println(result);
		sc.close();
	}
}

/*
Q3:  Implement a program that calculates the  sum of digits  of an integer using  modulus 
(  %  ) and division (  /  ) operators  . 
*/

class Ques3{
	public static void main(String args[]){
        System.out.print("Enter Number: ");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		while(a!=0){
			sum += a%10;
			a /= 10;
		}
        System.out.println(sum);

	}
}

/*
Q4:  Write a program to find whether a given number is  divisible by 3  without using the 
modulus (  %  ) or division (  /  ) operators. 
Hint  : Use  subtraction and bitwise shifts 
*/

class Ques4{
	public static void main(String args[]){
		System.out.print("Enter Num: ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a>3){
			a = a - (a >> 2)*3;
		}
		String result = ((a==0 || a==3)?"True":"False");
		
		System.out.println(result);
	}
}

/*
Q5:  Write a Java program to  swap two numbers  using the  +=  and  -=  operators only. 
*/

class Ques5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a += b; // a now becomes 15 (5 + 10)
        b = a - b; // b becomes 5 (15 - 10)
        a -= b; // a becomes 10 (15 - 5)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

//---------------------------------------------------------
/*
 2. Relational & Logical Operators 
Q6:  Write a program to find the  largest of three numbers  using only the  ternary operator 
(  ? :  )  .
*/

class Ques6{
	public static void main(String args[]){
		int a = 10;
		int b = 12;
		int c = 19;
		
		int result = ((a>b && a>c)?a:(b>a && b>c)?b:c);
		System.out.println(result);
	}
}

/*
Q7:  Implement a Java program that checks whether a given year is a  leap year or not  using 
logical (  &&  ,  ||  ) operators 
*/

class Ques7{
	public static void main(String args[]){
		int year = 2000;
		if((year%400 == 0)||(year%4 == 0)&&(year%100 != 0)){
			System.out.println("Leap Year");
		}else{
			System.out.println("Not a Leap Year");
		}
	}
}

/*
Q8:  Write a program that  takes three boolean inputs  and prints  true  if at least two of 
them are  true  . 
Hint  : Use logical operators (  &&  ,  || 
*/

class Ques8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		boolean a = sc.nextBoolean();
		boolean b = sc.nextBoolean();
		boolean c = sc.nextBoolean();
		
		boolean result = (((a&b&c == true)||(a&b == true)||(a&c == true)||(b&c==true))?true:false);
		
		System.out.println("Result is: "+result);
	}
}

/*
Q9:  Implement a Java program that checks if a number is  within a specific range (20 to 
50)  without using  if-else  . 
Hint  : Use  logical AND (  &&  ) in a print statement  . 
*/

class Ques9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		boolean range = (a>=20) && (a<=50);
		
		System.out.println(a+(range?" is in range.":" is Not in range."));
		
		sc.close();
		
	}
}

/*
Q10:  Write a program to determine if a  character is a vowel  or a consonant using the 
ternary operator. 
*/

class Ques10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		String result = (((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')||(a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U'))?"Vowel":"Consonant");
		
		System.out.println(a+" is a "+result);
		
		sc.close();
		
	}
}

//---------------------------------------------------------

/*	3. Bitwise Operators 
Q11:  Write a program to check if a given number is a  power of 2  using bitwise operators. 
Hint  :  n & (n - 1) == 0  for positive numbers. 
*/


/*
Q12:  Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
Hint  : Use bitwise left shift (  <<  ). 
*/

class Ques12{
	public static void main(String args[]){
		
		int a = 2;
		int result = a<<3; // a*2^3  // 2^3=8
		System.out.println(result);
	}
}

/*
Q13:  Implement a Java program to find the  absolute value  of an integer using bitwise 
operators. 
Hint  :  mask = num >> 31; abs = (num + mask) ^ mask; 
*/

class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int mask = num >> 31;

        int absValue = (num + mask) ^ mask;

        System.out.println("The absolute value of " + num + " is: " + absValue);

        sc.close();
    }
}

/*
Q14:  Write a program to count the  number of 1s (set bits)  in a binary representation of a 
number using bitwise operations. 
Hint  : Use  n & (n - 1) 
*/

class Ques14{
	public static void main(String[] args){
		int count = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int copy = a;
		while (a>0){
			a = a & (a-1);
			count++;
		}
		
		System.out.println("Total number of 1s (set bits) in a binary representation of "+copy+" is "+count);
	}
}

/*
Q15:  Implement a program to swap  odd and even bits  of a number using bitwise 
operators. 
Hint  : Use masks:  (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1 
*/

class Ques15 {
    public static void main(String[] args) {
		
        System.out.println("Enter Number: ");
		
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        System.out.println("Before swapping bits: " + x);
        
        int evenbits = x & 0xAAAAAAAA; // Extract even bits
        int oddbits = x & 0x55555555;  // Extract odd bits
        
        evenbits >>= 1; // Right shift even bits
        oddbits <<= 1;  // Left shift odd bits
        
        int result = evenbits | oddbits; // Combine the shifted bits
        
        System.out.println("After swapping bits: " +result);
        
        sc.close();
    }
}

/*
4. Ternary Operator Challenges 
Q16:  Write a program that determines whether a given number is  positive, negative, or 
zero  using only the  ternary operator .
*/

class Ques16{
	public static void main(String[] args){
		System.out.println("Enter num: ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		String result = ((a>0)?"Positive Number.":(a<0)?"Negative Number.":"It's a Zero.");
		System.out.println(result);
		
		sc.close();
	}
	
}

/*
Q17:  Implement a Java program that finds the  minimum of four numbers  using nested 
ternary operators.
*/

class Ques17{
	public static void main(String[] args){
		int a = 21;
		int b = 211;
		int c = 135;
		int d = 201;
		
		int result = ((a>(b&c&d))?a:(b>(a&c&d))?b:(c>(a&b&d))?c:d);
		
		System.out.println("Greates number: "+result);
		
		
	}
}

/*
Q18:  Given a student’s percentage, print  “Pass”  if the percentage is 40 or above; 
otherwise, print  “Fail”  , using only the ternary operator. 
*/

class Ques18{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println(((a>=40)?"Pass":"Fail"));
	}
}

/*
  Write a Java program that checks whether a character is  uppercase, lowercase, or 
not a letter  using only the ternary operator.
*/


class Ques19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = (Character.isLetter(ch)) ?
                           ((Character.isUpperCase(ch)) ? "Uppercase" : "Lowercase")
                           : "Not a letter";

        System.out.println(ch + " is " + result);
        sc.close();
    }
}

/*
Q20:  Implement a Java program that  returns the absolute value  of a given number using 
the ternary operator (without using  Math.abs().
*/



