import java.util.Scanner;    //Scanner class imported to get user input

public class ScannerLaptopDemo {                 //class name declared
    public static void main(String[] args) {     // Main method declared
        Scanner scanner = new Scanner(System.in); // created object od scanner class to get user input
        int choice = 0;                           // integer variable of choice name
        
        do {                                        // looping of do while loop started
            System.out.println("Enter your choice:");  
            System.out.println("Add-1");
            System.out.println("Subtract-2");
            System.out.println("Multiply-3");
            System.out.println("Even/OddNumber-4");
            System.out.println("Quit-5");
            choice = scanner.nextInt();
            
            switch (choice) {                          // Switch statement declared 
                case 1:                                       // case1 declared for addition
                    System.out.println("Enter two numbers to be added:");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    int sum = num1 + num2;
                    System.out.println("The result is " + sum);
                    break;
                    
                case 2:                                       // case2 declared for substraction
                    System.out.println("Enter two numbers to be subtracted:");
                    int num3 = scanner.nextInt();
                    int num4 = scanner.nextInt();
                    int difference = num3 - num4;
                    System.out.println("The result is " + difference);
                    break;
                    
                case 3:                                       //case3 declared for multiplication
                    System.out.println("Enter two numbers to be multiplied:");
                    int num5 = scanner.nextInt();
                    int num6 = scanner.nextInt();
                    int product = num5 * num6;
                    System.out.println("The result is " + product);
                    break;
                    
                case 4:                                      //case4 declared for checking even or odd number
                    System.out.println("Enter numbers to check even or add:");
                    int num7 = scanner.nextInt();
                    if (num7 % 2 == 0) {
                        System.out.println(num7 + " is even.");
                    } else {
                        System.out.println(num7 + " is odd.");
                    }
                    break;
                    
                case 5:                                      //case5 declared for quiting program
                    System.out.println("Quitting program.");
                    break;
                    
                default:                                    //default case declared if case is not among the above cases
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 5);         // while statement declared 
    }
}
