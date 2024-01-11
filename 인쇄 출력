  package method;

import java.awt.image.MultiResolutionImage;
import java.util.Scanner;

public class MethodExam2 {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	printShow(1);
	System.out.println("몇 장 출력 하시겠습니까? >>>");
	int x = scan.nextInt();
	System.out.println("인쇄 방식 : 1. 단면 |2. 양면");
	int y = scan.nextInt();
	printf(y);
	
	printHo(x);
  }
  public static void printf(int y) {
		switch (y) {
		case 1:  System.out.println("단면 출력중 !!");
		break;
		case 2 : System.out.println("양면 출력중 !!");
			break;
    }
  }
  public static void printHo(int volume) {
	
	int paper =10; //프린터 안 종이 수
	if(volume<=paper) {// 종이 충족시
	for (int i=1; i<=volume;i++) {
		System.out.println(+i+ "째 장출력중");
	}
		;}
	else { //종이 부족 시
		for(int i=1; i<=paper;i++) {
			System.out.println(+i+ "째 장출력중");
		}
			System.out.println("------------------------------------------ ");
			System.out.println("종이 부족 ");
			System.out.println("프린터 미수 몇장 :"+ (volume-paper));
	}
	
}
}
