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

    if(a >=b && b >= c){
      System.out.println("Max number : " + a);
  }else if(b >= a && b>= c){
      System.out.println("Max number : " + b);
    }else{
      System.out.println("Max number : " + c);
    }
}}
