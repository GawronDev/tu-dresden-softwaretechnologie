/*
Java and Functions
In this exercise, you're going to write a simple program which calculates the factorial of a given number.

Complete the implementation of the given Functions class by following these steps:

 Add a skeleton of the factorial method No results
The class must contain a public static method factorial(int n) with a return type of int.

 Factorial of zero and one No results
The factorial(…) method should return the right values for 
0
!
0! and 
1
!
1!, respectively. By convention, 
0
!
=
1
0!=1 and 
1
!
=
1
1!=1.

 Factorial of other natural numbers No results
The factorial(…) method should be able to compute the factorial for numbers greater than one. The factorial of a number 
�
n, denoted by 
�
!
n!, is the product of all integers from 
�
n to 
1
1. For example, 
5
!
=
5
∗
4
∗
3
∗
2
∗
1
=
120
5!=5∗4∗3∗2∗1=120.

Please note: to keep this exercise simple, we ignore the fact that the largest factorial that the int return type can hold is 
12
!
12! (
13
!
13! is already greater than 
2
31
−
1
2 
31
 −1).

Optionally, add a main method to the Functions class to check your implementation:

public static void main(String[] args) {
    System.out.println("The factorial of 5 is:");
    System.out.println(factorial(5));
}
It should print:

The factorial of 5 is:
120
to the console.

 */


public class java_and_functions {
    public static void main(String[] args) {
        System.out.println("The factorial of 5 is:");
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        if(n < 0){
            return 0;
        }

        if(n == 0){
            return 1;
        }

        int result = 1;
        for(int i = n; i > 0; i--){
            result = result * i;
        }
        return result;
    }
}
