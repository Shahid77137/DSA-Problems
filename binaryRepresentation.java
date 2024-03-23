// import java.io.*;
// import java.lang.*;

import java.util.Scanner;
import java.util.Arrays;

class Main{
	//This function changes the array into the string.
	public static String arrayToString(int[] arr){
		StringBuffer ans = new StringBuffer();
		for(int i=0;i<arr.length;i++)ans.append(arr[i]);
		return ans.toString();
	}
	//This function converts a number into its binary representation.
	public static String binaryRepresentation(int n){
		int[] arr = new int[32]; 
		Arrays.fill(arr,0); //Filling the entire arrays with a default value of 0.
		int len = arr.length-1;
		while(n > 0){
			int temp = n % 2;
			arr[len] = temp;
          	len--;
			n = n/2;
		}
		String ans = arrayToString(arr);
		return ans;

	}
	//Main Function
	public static void main(String[] args){
		// int n = 7;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number here for binary representation");
		int n = Integer.parseInt(sc.next());
		String ans = binaryRepresentation(n);
      	System.out.println(ans);	
		sc.close();
	}

}
