package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiondemo {

	public static void main(String[] args) {
		Exceptiondemo ed=new Exceptiondemo();
		ed.divid();
		ed.add();
		ed.sub();
		
	}

	private void sub() {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a subration value");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int result=no1-no2;
		System.out.println(result);
	}

	private void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a addition value");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int result=no1+no2;
		System.out.println(result);
	}

	private void divid() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a divided value");
		try {
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int result=no1/no2;
		System.out.println(result);
		}
		catch(ArithmeticException ae)
		 {
		  System.out.println("no2 is zero. please check no2 value");
		divid();
		}
        catch(InputMismatchException im)
		{
        	System.out.println("you have wrong input");
        	divid();
		}
	}
	

}
