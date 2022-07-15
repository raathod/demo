import java.util.*;
class A
{
public static void main(String z[])
{
int a,b,c;
Scanner S=new Scanner(System.in);

char d='y';
while(d=='y')
{
	System.out.println("Enter the first number");
	a=S.nextInt();
	System.out.println("Enter the secoand number:");
	b=S.nextInt();
	c=a+b;
	System.out.println("Addition"+c);	
	System.out.println("\n press y for continue");
	d=S.next().charAt(0);
}
}
}