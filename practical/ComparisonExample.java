class ComparisonExample{
public void cal(){
int a=14,b=6;
System.out.println("a>b:"+(a>b));
System.out.println("a<b:"+(a<b));
System.out.println("a>=b:"+(a>=b));
System.out.println("a<=b:"+(a<=b));
System.out.println("a==b:"+(a==b));
System.out.println("a!=b:"+(a!=b));
System.out.println((a<b)&&(a++>b));
System.out.println((a>b)&(a++>b));
System.out.println((a>b)||(a<b));

}
public static void main(String args[]){
ComparisonExample obj=new ComparisonExample();
obj.cal();
}}
