import java.util.*;
class A
{
public static void main(String z[])
{
int a,b,c;
Scanner S=new Scanner(System.in);
System.out.println("Enter Number 1:\t");
a=S.nextInt();
System.out.println("Enter Number 2:\t");
b=S.nextInt();
c=a;	
a=b;
b=c;

System.out.println("Enter Number a=:"+a+"b=:\t" +b);
}
}