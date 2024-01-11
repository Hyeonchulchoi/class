package method;


public class MethodExam4 {

	public static void main(String[] args) {
	 /*
	  * 문제 6
	  * 홍길동과 홍길순이가 가위(s), 바위(r), 보(p) 게임을 한다.
	  * r,p,s 중 하나를 입력해 승자 또는 무승부 출력하는 프로그램
	  * 홍길동 :r
	  * 홍길순 :s
	  * 홍길동 승1
	  */
	
		//랜덤 숫자
	int x =(int)(Math.random()*3)+1;
	int y =(int)(Math.random()*3)+1;
	//출력
	System.out.print("현철 : ");
	rock(x);
	System.out.print("컴퓨터 : ");
	rock(y);
	System.out.print("나의 : ");p(x,y);
	}
	
	public static void rock(int i) { //랜덤 숫자를 가위, 바위, 보 로 변경
	switch (i) {
	case 1 : System.out.println("가위");
		break;
	case 2 : System.out.println("주먹");
		break;
	case 3 :System.out.println("보");
break;
	}
	
}
	public static void p(int x,int y) {
		if(x==y) {// 무승부 
			System.out.println("무승부");
		}
		else if((x==1&&y==3)||(x==2&&y==1)||x==3&&y==2) { //승
			System.out.println("승");
		}
		else { //패
			System.out.println("패");
			}
	}
}
