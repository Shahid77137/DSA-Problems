// import java.lang.*;
// import java.io.*;
// import java.util.*;

/*
 * class Main{
	//This function prints the elements according to the condition mentioned in the question.
	public static void fizzBuzz(int n){
		for (int i=1;i<=n;i++){
			if (i % 3 == 0 && i % 5 == 0) System.out.print("FizzBuzz" + " ");
			else if (i % 3 == 0) System.out.print("Fizz" + " ");
			else if (i % 5 == 0) System.out.print("Buzz" + " ");
			else{
				System.out.print(i + " ");
			}
		}
	}
	//Main Function
	public static void main(String[] args){
		int n = 10;
		fizzBuzz(n);
	}
}
// 2nd Way of doing this
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = Integer.parseInt(sc.next());
        for (int i=1;i<=n;i++){
            
            if(i % 3 == 0 && i % 5 == 0)
            System.out.println("FizzBuzz");
            else if (i % 3 == 0)
            System.out.println("Fizz");
            else if (i % 5 == 0)
            System.out.println("Buzz");
            else
            System.out.println(i);
        }
    }
}
 */

// class Main{
// 	//This function prints the elements according to the condition mentioned in the question.
// 	public static void fizzBuzz(int n){
// 		for (int i=1;i<=n;i++){
// 			if (i % 3 == 0 && i % 5 == 0) System.out.print("FizzBuzz" + " ");
// 			else if (i % 3 == 0) System.out.print("Fizz" + " ");
// 			else if (i % 5 == 0) System.out.print("Buzz" + " ");
// 			else{
// 				System.out.print(i + " ");
// 			}
// 		}
// 	}
// 	//Main Function
// 	public static void main(String[] args){
// 		int n = 10;
// 		fizzBuzz(n);
// 	}
// }
// // 2nd Way of doing this
// import java.util.Scanner;

// class Main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         int n = Integer.parseInt(sc.next());
//         for (int i=1;i<=n;i++){
            
//             if(i % 3 == 0 && i % 5 == 0)
//             System.out.println("FizzBuzz");
//             else if (i % 3 == 0)
//             System.out.println("Fizz");
//             else if (i % 5 == 0)
//             System.out.println("Buzz");
//             else
//             System.out.println(i);
//         }
//     }
// }
// 3nd Way of doing this

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            String output = (i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : "");
            System.out.println(output.isEmpty() ? i : output);
        }
        sc.close();
    }
}
