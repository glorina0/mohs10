package Practice2;

public class Reversestring {

	public static void main(String[] args) {
		String name="Glory";
		int leng=name.length();
		String rev="";
		for(int=leng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse of "+name+" is "+rev );
		
			
		

	}

}
