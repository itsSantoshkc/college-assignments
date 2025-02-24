package main;

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int i = 1,n = 1;

    System.out.println("Enter any postive number ");
    n = scan.nextInt();

    for(i =1;i<=n;i = i + 4){
      System.out.print(i + "\t");
    }
  }
  }
