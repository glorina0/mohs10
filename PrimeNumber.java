import java.util.Scanner;
class Prime
{
public static void main(String[] args)
int a;
int count=0;
system.out.println("Enter any number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(i=1;i<a;i++)
{
if(a%i==0)
{
count++;
}
if(count==2)
system.out.println("Prime Number");
else
system.out.println("Not a prime Number");
}
}