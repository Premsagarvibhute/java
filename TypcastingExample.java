class TypcastingExample{
public static void main(String args[]){
//widening
int x = 890;
long z = x;
System.out.println(x); // automatically convrt int to long
System.out.println(z);
double y = x; //automatically convrt int to double
System.out.println(y);

// narrow

double a = 87.90;
int b = a; // automatically convrt double to int
System.out.println(a);
System.out.println(b);

}
}