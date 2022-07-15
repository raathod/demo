import java.util.*;
class A
{
public static void main(String d[])
{
Scanner m=new Scanner(System.in);
int a,i,b=1;
System.out.println("Enter  the number of table");
a=m.nextInt();
for(i=a;i<=a*10;i=i+a)
{
System.out.println(""+a+"*"+b++ +"="+i);
}
}
}