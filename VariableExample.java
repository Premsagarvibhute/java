class VariableExample{
static int num = 55;
long numl = 63747437;
public void display(){

char a = 'M';
double num2 = 45.355;
System.out.println("local variable value : " +a);
System.out.println("local variable value : " +num2);
}
public static void calc(){
double b = 99.34;
double c = 45.23;
double res =b * c;
System.out.println("Result is : " +res);
}
public static void main(String args[]){
VariableExample obj = new VariableExample();
obj.display();
calc();
System.out.println("Instant variable value : "+obj.num);
System.out.println("Static variable value :" +num);
}}