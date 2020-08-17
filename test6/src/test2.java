
public class test2 {

	static void exerciseMs(String ...str){
		
		for (String moon : str) {
			
			System.out.println(moon+" 연습");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		exerciseMs("자바");
		exerciseMs("자바","안드로이드","컴퓨터");
		
	}

}
