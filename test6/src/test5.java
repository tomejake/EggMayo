
class TvSam{
	String com;
	String name;
	String color;
	int size;
	int vol=25;
	int cha=25;
	boolean swit;
	
	

	void volChange(String vol) {
		
		if(vol.equals("+")) {
			this.vol++;
		}else if(vol.equals("-")) {
			this.vol--;
		}else {
			System.out.println("�߸��� �Է�");
		}
	}
	
	void chaChange(String cha) {
		if(cha.equals("+")) {
			this.cha++;
		}else if(cha.equals("-")) {
			this.cha--;
		}else {
			System.out.println("�߸��� �Է�");
		}
	}
	void switChange() {
		swit=!swit;
	}
	
}
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
