import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner salaryInput = new Scanner(System.in);
        
        System.out.print("Enter your salary: ");
        long salary = salaryInput.nextLong();
        
        float taxAmount = 0,payableAmount = 0;

        if (salary > 150000) {
            taxAmount = 0.25f * salary;  
            
        } else if(salary <=150000 && salary >100000) {
            taxAmount  = 0.15f * salary;  
        }else{
          taxAmount = 0;
    }
            payableAmount = salary - taxAmount;
        salaryInput.close(); 
    System.out.println("Salary after tax : " + payableAmount);
    }
}

