package main;

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int n = 0,i = 0;
    System.out.println("Enter any postive number : "); 
    n = scan.nextInt();
    while(i<=n){
      System.out.print(i + "\t");
      i++;
    }

  }}
