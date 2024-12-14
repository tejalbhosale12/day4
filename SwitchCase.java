package Day4;
import java.util.*;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number");
		int num1=sc.nextInt();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		
		switch (choice) {
		case 1:
			int add = num1+num2;
		
		System.out.println("result"+ add);
		break;
		
		case 2:
			int sub=num1-num2;
			System.out.println("result"+ sub);
			break;
			
		case 3:
			int mul=num1*num2;
			System.out.println("result"+ mul);
			break;
			
		case 4:
			int div=num1/num2;
			System.out.println("result"+ div);
			break;
			
		}
			
	}
}
