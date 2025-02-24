class Main{
  public static void main(String[] args){
    int sum=0,i=0;

    do{
    if(i%2!=0){
      sum+= i;
      }
      i++;
      }while(i<100);
    
    System.out.println("Sum of odd numbers upto 100 : " + sum);

    }
  }
