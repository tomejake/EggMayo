
import java.util.Scanner;

class calculator{
	int num1;
	int num2;

	int plus(int num1,int num2) {
		return num1+num2;
	}
	int minus(int num1,int num2) {
		return num1-num2;
	}
	int multi(int num1,int num2) {
		return num1*num2;
	}
	int divi(int num1,int num2) {
		return num1/num2;
	}

}
public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int num;
		calculator c1=new calculator();
		while(true) {

			System.out.println("���� �Դϴ�.");
			System.out.println("����� ���ϼ���");
			System.out.println("���ϱ�:1,����2,���ϱ�:3,������:4,����5");
			num=scan.nextInt();
			switch (num) {
			case 1: {
				System.out.println("�� ���� �Է��ϼ���.");
				System.out.println("���= "+c1.plus(scan.nextInt(), scan.nextInt()));
				break;
			}
			case 2: {

				System.out.println("�� ���� �Է��ϼ���.");
				System.out.println("���= "+c1.minus(scan.nextInt(), scan.nextInt()));

				break;
			}
			case 3: {

				System.out.println("�� ���� �Է��ϼ���.");
				System.out.println("���= "+c1.multi(scan.nextInt(), scan.nextInt()));
				break;
			}
			case 4: {

				System.out.println("�� ���� �Է��ϼ���.");
				System.out.println("��� = "+c1.divi(scan.nextInt(), scan.nextInt()));	
				break;
			}case 5:{
				System.out.println("����Ǿ����ϴ�.");
				break;
			}

			default:System.out.println("�ùٸ� ����� �Է����ּ���.");
			}
			if(num==5) {
				break;
			}


		}

	}

}
