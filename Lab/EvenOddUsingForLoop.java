import java.util.Scanner;//import scanner class 
public class EvenOddUsingForLoop
{
   public static void main(String[] args)//main method
   {
      int i;//varible declare
      Scanner sc = new Scanner(System.in);//create object of scanner class 
      System.out.println("Enter number(max) to print all even and odd until: ");//
      int number = sc.nextInt();
      System.out.println("Even numbers from 1 to " + number +" are: " );
      for(i = 1; i <= number; i++)//decalre for loop until given value
      {
         if(i % 2 == 0)//if condition to check to check even no 
         {
            System.out.print(i + "\n");//print even number 
         }
      }
      System.out.println("Odd numbers from 1 to " + number + " are: ");
      for(i = 1; i <= number; i++)//declare for loop until given value 
      {
         if(i % 2 == 1)//if codition to check odd no 
         {
            System.out.print(i+"\n");//print odd no 
         }
      }
     
   }
}