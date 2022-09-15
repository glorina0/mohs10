import java.util.Scanner;
class Add
{
public static void main(String[]args)
{
Scanner s= new Scanner(System.in);
int a,sum=0;
System.out.println("Enter the Number");
a=s.nextInt();
for(inti=1;i<=a;i++)
{
sum=sum+1;
}
System.out.println("Sum of all numbers"+sum);
}
}