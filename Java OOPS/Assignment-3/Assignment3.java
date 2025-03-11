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


/*
12. Write a program to accept 20 integer numbers in a single Dimensional Array. Find and
Display the following:
○ Number of even numbers.
○ Number of odd numbers.
○ Number of multiples of 3
*/