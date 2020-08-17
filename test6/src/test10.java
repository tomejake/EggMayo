
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

			System.out.println("계산기 입니다.");
			System.out.println("기능을 더하세요");
			System.out.println("더하기:1,빼기2,곱하기:3,나누기:4,종료5");
			num=scan.nextInt();
			switch (num) {
			case 1: {
				if(c1.sum==0) {
					
					System.out.println("두 수를 입력하세요.");
					System.out.println("결과= "+c1.plus(scan.nextInt(), scan.nextInt()));
				}else {
					System.out.println("수를 하나 입력하세요.");
					System.out.println("결과= "+c1.plus(scan.nextInt()));
				}
				break;
			}
			case 2: {

				if(c1.sum==0) {
					
					System.out.println("두 수를 입력하세요.");
					System.out.println("결과= "+c1.minus(scan.nextInt(), scan.nextInt()));
				}else {
					System.out.println("수를 하나 입력하세요.");
					System.out.println("결과= "+c1.minus(scan.nextInt()));
				}

				break;
			}
			case 3: {

				if(c1.sum==0) {
					System.out.println("두 수를 입력하세요.");
					System.out.println("결과= "+c1.multi(scan.nextInt(), scan.nextInt()));
				}else {
					System.out.println("수를 하나 입력하세요.");
					System.out.println("결과= "+c1.multi(scan.nextInt()));
				}
				break;
			}
			case 4: {

				if(c1.sum==0) {
					
					System.out.println("두 수를 입력하세요.");
					System.out.println("결과 = "+c1.divi(scan.nextInt(), scan.nextInt()));	
				}else {
					System.out.println("수를 하나 입력하세요.");
					System.out.println("결과= "+c1.divi(scan.nextInt()));}
				break;
			}case 5:{
				System.out.println("종료되었습니다.");
				break;
			}

			default:System.out.println("올바른 기능을 입력해주세요.");
			}
			if(num==5) {
				break;
			}


		}

	}

}
