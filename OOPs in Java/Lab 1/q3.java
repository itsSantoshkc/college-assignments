package main;

import java.util.Scanner;

class Main{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int a = 0,b = 0;
System.out.println("Enter two number");
    a = scan.nextInt();
    b = scan.nextInt();

    if(a > b){
      System.out.println("Positive difference : " + (a -b));
    }else{
      System.out.println("Positive difference : " + (b -a));
  }
}
}
