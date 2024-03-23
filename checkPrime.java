// import java.io.*;
// import java.lang.*;
// import java.util.*;

/*
 * class Main{
	//This function checks wether a particular number is prime or not.
	public static boolean checkPrime(int n){
		for (int i=2;i<=Math.sqrt(n);i++){
			if (n % i == 0) return false;
		}
		return true;
	}
	//Main Function.
	public static void main(String[] args){
		int n = 10;
		if (checkPrime(n)) System.out.println("Yes");
		else{
			System.out.println("No");
		}
	}
}


import java.util.Scanner;

class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Yes");
        }else {
            System.out.print("No");
        }
    }
}

 */

// class Main{
// 	//This function checks wether a particular number is prime or not.
// 	public static boolean checkPrime(int n){
// 		for (int i=2;i<=Math.sqrt(n);i++){
// 			if (n % i == 0) return false;
// 		}
// 		return true;
// 	}
// 	//Main Function.
// 	public static void main(String[] args){
// 		int n = 10;
// 		if (checkPrime(n)) System.out.println("Yes");
// 		else{
// 			System.out.println("No");
// 		}
// 	}
// }


// import java.util.Scanner;

// class Main {
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = Integer.parseInt(sc.next());
//         int count = 0;
//         for(int i=1;i<=n;i++){
//             if(n % i == 0){
//                 count++;
//             }
//         }
//         if(count == 2){
//             System.out.println("Yes");
//         }else {
//             System.out.print("No");
//         }
//     }
// }


import java.util.Scanner;

class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a number to check prime or not ");
        int n = Integer.parseInt(sc.next());
        boolean result = check(n);
        if(result)
        System.out.println("Yes");
        else 
        System.out.println("No");
		sc.close();
    }
    public static boolean check(int n){
        if (n == 0 ){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    } 
}

