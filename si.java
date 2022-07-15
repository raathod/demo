import java.util.Scanner;
class A
{
public static void main(String z[])
{
int si,principle,rate,time;
Scanner S=new Scanner(System.in);
System.out.println("principle");
principle=S.nextInt();
System.out.println("rate");
rate=S.nextInt();
System.out.println("time");
time=S.nextInt();
si=principle*rate*time/100;
System.out.println("Simple Intrest");
System.out.print(si);
}
}
