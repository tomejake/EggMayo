
class Tv{

	String com;
	int year;
	int inch;
	
	public Tv(String com, int year, int inch) {
		super();
		this.com = com;
		this.year = year;
		this.inch = inch;
	}

	void show()	{
		System.out.println(com+"제품으로"+year+"년도에 만들어졌으며 "+inch+"인치인 tv입니다.");
	}
	
}
class Remote{
	String com="삼성";
	
	void show() {
		System.out.println(com+" 리모컨입니다.");
	}
	Remote(){
		
	}
	public Remote(String com) {
		this.com=com;
	}
	
}

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Remote remote =new Remote();
		Tv tv=new Tv("삼성",2019,75);
		remote.show();
		tv.show();
		
	}

}
