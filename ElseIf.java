package Day4;
import java.util.*;
public class ElseIf {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the percentage of student");
		double percentage=sc.nextDouble();
		
		if(percentage>=90) {
			System.out.println("grade A");
		}else if(percentage>=80) {
				System.out.println("grade B");
		}else if(percentage>=70) {
			System.out.println("grade C");
	}	else if(percentage>=60) {
		System.out.println("grade D");
	}
	else {
		System.out.println("failed");
	}
				
				
			
			
		}
	}

