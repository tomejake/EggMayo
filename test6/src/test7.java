
public class test7 {

	
	static int max(int...num) {
		int temp=num[0];
		for (int i=0; i<num.length;i++) {
			if(temp<num[i]) {
				temp=num[i];
			}
		}
		
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(100,1,3,5,7));
		System.out.println(max(1));
		System.out.println(max(1,2,3,4,5,90,100,1001));
	}

}
