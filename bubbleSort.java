// import java.io.*;
// import java.lang.*;
// import java.util.*;
import java.util.Scanner;
import java.util.Arrays;


class bubbleSort{
	//This function swaps two elements in the array.
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//This function implements bubble sort.
	public static int[] bubbleSort(int[] arr,int n){
		for (int i=0;i<n;i++){
			int count = 0;
			for (int j=0;j<n-i-1;j++){
				if (arr[j] > arr[j+1]){
					swap(arr,j,j+1);
					count++;
				}
			}
			if (count == 0){
				return arr;	
			}
		}
		return arr;	
	}
	//Main Function
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your arrays length");
		int n = Integer.parseInt(sc.next());
		System.out.println("Please Enter your Array ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(sc.next());
		}
		// int n = 5;
		// int[] arr = {5,1,6,3,7};
		bubbleSort(arr,n);
		for (Integer i : arr) System.out.print(i + " ");
		System.out.println(Arrays.toString(arr));	
	}
}



