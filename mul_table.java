import java.util.*;
import java.lang.*;
class MAin
{
 public static void main(String args[])
 {
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	n=sc.nextInt();
	System.out.println("The ultiplication table of"+n+"is...:");
	for(i=1;i<=n;i++)
	{
		System.out.println(n+i+"="+n*i);
	}
 }
}