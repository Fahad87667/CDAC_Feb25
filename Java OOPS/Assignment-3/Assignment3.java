import java.util.Scanner;
/*
1. Find the Largest and Smallest Element
○ Given an array, find the smallest and largest elements in it
*/

class Ques1{
	public static void main(String[] args){
		int[] arr = {2,3,5,1,6,4,8};
		for (int a: arr){
			System.out.print(" "+a);
		}
		System.out.println();
		
		int last = 0;
		int small = 0;
		int largest = 0;
		
		for (int i=0;i<arr.length;i++){
			if (arr[last]<arr[i]){
				largest = arr[i];
			}else{
				small = arr[i];
			}
		}
		System.out.println("Largest Element: "+largest+"\nSmallest Element: "+small);
	}
}

/*
2. Reverse an Array
○ Reverse the given array in place
*/

class Ques2{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		for (int a: arr){
			System.out.print(" "+a);
		}
		
		System.out.println();
		
		int n = arr.length;
		int j = n-1;
		
		for(int i=0;i<n/2;i++){ // Till mid only
			int temp = arr[i]; 
			arr[i] = arr[j]; 
			arr[j] = temp;
			j-=1;
		}
		
		for (int a: arr){
			System.out.print(" "+a);	
		}
	}
}

/*
3. Find the Second Largest Element
○ Find the second-largest element in the given array.
*/

class Ques3{
	public static void main(String[] args){
        int[] arr = {10, 20, 5, 30, 25};
		for (int a: arr){
			System.out.print(" "+a);
		}
		
		System.out.println();
		
		int largest = 0;
		int secondLargest = 0;
		int n = arr.length;
		int j = n-1;
		
		for(int i=0; i<n ;i++){
			if (arr[0]<arr[i]){
				largest = arr[i];
			}
		}
		
		for (int i=0; i<arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
		
		System.out.println("Second Largest: "+secondLargest);
		
	}
}

/*
4. Count Even and Odd Numbers
○ Count the number of even and odd numbers in an array.
*/

class Ques4{
	public static void main(String[] args){

		int[] arr = {10, 20, 5, 30, 25};
		int countOdd = 0;
		int countEven = 0;
		
		for (int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				countEven+=1;
			}else{
				countOdd += 1;
			}
		}
		System.out.println("Even Numbers: "+countEven+"\nOdd Numbers: "+countOdd);

	}
}

/*
5. Find Sum and Average
○ Compute the sum and average of all elements in the array
*/

class Ques5{
	public static void main(String[] args){

		int[] arr = {10, 20, 5, 30, 25};
		for(int a: arr){
			System.out.print(" "+a);
		}
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
			avg = sum/arr.length;
		}
		
		System.out.println("Sum: "+sum+"\nAverage: "+avg);
	}
}

/*
6. Remove Duplicates from a Sorted Array
○ Remove duplicate elements from a sorted array without using extra space.
*/

class Ques6{
	public static void main(String[] args){

		int[] arr = {1,1,1,1,1,2,2,2,3,3,3,4,4,4,5};
		
		for(int a: arr){
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		
		int n = arr.length;
		int j = 0;
		
		for(int i=0; i < n; i++){
			if (arr[j]!=arr[i]){
				j++;
				arr[j] = arr[i];
			}
		}
		
		for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
		}
	}
}

/*
7. Rotate an Array
○ Rotate the array to the right by k positions.
*/

/* 
8. Merge Two Sorted Arrays
○ Merge two sorted arrays into a single sorted array without using extra space
*/

class Ques8 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 8};
        int[] arr2 = {5, 6, 7, 8, 9};

        int n = arr1.length, m = arr2.length;
        int[] arr3 = new int[n + m]; // New array to store merged result
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) { // Merge both arrays
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        while (i < n) { // Copy remaining elements of arr1
            arr3[k++] = arr1[i++];
        }

        while (j < m) { // Copy remaining elements of arr2
            arr3[k++] = arr2[j++];
        }

        // Print merged array
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
}

/*
9. Find Missing Number in an Array
○ Given an array of size n-1 containing numbers from 1 to n, find the missing number
*/

class Ques9{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		
		int n = arr.length+1;
		int sum = n*(n+1)/2;
		int sum_arr = 0;
		
		for(int i=0; i < arr.length; i++){
			sum_arr += arr[i];
		}
		
		int missing_num = sum-sum_arr;
		
		System.out.println(missing_num);
	}
}

/*
10. Find Intersection and Union of Two Arrays
○ Find the intersection and union of two unsorted arrays.
*/

