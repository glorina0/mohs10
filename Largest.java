import java.util.Scanner;
class Test
{
 public static void main(String args[])
{
int arr[]={2, 4, 10, 45};
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
if(max<arr[i])
{
max=arr[i];
}
}
System.out.print(max);
}
}