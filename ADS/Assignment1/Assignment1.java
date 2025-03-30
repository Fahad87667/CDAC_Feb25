import java.util.*;
/*
Problem 2:
Write a program that performs the following operations on strings:
1. Check whether two given strings are anagrams of each other.
2. Identify the longest word in a given sentence.
3. Count the number of vowels and consonants in the same sentence.
Input:
String 1: listen
String 2: silent
Sentence: Practice makes a man perfect
Output:
Are 'listen' and 'silent' anagrams? true
Longest word: Practice
Vowels: 9, Consonants: 17
*/

class Assignment1{
	
	static int secondlargest(int[] arr){
		int largest = Integer.MIN_VALUE;
		int sec = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				sec = largest;
				largest = arr[i];
			}else if(arr[i]>sec && arr[i]!=largest){
				sec = arr[i];
			}
		}
		return sec;
	}
	
	static void zeroestoend(int[] arr){
		int index = 0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]!=0){
				arr[index++] = arr[i];
			}
		}
		while(index<arr.length){
			arr[index++] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	static void anagram(String str1,String str2){
		if (str1.length()!= str2.length()){
			System.out.println("NOT ANAGRAMS");
		}
		
		int[] letters = new int[26];
		
		for(int i=0;i<str1.length();i++){
			letters[str1.charAt(i)-'a']++;
			letters[str2.charAt(i)-'a']--;
		}
		
		for(int cnt: letters){
			if(cnt!=0){System.out.println("NOT ANAGRAMS");}
		}
		System.out.println("they are ANAGRAMS");
	}
	
	static String longestword(String str){
		String[] words = str.split(" ");
		String longest = "";
		
		for(String word: words){
			if(word.length() > longest.length()){
				longest = word;
			}
			
		}return longest;
	}
	
	static void vowelsconsonents(String str){
		int vcnt = 0;
		int ccnt = 0;
		
		str = str.toLowerCase();
		str = str.replaceAll(" ","");
		//char[] ch = new char(str);
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'){
				vcnt++;
			}else{
				ccnt++;
			}
		}
		System.out.println("Total vowels: "+vcnt+"\nTotal consonents: "+ccnt);
	}
	/*Problem 3:
	Given a sorted array of integers (which may include duplicates), perform the following
	operations:
	1. Search for a given key and return its index (if found) with Binary Search.
	2. Find the first and last occurrence of the key in the array.
	3. Count the total number of times the key appears.
	4. Find any peak element in the array (an element greater than its neighbors).
	Input:
	arr = [1, 3, 3, 3, 5, 6, 8], key = 3
	Input for Peak Element:
	arr =[1, 2, 18, 4, 5, 0]
	Output:
	Key found at index: 2
	First occurrence: 1
	Last occurrence: 3
	Total count of key: 3 */
	
	
	public static void main(String[] args){
		int[] a = {10, 0, 5, 20, 0, 8, 15};
		String b = "listen";
		String c = "silent";
		System.out.println(secondlargest(a));
		zeroestoend(a);
		anagram(b,c);
		System.out.println(longestword("Practice makes a man perfect"));
		vowelsconsonents("Practice a");

	}
}



