// import java.io.*;
// import java.lang.*;
// import java.util.*;
import java.util.Scanner;


class Main{
	//This function finds out if the given number is a power of two or not.
	public static boolean powerOfTwo(int n){
		int count = 0;
		while(n > 0){
			if (n % 2 == 1) count++;
			n = n/2;
		}
		return count == 1;
	}
	//Main Function
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a number to check Whether the number is power of Two or Not");
		int n = Integer.parseInt(sc.next());
		// int n = 4;
		if (powerOfTwo(n)) System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
}

