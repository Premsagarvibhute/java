import java.util.Scanner; //import scanner class of util package

class Conditional_Statement{
        public void calc(float x,float y){ //nonstatic method
              if(x > y){ //simple condition  
                 System.out.println("x is greater than y."); //true
}
              else{
                 System.out.println("x is not greater than y"); //false
}
}
        public static void main(String args[]){
			Scanner s = new Scanner(System.in); //creation of scanner object
			System.out.println("Enter number x:");
			float x = s.nextFloat();
			System.out.println("Enter number y:");
			float y = s.nextFloat();
			
			
              Conditional_Statement obj = new Conditional_Statement(); //object creation
              obj.calc(x,y); //invoke method with object 
}
}