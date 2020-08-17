

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
	static String name1="남산의 부장들";
	static String name2="겨울왕국";
	static String name3="기생충";
	static String name4="괴물";



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
		user.add(new User("홍길동","01011112222","남산의 부장들"));
		user.add(new User("임꺽정","01033334444","괴물"));
		user.add(new User("강태풍","01055556666","기생충"));

		Scanner scan= new Scanner(System.in);
		Scanner scanint=new Scanner(System.in);

		while(bool) {

			System.out.println("cgv-충청점 에약 시스템입니다.");
			System.out.println("사용자의 이름과 휴대폰 번호를 차례대로 입력해주세요.");
			temp=scan.nextLine();
			temp2=scan.nextLine();

			int size=user.size();
			for (int i = 0; i <size; i++) {
				if((user.get(i).name.equals(temp)&&user.get(i).phone.equals(temp2))) {
					System.out.println("이미 등록된 회원입니다.");
					index=i;
					break;
				}else if(i==user.size()-1) {
					user.add(new User(temp,temp2));
					System.out.println("사용자를 추가하겠습니다.");
					index=user.size()-1;
				}
			}
			System.out.println("기능을 선택해주세요.");
			System.out.println("예약1, 조회2, 취소:3, 종료4");

			switch (scanint.nextInt()) {
			case 1: {
				System.out.println("영화를 선택해주세요");
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
					System.out.println("잘못된 입력입니다.");
					break;
				}

			}
			case 2: {
				if(index<user.size()&&user.get(index).movie.equals("")) {
					System.out.println("예약하신 영화가 없습니다.");
					
				}else {
					System.out.println("예약하신 영화는 "+user.get(index).movie+"입니다.");
					
				}
				break;
			}
			case 3: {
				System.out.println(user.get(index).name+"님이 예약하신 영화는"+user.get(index).movie+"입니다.");
				System.out.println("취소하시겠습니까? 0은 취소 1은 냅두기");
				switch (scanint.nextInt()) {
				case 0:
					user.get(index).movie="";
					System.out.println("삭제되었습니다.");
					break;

				case 1:
					break;
				}
				
				break;
			}
			case 4: {
				System.out.println("종료하겠습니다.");
				bool=false;
				break;
			}


			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}


		}




	}

}
