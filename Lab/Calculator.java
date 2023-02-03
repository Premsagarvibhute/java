import java.util.Scanner;//
class Calculator
{
public static void main(String args [])//main method
{
Scanner s=new Scanner(System.in);   //create scanner object
System.out.println("Enter First No"); //input first value 
int no1=s.nextInt();
System.out.println("Enter Second No");  // input second value 
int no2=s.nextInt();
System.out.println("Select Symbol (+,-,*,/)"); // symbol for use in calculator
String symbol=s.next();
int res;// varible
switch(symbol)
{
case "+": //create case for addition
res=no1+no2;
System.out.println("Addition is:"+res);
break;
case "-":res=no1-no2;//create case for Subtraction 
System.out.println("Subtraction is:"+res);
break;
case "*": res=no1*no2;//create case for Multiplication 
System.out.println("Multiplication is:"+res);
break;
case "/": res=no1/no2; //create case for division
System.out.println("Division is:"+res);
break;
default:
System.out.println("Invalid input");


}

}
}

