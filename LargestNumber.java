package Day4;
import java.util.*;
public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter third number");
		int num3=sc.nextInt();
		
		if(num1>= num2 && num1>=num3) {
			System.out.println("the largest number is"+ num1);
		}else if(num2>=num1 && num2>=num3) {
			System.out.println("the largesr number is"+num2);
		}else {
			System.out.println("the largest number is"+num3);
		}
}
}