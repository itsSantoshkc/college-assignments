import java.util.Scanner;

class Main{
  public static void main(String[] args){
    int i =0;

    System.out.println("Using For Loop");
    for(i=201;i<=300;i++){
      System.out.print(i + "\t");
  }
    System.out.println("\nUsing While Loop");
    i = 201;
    while(i<=300){
      System.out.print(i + "\t");
      i++;
    }
    i = 201;
    System.out.println("\nUsing Do-While Loop");
    do{
      System.out.print(i + "\t");
      i++;
      }while(i<=300);
}
}
