
import java.util.Scanner;


public class TestScanner2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������");
		
		double result1=input.nextDouble();
		
		System.out.println("ֵ"+result1);
		
		//�����ַ���
		
	    String result2 = input.next();
		System.out.println("ֵ"+result2);
		
		
		char result3 = input.next().charAt(0);
		
		System.out.println("ֵ"+result3);
		
		
	}
}