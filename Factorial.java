import java.io.*;
import java.util.*;
public class Factorial
{
	public static void main(String[] args)
	{
		int fact=1,i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println("The Factorial is "+fact);
	}
}

		