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
