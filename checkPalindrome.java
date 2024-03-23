// import java.util.*;
// import java.lang.*;
// import java.io.*;

import java.util.Scanner;

class Main{
	//This function checks if the given string is a palindrome or not.
	public static boolean checkPalindrome(String a){
		int left = 0;
		int right = a.length()-1;
		while(left <= right){
			if (a.charAt(left) != a.charAt(right)) return false;
			left++;
			right--;
		}
		return true;
	}
	//Main Function
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){

			System.out.println("Please enter your String to check Pallindrome");
			String a = sc.next();
			// int n = 9;
			// String a = "malayalam";
			if (checkPalindrome(a)) System.out.println("Yes");
			else System.out.println("No");
		}
		// sc.close();
	}
}