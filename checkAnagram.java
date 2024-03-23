// import java.util.*;
// import java.lang.*;
// import java.io.*;
import java.util.Scanner;
import java.util.Arrays;


class Main{
	//This function checks if the two arrays are equal or not.
	public static boolean equalArrays(char[] arr1, char[] arr2, int n, int m){
		// if (arr1.length != arr2.length) return false;
		if (n != m) return false;

		// for (int i=0;i<arr1.length;i++){
		for (int i=0;i<n;i++){
			if (arr1[i] != arr2[i]) return false;
		}
		return true;
	}
	//This function checks if the two strings are anagrams of each other.
	public static boolean checkAnagram(String a,String b, int n, int m){
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return equalArrays(arr1,arr2,n,m);
	}
	//Main Function
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of First String");
		int n = Integer.parseInt(sc.next());
		System.out.println("Enter Length of Second String");
		int m = Integer.parseInt(sc.next());
		System.out.println("Write First String");
		String a = sc.next();
		System.out.println("Write Second String");
		String b = sc.next();
		
		// int n = 4;
		// String a = "abcd";
		// int m = 4;
		// String b = "adcb";
		if (checkAnagram(a,b,n,m)) System.out.println("Yes");
		else{
			System.out.println("No");
		}
		sc.close();
	}
}
