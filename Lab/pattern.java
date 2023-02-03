
class Pattern
{
public static void main(String args[])// main method 
{
for(int i=1;i<=4;i++)//first loop statement i value 1 then read condition and goes to 2 loop 
{
for(int j=1;j<=i;j++)// in this condition j smaaler than i then it will print *
{
System.out.print("*");
}
System.out.println();
}
for(int i=1;i<=4;i++)
{
	for(int j=3;j>=i;j--)
	{
System.out.print("*");
	}		
	System.out.println();
}
}
}
