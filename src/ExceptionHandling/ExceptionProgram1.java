package ExceptionHandling;

import java.util.Scanner;

public class ExceptionProgram1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
try {
    System.out.println("Enter first no :");
    int a = sc.nextInt();
    System.out.println("Enter Second no : ");
    int b=sc.nextInt();
    int c = a / b;
    System.out.println("Result : " + c);
}
catch(ArithmeticException e){
    System.out.println(e);
        }
        System.out.println("Remaining Code");

    }
}