class Ques10 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 3};

        int[] union = new int[arr1.length + arr2.length];
        int unionIndex = 0;

        // Copy arr1 into union
        for (int i = 0; i < arr1.length; i++) {
            union[unionIndex++] = arr1[i];
        }

        // Copy unique elements of arr2 into union
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    break; // If found, exit loop
                }
                // If the loop completes without breaking, arr2[i] is not in arr1
                if (j == arr1.length - 1) {
                    union[unionIndex++] = arr2[i];
                }
            }
        }

        // Print Union
        System.out.print("Union: ");
        for (int i = 0; i < unionIndex; i++) {
			System.out.print(union[i] + " ");
		}

        System.out.println();

        // Find and print Intersection
        System.out.print("Intersection: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}

/*
11. Find a Subarray with Given Sum
○ Given an array of integers, find the subarray that sums to a given value S.
*/

class Ques11 {
    public static void findSubarray(int[] arr, int S) {
        int start = 0;
		int sum = 0;
		boolean found = false;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > S){ 
                sum -= arr[start++];
			}

            if (sum == S) {
				for (int i = start; i <= end; i++){
					System.out.print(arr[i] + " ");
				}
				found = true;
				System.out.println();  // Print new line
			}
			
        }
		if (!found){
			System.out.println("-1"); // If no subarray found
		}
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int S = 33;
        findSubarray(arr, S);
    }
}

/*
12. Write a program to accept 20 integer numbers in a single Dimensional Array. Find and
Display the following:
○ Number of even numbers.
○ Number of odd numbers.
○ Number of multiples of 3
*/

class Ques12{
	
	static void even(int[] arr){
		System.out.print("Even Numbers: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	static void odd(int[] arr){
		System.out.print("Odd Numbers: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	static void Multiplesof3(int[] arr){
		System.out.print("Multiples of 3: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3==0){
				
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		
		for(int a=0;a<arr.length;a++){
			arr[a] = sc.nextInt();
		}
		
		Ques12.even(arr);
		Ques12.odd(arr);
		Ques12.Multiplesof3(arr);
		
		sc.close();
	}
}
/*
13. Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class
students in a single Dimensional Array. Find and display the following:
○ Number of students securing 75% and above in aggregate.
○ Number of students securing 40% and below in aggregate
*/



/*
14. Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. Transfer
and store all the even numbers in an array even[ ] and all the odd numbers in another array
odd[ ]. Finally, print the elements of the even & the odd array.
*/

class Ques14{
	
	static void even(int[] arr){
		System.out.print("Even Numbers: [ ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("]");
	}
	
	static void odd(int[] arr){
		System.out.print("Odd Numbers: [ ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("]");
	}
	
	static void Multiplesof3(int[] arr){
		System.out.print("Multiples of 3: [ ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3==0){
				
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		
		for(int a=0;a<arr.length;a++){
			arr[a] = sc.nextInt();
		}
		
		Ques14.even(arr);
		Ques14.odd(arr);
		Ques14.Multiplesof3(arr);
		
		sc.close();
	}
}

/*
15. Write a Java program to print all sub-arrays with 0 sum present in a given array of integers.
Example:
Input :
nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 }
nums2 = { 1, 2, -3, 4, 5, 6 }
nums3= { 1, 2, -2, 3, 4, 5, 6 }
Output:
Sub-arrays with 0 sum : [1, 3, -7, 3]
Sub-arrays with 0 sum : [3, -7, 3, 2, 3, 1, -3, -2]
Sub-arrays with 0 sum : [1, 2, -3]
Sub-arrays with 0 sum : [2, -2]
*/

class Ques15 {
    public static void subarrsum(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];  // Add elements from i to j
                
                if (sum == 0) {  // If sum becomes 0, print the subarray
                    System.out.print("Sub-array with 0 sum: [");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println("]");
                }
            }
        }
    }

    public static void main(String[] args) {
		
        int[] nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
		
        subarrsum(nums1);

    }
}

/*
18. Print a Matrix
○ Given an m x n matrix, print all its elements row-wise.
*/
class Ques18{
	public static void main(String[] args){
	int[][] arr = {{1,2,3},{4,5,6}};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

/*
19. Transpose of a Matrix
○ Given a matrix, return its transpose (swap rows and columns).
*/
class Ques19 {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3}, {4, 5, 6} };
        int rows = arr.length;
		int cols = arr[0].length;
        int[][] temp = new int[cols][rows]; 

        // Compute transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                temp[j][i] = arr[i][j]; // Swap row & column indices
            }
        }

        // Print transposed matrix
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
20. Sum of Two Matrices
○ Given two matrices of the same size, compute their sum.
*/

class Ques20 {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3}, {4, 5, 6} };
		int sum = 0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}

/*
21. Row-wise and Column-wise Sum
○ Find the sum of each row and each column of a given matrix.
*/

class Ques21 {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3}, {4, 5, 6} };
        int rows = arr.length;
        int cols = arr[0].length;

        // Row-wise Sum
        System.out.println("Row-wise Sum:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }
		System.out.println();

        // Column-wise Sum
        System.out.println("Column-wise Sum:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
    }
}
