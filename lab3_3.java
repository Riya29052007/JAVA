import java.util.Scanner;
public class lab3_3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		System.out.println("Enter the value of c:");
		int c=sc.nextInt();
		int max=((a>b && a>c)?a:((b>c) ? b:c));
		System.out.println("maximum"+max);
	}
}