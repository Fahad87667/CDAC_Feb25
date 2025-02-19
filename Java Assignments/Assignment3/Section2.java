// Section 2: Java Programming with Conditional Statements 

/* Question 1: Grade Classification  
Write a program to classify student grades based on the following criteria: 
 If the score is greater than or equal to 90, print "A" 
 If the score is between 80 and 89, print "B" 
 If the score is between 70 and 79, print "C" 
 If the score is between 60 and 69, print "D" 
 If the score is less than 60, print "F"
*/

class Section2_Question1{
public static void main(String args[]){
int score = 83;
if(score>=90){System.out.println("A");}
else if(score>80 && score<89){System.out.println("B");}
else if(score>70 && score<79){System.out.println("C");}
else if(score>60 && score<69){System.out.println("D");}
else{System.out.println("F");}
}
}

//-----------------------------------------------------------------------------------------

/* Question 2: Days of the Week  
Write a program that uses a nested switch statement to print out the day of the week
based on an integer input (1 for Monday, 2 for Tuesday, etc.). 
Additionally, within each day, print whether it is a weekday or weekend. 
*/

class Section2_Question2{
public static void main(String args[]){
	int day = 4;
	switch(day){
		case 1:
			System.out.println("Weekday -- Monday");
			break;
		case 2:
			System.out.println("Weekday -- Tuesday");
			break;
		case 3:
			System.out.println("Weekday -- Wednesday");
			break;
		case 4:
			System.out.println("Weekday -- Thursday");
			break;
		case 5:
			System.out.println("Weekday -- Friday");
			break;
		case 6:
			System.out.println("Weekend -- Saturday");
			break;
		case 7:
			System.out.println("Weekend -- Sunday");
			break;
		default:
			System.out.println("Enter Valid Day");

}}}

//-----------------------------------------------------------------------------------------

/* Question 3: Calculator  
Write a program that acts as a simple calculator. It should accept two numbers
and an operator (+, -, *, /) as input. 
Use a switch statement to perform the appropriate operation. Use nested if
else to check if division by zero is attempted and display an error message. 
*/

class Section2_Question3{
public static void main(String[] args){
	int a = 20;
	int b = 10;
	String operator = "/";
	switch(operator){
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			if(b==0){
				System.out.println(" ZeroDivisionError ");
			}else{
				System.out.println(a/b);}
			break;
}}}

//-----------------------------------------------------------------------------------------

/* Question 4: Discount Calculation  
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%. 

*/

class Section2_Question4{
public static void main(String[] args){
	int total_purchase = 1111;
	char membership = 'N';
	if(total_purchase>=1000){
		if(membership == 'Y'){
			System.out.println(total_purchase+total_purchase*0.25);
		}else{
			System.out.println(total_purchase+total_purchase*0.2);
		}
		}
	else if(total_purchase>=500 && total_purchase<=999){
		if(membership == 'Y'){
			System.out.println(total_purchase+total_purchase*0.15);
		}else{
			System.out.println(total_purchase+total_purchase*0.1);
		}
		}
	else{
		if(membership == 'Y'){
			System.out.println(total_purchase+total_purchase*0.10);
		}else{
			System.out.println(total_purchase+total_purchase*0.05);
		}
		}
}
}

//-----------------------------------------------------------------------------------------

/* Question 5: Student Pass/Fail Status with Nested Switch 
Write a program that determines whether a student passes or fails based on their grades 
in three subjects. If the student scores more than 40 in all subjects, they pass. 
If the student fails in one or more subjects, 
print the number of subjects they failed in. 
*/

class Section2_Question5 {
public static void main(String[] args) {
        int Maths = 32;
        int Physics = 42;
        int Chem = 54;
        String result;

        if (Maths > 40 && Physics > 40 && Chem > 40) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        switch (result) {
            case "Pass":
                System.out.println("Student passes.");
                break;
            case "Fail":
                int failCount = 0;
                if (Maths <= 40) failCount++;
                if (Physics <= 40) failCount++;
                if (Chem <= 40) failCount++;
                System.out.println("Student fails in " + failCount + " subject.");
                break;
            default:
                System.out.println("Invalid result.");

}}}

//-----------------------------------------------------------------------------------------





















