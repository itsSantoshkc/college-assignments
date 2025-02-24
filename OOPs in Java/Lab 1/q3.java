package main;

import java.util.Scanner;

class Main{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int a = 0,b = 0;
System.out.println("Enter two number");
    a = scan.nextInt();
    b = scan.nextInt();
  
    System.out.println("Difference : " + Math.abs(a - b));
}
}
