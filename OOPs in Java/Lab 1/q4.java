package main;


import java.util.Scanner;

class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] marks = new int[5];
    int i=0,total_marks = 0;
    float percentage = 0f;
    String grade = "A";

    for(i = 0;i<5;i++){
      System.out.printf("Enter marks of subject %d : ",i + 1);
      total_marks += sc.nextInt();
    }
    percentage = total_marks * 100/500;

if(percentage > 90){
      grade = "A";
    }else if(percentage > 80 && percentage <= 90){
      grade = "B";
    }else if(percentage > 60 && percentage <= 80){
      grade = "C";
    }else if(percentage > 40 && percentage <= 60){
      grade = "D";
    }else{
      grade = "Fail";
    }


    System.out.println("Total secured marks : " + total_marks);
    System.out.println("Percentage : " + percentage);
    System.out.println("Grade : " + grade);
  }
}
