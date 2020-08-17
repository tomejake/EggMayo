
public class test3 {

	static int minus(int num, int num2) {
		
		int result;
		
		if (num>num2) {
			result=num-num2;
		}else {
			result=num2-num;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minus(1,10));
		System.out.println(minus(2, 2));
		System.out.println(minus(7, 1));
		
	}

}
