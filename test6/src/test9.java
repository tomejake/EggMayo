
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

			System.out.println("계산기 입니다.");
			System.out.println("기능을 더하세요");
			System.out.println("더하기:1,빼기2,곱하기:3,나누기:4,종료5");
			num=scan.nextInt();
			switch (num) {
			case 1: {
				System.out.println("두 수를 입력하세요.");
				System.out.println("결과= "+c1.plus(scan.nextInt(), scan.nextInt()));
				break;
			}
			case 2: {

				System.out.println("두 수를 입력하세요.");
				System.out.println("결과= "+c1.minus(scan.nextInt(), scan.nextInt()));

				break;
			}
			case 3: {

				System.out.println("두 수를 입력하세요.");
				System.out.println("결과= "+c1.multi(scan.nextInt(), scan.nextInt()));
				break;
			}
			case 4: {

				System.out.println("두 수를 입력하세요.");
				System.out.println("결과 = "+c1.divi(scan.nextInt(), scan.nextInt()));	
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
