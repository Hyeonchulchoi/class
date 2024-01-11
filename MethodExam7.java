package method;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class MethodExam7 {

	public static void main(String[] args) {
	 /*
	  * 1~100 사이의 임의의 값을 얻어서 answer에 저장한다
	  * 
	  */
		Scanner scan = new Scanner(System.in);
int answer =0;
int input =0;
System.out.println("1과 100 사이의 값을 입력하세요 : ");
input = scan.nextInt();
int count =0;

do {
	count++;
	answer =(int)(Math.random()*100)+1;
	System.out.println(answer);
	if(input == answer) {
		break;
	}
	
} while(true);
	System.out.println("도전 수 :"+count);
	}
	}
	
			
			
			
			
			