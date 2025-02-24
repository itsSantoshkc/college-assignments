package main;
import java.util.Scanner;

class Main{
 public static void main(String []args){
    Scanner scan = new Scanner(System.in);

    int a = 0,b = 0,c =0;

    System.out.println("Enter a number");

    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();

    if((a >=b && a <= c) || (a >= c && a <= b)){
      System.out.println("Middle number : " + a);
  }else if((b >= a && b<= c) || (b >= c && b<= a) ){
      System.out.println("Middle number : " + b);
    }else{
      System.out.println("Middle number : " + c);
    }
}}
