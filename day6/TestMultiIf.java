
import java.util.Scanner;


public class TestMultiIf{
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int money =input.nextInt();
	
	/* 
	  �����500������˹��˹
	  
	  ���������100����GTR
	  ���������50���򱼳�E
	  ���������20�������
	  ���������10�򣬹���H6
	  ���������1�򣬵綯��
	  ���򣬽ݰ������г�
	  
	  
	  */
	  
	  if (money >=500){
		  System.out.println("��˹��˹");
	  }
	  else if (money>=100){
		  System.out.println("GTR");
	  }
	  else if (money>=50){
		  System.out.println("����e");
	  }
	  else if (money >=20){
		  System.out.println("����");
	  }
	  else if (money>=10){
		  System.out.println("��˹��˹");
	  }
	  else if (money >=1){
		  System.out.println("����H6");
	  }
	  else {
		  System.out.println("���г�");
	  }
	System.out.println("�������...");
	}
}