

import java.util.ArrayList;
import java.util.Scanner;

class User{
	String name;
	String phone;
	String movie="";
	public User(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public User(String name, String phone,String movie) {
		super();
		this.name = name;
		this.phone = phone;
		this.movie=movie;
	}

	User(){

	}
}
class Movie{
	static String name1="������ �����";
	static String name2="�ܿ�ձ�";
	static String name3="�����";
	static String name4="����";



	static void show() {
		System.out.println("1."+name1);
		System.out.println("2."+name2);
		System.out.println("3."+name3);
		System.out.println("4."+name4);
	}
}

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp;
		String temp2;
		int index = 5;
		boolean bool=true;
		ArrayList<User> user=new ArrayList<User>();
		user.add(new User("ȫ�浿","01011112222","������ �����"));
		user.add(new User("�Ӳ���","01033334444","����"));
		user.add(new User("����ǳ","01055556666","�����"));

		Scanner scan= new Scanner(System.in);
		Scanner scanint=new Scanner(System.in);

		while(bool) {

			System.out.println("cgv-��û�� ���� �ý����Դϴ�.");
			System.out.println("������� �̸��� �޴��� ��ȣ�� ���ʴ�� �Է����ּ���.");
			temp=scan.nextLine();
			temp2=scan.nextLine();

			int size=user.size();
			for (int i = 0; i <size; i++) {
				if((user.get(i).name.equals(temp)&&user.get(i).phone.equals(temp2))) {
					System.out.println("�̹� ��ϵ� ȸ���Դϴ�.");
					index=i;
					break;
				}else if(i==user.size()-1) {
					user.add(new User(temp,temp2));
					System.out.println("����ڸ� �߰��ϰڽ��ϴ�.");
					index=user.size()-1;
				}
			}
			System.out.println("����� �������ּ���.");
			System.out.println("����1, ��ȸ2, ���:3, ����4");

			switch (scanint.nextInt()) {
			case 1: {
				System.out.println("��ȭ�� �������ּ���");
				Movie.show();

				switch (scanint.nextInt()) {
				case 1: {
					
					user.get(index).movie=Movie.name1;
					break;
				}
				case 2: {
					user.get(index).movie=Movie.name2;
					break;
				}
				case 3: {
					user.get(index).movie=Movie.name3;
					break;
				}
				case 4: {
					user.get(index).movie=Movie.name4;
					break;
				}
				default:
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
				}

			}
			case 2: {
				if(index<user.size()&&user.get(index).movie.equals("")) {
					System.out.println("�����Ͻ� ��ȭ�� �����ϴ�.");
					
				}else {
					System.out.println("�����Ͻ� ��ȭ�� "+user.get(index).movie+"�Դϴ�.");
					
				}
				break;
			}
			case 3: {
				System.out.println(user.get(index).name+"���� �����Ͻ� ��ȭ��"+user.get(index).movie+"�Դϴ�.");
				System.out.println("����Ͻðڽ��ϱ�? 0�� ��� 1�� ���α�");
				switch (scanint.nextInt()) {
				case 0:
					user.get(index).movie="";
					System.out.println("�����Ǿ����ϴ�.");
					break;

				case 1:
					break;
				}
				
				break;
			}
			case 4: {
				System.out.println("�����ϰڽ��ϴ�.");
				bool=false;
				break;
			}


			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}


		}




	}

}
