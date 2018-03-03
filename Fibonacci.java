import java.io.*;
import java.util.*;
public class Fibonacci
{
	public static void main(String[] args)
	{
		int f1=0,f2=1,f3,i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number upto which Series has to be generated:");
		n=s.nextInt();
		System.out.println(f1+"\n"+f2);
		for(i=0;i<n-2;i++)
		{
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}
}