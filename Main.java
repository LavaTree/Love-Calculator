import java.lang.Math;
import java.util.Scanner;

class Main { 
  
   public static void main(String args[]) { 
    
    int max = 100; 
    int min = 0; 
    int range = max - min + 1; 

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the first name:"); 
    String firstLover = scan.nextLine();
    System.out.println("\n"); 

    System.out.println("Enter the second name:"); 
    String secondLover = scan.nextLine();
    System.out.println("\n");  

    int rand = (int)(Math.random() * range) + min; 
        
    System.out.println(firstLover + " and " + secondLover + " love percentage: " + rand + "%");
  
  
  
  } 

} 