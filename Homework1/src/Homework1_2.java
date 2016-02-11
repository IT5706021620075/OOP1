import java.util.Scanner;
public class Homework1_2 {
	public static void main (String[]args){
		Scanner scan = new Scanner (System.in);
		int num1,num2,num3,num4,num5,num6,num7,num8,num9;
		
		System.out.println("Enter 9 Number of Dwarves 1-99 : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextInt();
		num5 = scan.nextInt();
		num6 = scan.nextInt();
		num7 = scan.nextInt();
		num8 = scan.nextInt();
		num9 = scan.nextInt();
		scan.close();
		

		if (100 == num1+num2+num3+num4+num5+num6+num7)
		System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7);
		
		else if (100 == num8+num2+num3+num4+num5+num6+num7+num8)
			System.out.println(num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num8);
		else if (100 == num9+num2+num3+num4+num5+num6+num7)
			System.out.println(num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num9);
		
		else if (100 == num1+num8+num3+num4+num5+num6+num7)
			System.out.println(num1+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num8);
		else if (100 == num1+num9+num3+num4+num5+num6+num7)
			System.out.println(num1+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num9);
		
		else if (100 == num1+num2+num8+num4+num5+num6+num7)
			System.out.println(num1+"\n"+num2+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num8);
		else if (100 == num1+num2+num9+num4+num5+num6+num7)
			System.out.println(num1+"\n"+num2+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num9);
		
		else if (100 == num1+num2+num3+num8+num5+num6+num7)
			System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num8);
		else if (100 == num1+num2+num3+num9+num5+num6+num7)
			System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num9);

		else if (100 == num1+num2+num3+num4+num8+num6+num7)
			System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num6+"\n"+num7+"\n"+num8);
		else if (100 == num1+num2+num3+num4+num9+num6+num7)
			System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num6+"\n"+num7+"\n"+num9);
		
		else if (100 == num1+num2+num3+num4+num5+num8+num7)
			System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num7+"\n"+num8);
		else if (100 == num1+num2+num3+num4+num5+num9+num7)
			System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num7+"\n"+num9);
		
		else if (100 == num1+num2+num3+num4+num5+num6+num8)
			System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num8);
		else if (100 == num1+num2+num3+num4+num5+num6+num9)
			System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num9);
		
		else if (100 == num8+num9+num3+num4+num5+num6+num7)
			System.out.println(num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num8+"\n"+num9);
		
		else if (100 == num1+num8+num9+num4+num5+num6+num7)
			System.out.println(num1+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num8+"\n"+num9);
		
		else if (100 == num1+num2+num8+num9+num5+num6+num7)
			System.out.println(num1+"\n"+num2+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num8+"\n"+num9);
		
		else if (100 == num1+num2+num3+num8+num9+num6+num7)
			System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num6+"\n"+num7+"\n"+num8+"\n"+num9);
		
		else if (100 == num1+num2+num3+num4+num8+num9+num7)
			System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num7+"\n"+num8+"\n"+num9);
		
		else if (100 == num1+num2+num3+num4+num5+num8+num9)
			System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num8+"\n"+num9);

		else if (100 == num9+num2+num3+num4+num5+num6+num8)
			System.out.println(num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num8+"\n"+num9);
		else System.out.println("Number > 100 or Number < 100" );
	}
}
