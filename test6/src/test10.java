
import java.util.Scanner;

class calculator2{
	int num1;
	int num2;
	int sum=0;
	int plus(int num1,int num2) {
		sum=num1+num2;
		return num1+num2;
		
	}
	int minus(int num1,int num2) {
		sum=num1-num2;
		return num1-num2;
	}
	int multi(int num1,int num2) {
		sum=num1*num2;
		return num1*num2;
	}
	int divi(int num1,int num2) {
		sum=num1/num2;
		return num1/num2;
	}
	int plus(int num1) {
		int temp=sum;
		sum=temp+num1;
		
		return temp+num1;
	}
	int minus(int num1) {
		int temp=sum;
		sum=temp-num1;
		return temp-num1;
	}
	int multi(int num1) {
		int temp=sum;
		sum=temp*num1;
		return temp*num1;
	}
	int divi(int num1) {
		int temp=sum;
		sum=temp/num1;
		return temp/num1;
	}

}
public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num;
		calculator2 c1=new calculator2();
		while(true) {

			System.out.println("���� �Դϴ�.");
			System.out.println("����� ���ϼ���");
			System.out.println("���ϱ�:1,����2,���ϱ�:3,������:4,����5");
			num=scan.nextInt();
			switch (num) {
			case 1: {
				if(c1.sum==0) {
					
					System.out.println("�� ���� �Է��ϼ���.");
					System.out.println("���= "+c1.plus(scan.nextInt(), scan.nextInt()));
				}else {
					System.out.println("���� �ϳ� �Է��ϼ���.");
					System.out.println("���= "+c1.plus(scan.nextInt()));
				}
				break;
			}
			case 2: {

				if(c1.sum==0) {
					
					System.out.println("�� ���� �Է��ϼ���.");
					System.out.println("���= "+c1.minus(scan.nextInt(), scan.nextInt()));
				}else {
					System.out.println("���� �ϳ� �Է��ϼ���.");
					System.out.println("���= "+c1.minus(scan.nextInt()));
				}

				break;
			}
			case 3: {

				if(c1.sum==0) {
					System.out.println("�� ���� �Է��ϼ���.");
					System.out.println("���= "+c1.multi(scan.nextInt(), scan.nextInt()));
				}else {
					System.out.println("���� �ϳ� �Է��ϼ���.");
					System.out.println("���= "+c1.multi(scan.nextInt()));
				}
				break;
			}
			case 4: {

				if(c1.sum==0) {
					
					System.out.println("�� ���� �Է��ϼ���.");
					System.out.println("��� = "+c1.divi(scan.nextInt(), scan.nextInt()));	
				}else {
					System.out.println("���� �ϳ� �Է��ϼ���.");
					System.out.println("���= "+c1.divi(scan.nextInt()));}
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
