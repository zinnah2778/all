import java.util.Scanner;
public class SPLIT {
	public static void main(String args[])
	{
		System.out.println("Enter String");
		Scanner a=new Scanner(System.in);
		String str = a.nextLine();
		String [] arraySlit = str.split(" ",0);
		
		for (String c : arraySlit)
			System.out.println(c);
		a.close();
		
	}
}
