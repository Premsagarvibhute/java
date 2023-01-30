import java.util.Scanner; //import scanner class of util package

class Conditional_Statement{
        public void calc(float x, float y){ //nonstatic method
              if(x > y){ //simple condition  
                 System.out.println("x is greater than y."); //true
}
              else{
                 System.out.println("x is not greater than y"); //false
}
}
        public static void main(String args[]){
			Scanner s = new Scanner(System.in); //creation of scanner object
			System.out.println("Enter number 1");
			float x = s.nextFloat();
			System.out.println("Enter number 2");
			float y = s.nextFloat();
			
			
              ConditionalStatement obj = new ConditionalStatement(); //object creation
              obj.calc(x,y); //invoke method with object 
}
}