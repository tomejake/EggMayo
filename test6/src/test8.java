
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
		System.out.println(com+"��ǰ����"+year+"�⵵�� ����������� "+inch+"��ġ�� tv�Դϴ�.");
	}
	
}
class Remote{
	String com="�Ｚ";
	
	void show() {
		System.out.println(com+" �������Դϴ�.");
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
		Tv tv=new Tv("�Ｚ",2019,75);
		remote.show();
		tv.show();
		
	}

}
