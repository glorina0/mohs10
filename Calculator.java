import java.util.Scanner;
class Test3
{
public static void main(String[]args)
{
scanner s=new scanner(system.in);
System.out.println("Select the operator +,-,*,%");
string a =s.next();
System.out.println("Enter two numbers");
int b=s.nextInt();
int c=s.nextInt();
switch(a)
{
case'-':
system.out.println(b-a);
break;
case'+':
systsem.out.println(b+a);
break;
case'*':
system.out.println(b*a);
break;
case'%':
system.out.println(b%a);
break;
default:
System.out.println("not a valid operator");
}
}
}