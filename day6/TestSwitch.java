public class TestSwitch{
	public static void main(String[] args){
		
		//�ж�һ��ʳ��
		//ÿ���ʲô
		/* 
		  ��һ��ˮ����
		  �ܶ���������
		  ���������
		  ���ģ����з�
		  ���壺���
		  ���������
		  ���գ��ȸ���
		*/
		
		
		int weekDay =4 ;
		
		switch (weekDay){
			case 1:
				System.out.println("ˮ����");
				break;
				
			case 2:
				System.out.println("������");
				break;
				
			case 3:
				System.out.println("���");
				break;
				
			case 4:
				System.out.println("���з�");
				break;
				
			case 5:
				System.out.println("���");
				break;
				
			case 6:
				System.out.println("���");
				break;
				
			case 7:
				System.out.println("�ȸ���");
				break;
				
			default:
				System.out.println("����������ѡ��1-7֮�������");
		}
		
		System.out.println("�������...");
		
		char c='A';
		
		switch (c){
			
			case 'A':
				System.out.println("���A");
				break;
				
		}
		
		String str="����һ";
		
		switch (str){
			
			case "����һ":
				System.out.println("�����ˮ����");
				break;
			
		}
		
		
	}
}